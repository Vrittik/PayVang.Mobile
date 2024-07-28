package com.PayVang.Mobile.Models;

public class ValidateOtpRequest {
	private String encryptedRecipient;
    private String otp;

    // Getters and setters
    public String getEncryptedRecipient() {
        return encryptedRecipient;
    }

    public void setEncryptedRecipient(String encryptedRecipient) {
        this.encryptedRecipient = encryptedRecipient;
    }

    public String getOTP() {
        return otp;
    }

    public void setOTP(String otp) {
        this.otp = otp;
    }
}
