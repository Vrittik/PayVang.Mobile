package com.PayVang.Mobile.Constants;

public enum Constants {
	
	CRM_LOG_USER_PREFIX	("userId"),
	CRM_LOG_PREFIX		("CRM~"),
	PG_LOG_PREFIX		("PG~"),
	CARD_STARS			("******"),
	COMMA				(" , "),
	EQUATOR				("="),
	SEPARATOR			("~"),
	MAX_NUMBER_OF_KEYS	("100"),
	TRUE 				("1"),
	FALSE				("0"),
	FIELDS				("FIELDS"),
	TRANSACTIONSTATE_N	("INVALID REQUEST"),
	LAST_LOGIN          ("LAST_LOGIN"),
	LAST_LOGIN_IP       ("LAST_LOGIN_IP"),
	LAST_LOGIN_STATUS   ("LAST_LOGIN_STATUS"),
	USER				("USER"),
	USERTYPE			("USER_TYPE"),
	SALT_LENGTH         ("16"),
	BLANK_REPLACEMENT_STRING  (""),
	SALT_FILE_PATH_NAME ("SaltFile"),
	KEY_FILE_PATH_NAME ("KeyFile"),
	HIBERNATE_CONFIG_FILE ("HibernateConfigFile"),
	PAYMENT_TYPE		("PAYMENT_TYPE"),
	PAYMENT_TYPE_MOP 	("PAYMENT_TYPE_MOP"),
	CARD_PAYMENT_TYPE_MOP 	("CARD_PAYMENT_TYPE_MOP"),
	TOKEN 				("TOKEN"),
    EXPRESS_PAY_FLAG	("EXPRESS_PAY_FLAG"),
	DIRECPAY_SEPARATOR  ("|"),
	YESBANK_SEPARATOR   ("&"),
	KOTAK_SEPARATOR   	("|"),
	CUSTOM_TOKEN  		("customToken"),
	QUOTES  			("'"),
	AMEX_SEPARATOR		("&"),
	IFRAME_PAYMENT_PAGE ("IFRAME_PAYMENT_PAGE"),
	TRANSACTION_COMPLETE_FLAG   ("INTERNAL_TXN_COMPLETE_FLAG"),
	Y_FLAG                      ("Y"),
	N_FLAG                      ("N"),
	USER_PERMISSION   	        ("USER_PERMISSION"),
	COUNT                       ("Count"),
	FSS_RETURN_URL_NAME         ("Request3DSURL"),

	//Acquirer Supported MOP
	CITRUS_NETBANKING_SUPPORTED_BANK ("CITRUSNB"),
	DIRECPAY_NETBANKING_SUPPORTED_BANK ("DIRECPAYNB"),
	
	//Recurring payments
	DAILY_CRON_STRING           	("DailyCronString"),
	RECURRING_PAYMENT_JOB			("recurringPaymentJob"),
	RECURRING_PAYMENT_JOB_TRIGGER  	("recurringPaymentJobTrigger"),
	CITRUSPAY						("citruspay"),
	CITRUSPAY_TRIGGER	         	("citruspayTrigger"),
	
	//Recurring payments
	EVERY_3HR_CRON_STRING			("Every3HrCronString"),

	// CronJob Status
	STATUS_PAYMENT_JOB             ("statusPaymentJob"), 
	STATUS_PAYMENT_JOB_TRIGGER     ("statusPaymentJobTrigger"), 
	STATUS                         ("status"),
	STATUS_TRIGGER                 ("statusTrigger"),
	
	// CRM web service
	CRM_SERVICE_LOG_USER_PREFIX ("Log in from CRM web service: appId"),
	CRM_APP_SALT_FILE_PATH_NAME ("CrmAppSaltFile"),
	SUBTRACTION_SIGN            ("-"),
	//help ticket
	HELPTICKET					("HelpTicket"),
	
	//fraud prevention module
	PG_FRAUD_TYPE				("FRAUD_TYPE");


	
	private final String value; 
	
	private Constants(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}	
}
