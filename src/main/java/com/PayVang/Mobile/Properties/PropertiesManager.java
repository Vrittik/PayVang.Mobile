package com.PayVang.Mobile.Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.PayVang.Mobile.Constants.Constants;


public class PropertiesManager {
	
	private static final String systemPropertiesFile = "C:\\PayV\\PayvProps\\system.properties";
   
	private static Map<String, String> saltStore = new HashMap<String, String>();

	public PropertiesManager() {
	}

	/**
	 * system.properties has been relocated to out of project base directory
	 * to meet PCI-DSS compliance
	 * @param key
	 * @return
	 */
	public String getSystemProperty(String key){
		return getPropertyFromFileSystem(key, systemPropertiesFile);
	}

    
    /**
	 * It's implementation has been changed.
	 * Now we load salt file from relocated path
	 * @param appId
	 * @return
	 */
	public String getSalt(String appId){
		String salt = saltStore.get(appId);
		if(null == salt || salt.isEmpty()){
			String saltPropertiesFile = getSystemProperty(Constants.SALT_FILE_PATH_NAME.getValue());
			salt = getPropertyFromFileSystem(appId, saltPropertiesFile);
			if(null != salt && !salt.isEmpty()){
				saltStore.put(appId, salt);
			}
		}
		
		return salt;
	}
	
	/**
	 * to get property value from props file relocated to out of project base directory
	 * @param key
	 * @param fileName
	 * @return
	 */
	protected String getPropertyFromFileSystem(String key, String fileName){
		String value = null;
		Properties properties = new Properties();
		try {
			FileInputStream input = new FileInputStream(fileName);
			properties.load(input);
			input.close();
			value = properties.getProperty(key, null);
		} catch (IOException ioException) {
			// TODO: Add logging here, verbose
		}
		return value;
	}
	
}
