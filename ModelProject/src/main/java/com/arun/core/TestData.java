package com.arun.core;

import java.util.Properties;

public class TestData {

	private static Properties properties;
	
	public static void initiateTestData(Properties properties) {
		TestData.properties=properties;
	}
	
	public static Object getData(Object key) {
		return properties.get(key);
	}
	
}
