package com.PayVang.Mobile.Domain;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PayVang.Mobile.CustomExceptions.InvalidRequestException;
import com.PayVang.Mobile.CustomExceptions.UnauthorizedException;
import com.PayVang.Mobile.DataAccess.Models.LoginDetails;
import com.PayVang.Mobile.DataAccess.Repositories.LoginDetailRepository;
import com.PayVang.Mobile.DataAccess.Repositories.UserRepository;
import com.PayVang.Mobile.Models.ChangePasswordRequest;
import com.PayVang.Mobile.Models.EncryptedKeyGenericResponse;
import com.PayVang.Mobile.Models.ForgotPasswordRequest;
import com.PayVang.Mobile.Models.LoginRequest;
import com.PayVang.Mobile.Models.TriggerOtpRequest;
import com.PayVang.Mobile.Models.VerifyLoginRequest;
import com.PayVang.Mobile.Util.AESEncryptUtility;
import com.PayVang.Mobile.Util.PasswordHasher;
import com.PayVang.Mobile.Util.UserStatusType;

@Service
public class AccountsService {
	
    private EmailService emailService;
    private OtpService otpService;
    private LoginDetailRepository loginDetailRepository;
    private UserRepository userRepository;   
    
    public AccountsService(EmailService emailService, OtpService otpService, LoginDetailRepository loginDetailRepository,
    		UserRepository userRepository) 
    {
        this.emailService = emailService;
        this.otpService = otpService;
        this.loginDetailRepository = loginDetailRepository;
        this.userRepository = userRepository;
    }

    public EncryptedKeyGenericResponse authenticateUser(LoginRequest loginRequest) {
    	
    	if(loginRequest.getUsername() == null || loginRequest.getPassword() == null)
    	{
    		throw new InvalidRequestException("Incorrect Payload, Please provide the username and password.");
    	}
    	
    	var username = loginRequest.getUsername();
    	var password = loginRequest.getPassword();
    	
    	var user = userRepository.findByEmailId(username);
    	if (user == null)
    	{
    		throw new UnauthorizedException("Username is Invalid, Please Try Again.");
    	}
    	
    	String userStatus = user.getUserStatus().getStatus();
    	String activeStatus = UserStatusType.ACTIVE.getStatus();
    	
		if (!userStatus.equals(activeStatus))
		{
			throw new UnauthorizedException("User status is either inactive, Blocked or suspended");
		}
		
    	// write password extract logic
    	var userDBPassword = user.getPassword();
    	password = PasswordHasher.hashPassword(password,user.getAppId());
        if (password.equals(userDBPassword)) {
            // Generate OTP
            String otp = OtpService.generateOTP();
            // Check if login detail already exists
            LoginDetails loginDetail = loginDetailRepository.findByUsername(username);
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime expiryTime = now.plusMinutes(3); // Time set to 3 minutes

            if (loginDetail == null) {
                // Create new login detail entry
                loginDetail = new LoginDetails();
                loginDetail.setUsername(username);
                loginDetail.setOtp(otp);
                loginDetail.setExpiryTime(expiryTime);
            } else {
                // Update existing login detail entry
                loginDetail.setOtp(otp);
                loginDetail.setExpiryTime(expiryTime);
            }

            // Save login detail
            loginDetailRepository.save(loginDetail);
            
            // send email for OTP, TODO: make template for it
            emailService.sendEmail(username, "OTP for login in PayV Mobile", "Here is your OTP(One Time Password) for"
            		+ " logging into PayV Mobile - " + otp);
            
            String encryptedUsername = AESEncryptUtility.encrypt(username);
            EncryptedKeyGenericResponse response = new EncryptedKeyGenericResponse();
            response.setEncryptedKey(encryptedUsername);
            response.setComment("OTP is sent to customer's email address.");
            return response;
        }
        else {
        	throw new UnauthorizedException("Incorrect Password! Please try again.");
		}
    }
    
    public String verifyLogin(VerifyLoginRequest verifyLoginRequest) {
    	if(verifyLoginRequest.getEncryptedKey() == null || verifyLoginRequest.getOTP() == null)
    	{
    		throw new InvalidRequestException("Incorrect Payload, Please provide the encrypted key and OTP.");
    	}
    	
    	try {
    		 String decryptedUsername = AESEncryptUtility.decrypt(verifyLoginRequest.getEncryptedKey());
    		 String otp = verifyLoginRequest.getOTP();
    		 
    		 if(decryptedUsername == null) {
    			 throw new UnauthorizedException("The encrypted username is incorrect.");
    		 }
    		 
    		 var loginDetails = loginDetailRepository.findByUsername(decryptedUsername);
    		 
    		 
    		 if(loginDetails == null) {
    			 throw new UnauthorizedException("User doesn't exists.");
    		 }
    		 
    		 
    		 if(!otp.equals(loginDetails.getOtp()))
    		 {
    			 throw new UnauthorizedException("OTP is not correct.");
    		 }
    		 
    		 if(loginDetails.getExpiryTime().isBefore(LocalDateTime.now()))
    		 {
    			 throw new UnauthorizedException("OTP has expired.");
    		 }
    		 
    		 return "Successfully logged in";
    	}
    	catch (Exception e) {
    		throw e;
		}
    }
    
    public EncryptedKeyGenericResponse forgotPassword(ForgotPasswordRequest forgotPasswordRequest) {
    	var username = forgotPasswordRequest.getUsername();
    	
    	var user = userRepository.findByEmailId(username);
    	if(user == null)
    	{
    		throw new InvalidRequestException("Invalid Username");
    	}
    	TriggerOtpRequest otpRequest = new TriggerOtpRequest();
    	otpRequest.setRecipient(username);
    	otpRequest.setEmailBodyCore("Password Reset");
    	otpRequest.setEmailSubject("Otp for resetting Pay Vang Mobile app password");
    	
    	return otpService.triggerOtp(otpRequest);
    }
    
    public String changePassword(ChangePasswordRequest changePasswordRequest) {
    	try {
	    	var encryptedUserName = changePasswordRequest.encryptedUserName;
	    	var username = AESEncryptUtility.decrypt(encryptedUserName);
	    	
	    	var user = userRepository.findByEmailId(username);
	    	if(user == null)
	    	{
	    		throw new InvalidRequestException("Invalid encrypted username.");
	    	}
	    	
	    	String newPassword = PasswordHasher.hashPassword(changePasswordRequest.getNewPassword(),user.getAppId());
	    	userRepository.updatePasswordByEmail(username, newPassword);
	    	return "Password reset successfull";
    	}
    	catch (Exception e) {
			throw e;
		}
    }
    
}
