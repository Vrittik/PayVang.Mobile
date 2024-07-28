package com.PayVang.Mobile.Constants;

import com.PayVang.Mobile.Properties.PropertiesManager;

public enum ConfigurationConstants {

	//Database connection properties
	PAYMENT_PAGE_MANDATORY_FIELDS	("PaymentPageMandatoryFields"),
	DB_URL							("DBURL"),
	DB_USER							("DBUser"),
	DB_PASSWORD						("DBPassword"),
	DB_DRIVER						("DBDriver"),
	DB_ALLREQUESTSTRINGFIELDS		("DBAllRequestStringFields"),
	
	//Security Configurations
	HASHING_ALGORITHAM				("HashingAlgoritham"),
	FIELD_SEPARATOR					("FieldSeparator"),
	FIELD_EQUATOR					("FieldEquator"),
	REQUEST_FIELDS					("RequestFields"),
	RESPONSE_FIELDS					("ResponseFields"),
	IS_DEBUG						("IsDebug"),
	SECURE_REQUEST_FIELDS			("SecureRequestFields"),
	DUPLICATE_ON_ORDER_ID			("AllowDuplicateOnOrderId"),
	ALLOW_FAILED_HASH				("AllowFailedHash"),

	//FSS fields
	FSS_MANDATORY_FIELDS_ENROLL		("FSSMandatoryFieldsEnroll"),
	FSS_ENROLLMENT_URL				("FSSEnrollmentUrl"),
	FSS_PARES_AUTHENTICATION_URL	("FSSParesAuthorizationUrl"),
	FSS_AUTHORIZATION_URL			("FSSAuthorizationUrl"),
	FSS_SUPPORT_TRANSACTION_URL		("FssSupportTransactionUrl"),
	
	//CitrusPay fields
	CITRUSPAY_TRANSACTION_URL		("CitruspayTransactionUrl"),
	CITRUSPAY_RETURN_URL			("CitruspayReturnUrl"),
	CITRUSPAY_ACCESS_KEY			("CitruspayAccessKey"),
	CITRUSPAY_MERCHANT_KEY			("CitruspayMerchantKey"),
	CITRUSPAY_REFUND_URL			("CitruspayRefundUrl"),
	CITRUSPAY_ENQUIRY_URL			("CitruspayEnquiryUrl"),
	STATUTS_UPDATE_INTERVAL_TIME    ("StatusUpdateIntervalTime"),
	STATUTS_UPDATE_TIME   		                  ("StatutsUpdateTime"),
	CITRUSPAY_CREATE_SUBSCRIPTION_URL 		  ("citrusCreateSubscriptionUrl"),
	CITRUSPAY_SUBSCRIPTION_VAULT_TOKEN_URL	  ("citrusSubscriptionVaultTokenUrl"),
	
	//PayTM fields
	PAYTM_TRANSACTION_URL			("PaytmRequestUrl"),
	PAYTM_RETURN_URL				("PaytmResponseURL"),
	PAYTM_STATUS_ENQUIRY			("PaytmStatusEnquiry"),
	PAYTM_MERCHANT_KEY				("PaytmMerchantKey"),
	PAYTM_REFUND_URL				("PaytmRefundUrl"),
	CALLBACK_URL					("PaytmCallback_URL"),
	
	RAZORPAY_ORDER_URL	             ("RazorpayOrderUrl"),
	RAZORPAY_TRANSACTION_URL		 ("RazorpayTransactionUrl"),
	RAZORPAY_RESPONSE_URL            ("RazorpayResponseUrl"),
	RAZORPAY_REFUND_URL			     ("RazorpayRefundUrl"),
	RAZORPAY_STATUS_URL		         ("RazorpayStatusUrl"),
	RAZORPAY_AUTH                    ("RazorpayAuth"),
	
	//SafexPay Fields
	SAFEXPAY_TRANSACTION_URL	("SafexPayTransactionUrl"),
	SAFEXPAY_RETURN_URL			("SafexPayReturnUrl"),
	SAFEXPAY_REFUND_URL			("SafexPayRefundUrl"),
	SAFEXPAY_ENQUIRY_URL		("SafexPayEnquiryUrl"),
	
	// CashFree
	CASHFREE_TRANSACTION_URL("CashFreeTransactionUrl"), 
	CASHFREE_REFUND_URL("CashFreeRefundUrl"),
	CASHFREE_STATUS_URL("CashFreeStatusUrl"), 
	CASHFREE_RESPONSE_URL("CashFreeResponseUrl"),
	CASHFREE_APP_ID("CashFreeAppId"), 
	CASHFREE_SECRET_KEY("CashFreeSecretKey"),

	// CashFree
	IMONEY_TRANSACTION_URL("ImoneyTransactionUrl"), 
	IMONEY_REFUND_URL("ImoneyRefundUrl"),
	IMONEY_STATUS_URL("ImoneyStatusUrl"), 
	IMONEY_RESPONSE_URL("ImoneyResponseUrl"),
	IPMEY_SECRET_KEY("ImoneySecretKey"),

	 // neturnul
    LOCATE_COUNTRY_NAME					("LocateCountryName"),
    USER_ID					            ("UserID"),
    APP_KEY					            ("AppKey"),
	
	//DIRECPAY fields
	DIRECPAY_TRANSACTION_URL		("DirecpayRequestUrl"),
	DIRECPAY_RETURN_URL				("DirecpayResponseURL"),
	DIRECPAY_STATUS_ENQUIRY			("DirecpayStatusEnquiry"),
	DIRECPAY_MID					("DirecpayMID"),
	DIRECPAY_MERCHANT_KEY			("DirecpayMerchantKey"),
	DIRECPAY_REFUND_URL				("DirecpayRefundUrl"),
	
	//MOBIKWIK fields
	MOBIKWIK_TRANSACTION_URL		("MobikwikRequestUrl"),
	MOBIKWIK_RETURN_URL				("MobikwikReturnUrl"),
	MOBIKWIK_STATUS_ENQUIRY_URL		("MobikwikStatusEnquiryUrl"),
	MOBIKWIK_REFUND_URL				("MobikwikRefundUrl"),
	MOBIKWIK_VERSION				("MobikwikVersion"),
	MOBIKWIK_SHOWMOBILE				("Mobikwikshowmobile"),
	
	//General Configurations
	DEFAULT_CURRENCY					("DefaultCurrencyCode"),
	DEFAULT_RETURN_URL              	("DefaultReturnUrl"),
    SEND_POSTBACK_FLAG					("SendPostBackFlag"),
    TASK_SCHEDULAR_RUNNING_DELAY        ("TaskSchedularRunningDelay"),
    TASK_SCHEDULAR_RUNNING_INTERVAL     ("TaskSchedularRunningInterval"),
    JOB_SCHEDULAR_RUNNING_ON_HOUR 		("JobSchedularRunningOnHour"),
    JOB_SCHEDULAR_RUNNING_ON_MINUTE 	("JobSchedularRunningOnMinute"),
    JOB_SCHEDULAR_CRON_EXPRESSION_FOR_MINUTE_INTERVAL 	("JobSchedularCronExpressionForMinuteInterval"),
    
    // BIN API
    BIN_RANGE_IDENTIFIER_URL		("BinRangeFinder"),
    BIN_RANGE_CITRUS_API		    ("CitrusBinFlag"),
    CITRUS_BIN_RANGE_IDENTIFIER_URL ("CitrusBinRangeFinder"),

	//Amex fields
	AMEX_TRANSACTION_URL            ("AmexvirtualPaymentClientURL"),
	AMEX_SUPPORT_URL                ("AmexSupportTransactionUrlL"),
	AMEX_VPC_VERSION                ("Amexvpc_Version"),
	AMEX_VPC_ACCESSCODE             ("Amexvpc_AccessCode"),
	AMEX_VPC_GATEWAY                ("Amexvpc_gateway"),
	AMEX_VPC_LOCALE                 ("Amexvpc_Locale"),
	AMEX_VPC_COMMAND                ("Amexvpc_Command"),
	AMEX_VPC_MERCHANT               ("Amexvpc_Merchant"),
	AMEX_VPC_USER                   ("Amexvpc_User"),
	AMEX_VPC_PASSWORD               ("Amexvpc_Password"),
	AMEX_SECURE_SECRET              ("AmexsecureSecret"),
	AMEX_SUPPORT_TXN_FIELDS         ("AmexSupportTxnDefaultFields"),
	AMEX_EZEE_CLICK_TRANSACTION_URL ("EzeeClickPaymentURL"),
	AMEX_EZEE_CLICK_RETURN_URL      ("EzeeClickReturnUrl"),
	AMEX_EZEE_CLICK_SUPPORT_TXN_FIELDS   ("EzeeClickSupportTxnDefaultFields"),
	AMEX_EZEE_CLICK_STATUS_TXN_URL       ("EzeeClickStatusUrl"),
	DIRECPAY_LIVE_FLAG                   ("DirecPayLiveFlag"),
	
	//BillDesk
	BILLDESK_MERCHANT_KEY                ("BillDeskMerchankKey"),
	BILLDESK_ACCESS_KEY                  ("BillDeskAccessKey"),
	BILLDESK_TRANSACTION_URL             ("BillDeskRequestUrl"),
	BILLDESK_ENQUIRY_URL                 ("BillDeskStatusUrl"),
	BILLDESK_REFUND_URL                  ("BillDeskRefundUrl"),
	BILLDESK_RETURN_URL                  ("BillDeskResponseUrl"),
	BILLDESK_CHECKSUM_KEY                ("Checksum_key"),
		// ATOM
	ATOM_TRANSACTION_URL                 ("AtomTransactionRequestUrl"),
	ATOM_ENQUIRY_URL                     ("AtomStatusUrl"),
	ATOM_REFUND_URL                      ("AtomRefundUrl"),
	ATOM_RETURN_URL                      ("AtomResponseUrl"),
		//SBI
	SBI_TRANSACTION_URL                  ("SBIRequestUrl"),
	SBI_DOUBLE_VERIFICATION_URL	     	 ("SBIDoubleVerificationUrl"),
	SBI_SATUS_ENQUIRY_URL                ("SBIStatusUrl"),
	SBI_REFUND_URL                       ("SBIRefundUrl"),
	SBI_RETURN_URL                       ("SBIReturnUrl"),
	SBI_REFUND_RETURN_URL                ("SBIRefundCallUrl"),

	HGDF_HTML_URL						 ("HdfcHtmlReqUrl"),
	HDFC_VPA_CHECK_URL                   ("HdfcVpaCheckUrl"),
	HDFC_UPI_COLLECT_REQ_URL             ("HdfcUpiCollectReqUrl"),
	HDFC_TXN_STATUS_ENQUIRY_URL          ("HdfcTxnStatusEnquiryUrl"),
	
	// Status API Flags
	BILLDESK_STATUS_API_FLAG             ("BillDeskStatusAPIFlag"),
	ISGPAY_STATUS_API_FLAG	         	 ("ISGPayStatusAPIFlag"),
	SAFEXPAYPAY_STATUS_API_FLAG	         ("SafexPayStatusAPIFlag"),
	AIRTELBANK_STATUS_API_FLAG	         ("AirtelBankStatusAPIFlag"),
	AXIS_BANK_STATUS_API_FLAG	         ("AxisBankStatusAPIFlag"),
	GPAY_STATUS_API_FLAG                 ("gpayStatusAPIFlag"),
	ATOM_STATUS_API_FLAG                 ("atomStatusAPIFlag"),
	// Url Shortner
	 ACCESS_TOKEN                         ("Access_Token"),
	 URL_SHORTENERAPI_URL                 ("URLShortenerAPIPostUrl"),
	 
	//PAYU
	PAYU_TRANSACTION_URL                 ("PayURequestUrl"),
	PAYU_RESPONSE_URL                    ("PayUResponseUrl"),
	PAYU_REFUND_URL                      ("PayURefundUrl"),

	PAYU_TXN_STATUS_URL                  ("PayUTxnStatusUrl"),

	    // EPAYLATER 
    EPAYLATER_TRANSACTION_URL           ("EpayLaterTransactionUrl"),
	EPAYLATER_RETURN_URL                ("EpayLaterReturnUrl"),
	EPAYLATER_REFUND_URL                ("EpayLaterRefundUrl"),
	    EPAYLATER_STATUS_URL                ("EpayLaterStatusUrl"),
	    EPAYLATER_TRANSACTION_CONFIRM_URL   ("EpayLaterTransactionConfermationUrl"),
	    EPAYLATER_API_KEY                   ("EpayLaterApiKey"),
	    EPAYLATER_AES_KEY                   ("EpayLaterAeskey"),
	    EPAYLATER_AUTH_KEY                   ("EpayLaterApiKey"),
	    EPAYLATER_IV                        ("EpayLaterIv"),
	    //Axix UPI 
	    AXIS_TRANSACTION_URL             ("AxisBankTransactionUrl"),
	    AXIS_TRANSACTION_COLLECT_URL     ("AxisBankCollectAPIUrl"),
	    AXIS_RETURN_URL                  ("AxisBankCallBackUrl"),
	    AXIS_REFUND_URL                  ("AxisBankRefundUrl"),
	    AXIS_TRANSACTION_STATUS_URL      ("AxisBankStatusUrl"),
	    
	  //ISG Pay
	  	ISGPAY_TRANSACTION_URL              ("ISGPayRequestUrl"),
	  	ISGPAY_RETURN_URL                   ("ISGPayResponseUrl"),
	  	ISGPAY_SECURE_SECRET                ("ISGPaySecureSecret"),
	  	ISGPAY_ENCRYPTION_KEY               ("ISGPayEncryptionKey"),
	  	ISGPAY_REFUND_URL              		("ISGPayRefundUrl"),
		ISGPAY_STATUS_URL              		("ISGPayStatusUrl"),
		DYNAMICCURRENCYCONVERTOR			("DynamicCurrencyExchange"),
	 //SabPaisa
	 SABPAISA_RETURN_URL                     ("SabPaisaResponseUrl"),
		
	 PG_TXN_SECRET_KEY                 ("PgTxnSecretKey"),
	 
	//ThreadPool Configuration 
	THREAD_POOL_CORE_POOL_SIZE ("corePoolSize"),
	THREAD_POOL_MAX_POOL_SIZE ("maxPoolSize"),
	THREAD_POOL_MAX_THREAD_ALIVE_TIME ("maxThreadAliveTime");

	private final String value;
	
	private ConfigurationConstants(String key){		
		this.value = key;
	}

	public String getValue() {
		return (new PropertiesManager()).getSystemProperty(value);
	}	
}
