package com.PayVang.Mobile.Util;

public enum UserStatusType {

	ACTIVE				(101,"ACTIVE"),                // All previledges active
	PENDING		        (102,"PENDING"),         // Login blocked but transactions active
	TRANSACTION_BLOCKED	(103,"TRANSACTION_BLOCKED"),   // Transactions are blocked but user can login and view details
	SUSPENDED			(104,"SUSPENDED"),         	   // The user is blocked temporarily for both transactions and login
	TERMINATED			(105,"TERMINATED");   		   // The user is terminated and blacklisted for all operations

	private final int statusCode;
	private final String status;

	private UserStatusType(int statusCode,String status){
		this.statusCode = statusCode;
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public int getStatusCode() {
		return statusCode;
	} 

}