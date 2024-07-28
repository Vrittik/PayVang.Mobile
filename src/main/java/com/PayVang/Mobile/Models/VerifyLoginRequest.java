package com.PayVang.Mobile.Models;

public class VerifyLoginRequest {
	
    private String encryptedKey;
    private String otp;

    // Getters and setters
    public String getEncryptedKey() {
        return encryptedKey;
    }

    public void setencryptedKey(String encryptedKey) {
        this.encryptedKey = encryptedKey;
    }

    public String getOTP() {
        return otp;
    }

    public void setOTP(String otp) {
        this.otp = otp;
    }
}
