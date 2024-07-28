package com.PayVang.Mobile.Models;

public class ChangePasswordRequest {

	public String encryptedUserName;
	public String newPassword;
	public String getEncryptedUserName() {
		return encryptedUserName;
	}
	public void setEncryptedUserName(String encryptedUserName) {
		this.encryptedUserName = encryptedUserName;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
}
