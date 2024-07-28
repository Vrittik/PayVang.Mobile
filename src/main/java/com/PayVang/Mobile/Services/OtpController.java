package com.PayVang.Mobile.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PayVang.Mobile.Domain.OtpService;
import com.PayVang.Mobile.Models.EncryptedKeyGenericResponse;
import com.PayVang.Mobile.Models.ValidateOtpRequest;

@RestController
public class OtpController {
	
	@Autowired
	private OtpService otpService;
	
    @PostMapping("/validateotp")
    public EncryptedKeyGenericResponse validateOtp(@RequestBody ValidateOtpRequest validateOtpRequest) {
        return otpService.validateOtp(validateOtpRequest);
    }
}