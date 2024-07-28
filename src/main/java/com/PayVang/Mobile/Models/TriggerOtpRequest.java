package com.PayVang.Mobile.Models;

public class TriggerOtpRequest {

	public String getRecipient() {
		return Recipient;
	}
	public void setRecipient(String recipient) {
		Recipient = recipient;
	}
	public String getEmailBodyCore() {
		return emailBodyCore;
	}
	public void setEmailBodyCore(String emailBodyCore) {
		this.emailBodyCore = emailBodyCore;
	}
	public String getEmailSubject() {
		return emailSubject;
	}
	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}
	public String Recipient;
	public String emailBodyCore;
	public String emailSubject;
}
