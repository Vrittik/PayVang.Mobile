package com.PayVang.Mobile.Domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Async
	public void sendEmail(String receiver, String subject, String body) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(""); // Add your SMTP UserName here
		message.setTo(receiver);
		message.setSubject(subject);
		message.setText(body);
		mailSender.send(message);
	}
}