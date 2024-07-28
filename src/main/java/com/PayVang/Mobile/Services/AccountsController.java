package com.PayVang.Mobile.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PayVang.Mobile.Domain.AccountsService;
import com.PayVang.Mobile.Models.ChangePasswordRequest;
import com.PayVang.Mobile.Models.EncryptedKeyGenericResponse;
import com.PayVang.Mobile.Models.ForgotPasswordRequest;
import com.PayVang.Mobile.Models.LoginRequest;
import com.PayVang.Mobile.Models.VerifyLoginRequest;

@RestController
public class AccountsController {

    @Autowired
    private AccountsService accountsService;
    
    @PostMapping("/login")
    public EncryptedKeyGenericResponse login(@RequestBody LoginRequest loginRequest) {
        return accountsService.authenticateUser(loginRequest);
    }
    
    @PostMapping("/verifylogin")
    public String login(@RequestBody VerifyLoginRequest verifyLoginRequest) {
        return accountsService.verifyLogin(verifyLoginRequest);
    }
    
    @PostMapping("/forgotpassword")
    public EncryptedKeyGenericResponse forgotPassword(@RequestBody ForgotPasswordRequest forgotPasswordRequest) {
        return accountsService.forgotPassword(forgotPasswordRequest);
    }
    
    @PostMapping("/changepassword")
    public String forgotPassword(@RequestBody ChangePasswordRequest changePasswordRequest) {
        return accountsService.changePassword(changePasswordRequest);
    }
}