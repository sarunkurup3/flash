package com.arun.core;

public class EnvironmentalUtils {

	private static String envName;
	private static final String DEFAULT_APP_URL = "";

	public static String getEnvironmentName() {
		if (null == envName) {
			String env = null;
			if (null != (env = System.getProperty("DefaultENv", "QA1"))) {
				envName = env;
			} else {
				throw new NullPointerException("The Default Environment values were not set in Maven parameters");
			}
		}
		return envName;
	}

	public static String getEnvHostName(String envName) {
		String tempEnvName=envName.trim();
		if(tempEnvName.equalsIgnoreCase("perf1")||tempEnvName.equalsIgnoreCase("perf2")) {
			tempEnvName=tempEnvName+".chd";
		}else {
			tempEnvName=tempEnvName+"-dfw";
		}
		return tempEnvName.trim();
	}
	public static String getUrl() {
		String params[]=new String[] {getEnvHostName(System.getProperty("DefaultENv","QA1"))};
		return (String.format(DEFAULT_APP_URL, params));
	}
	
	
}
