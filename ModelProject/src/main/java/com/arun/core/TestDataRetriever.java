package com.arun.core;

import java.util.HashMap;
import java.util.Map;

public class TestDataRetriever {

	private static ThreadLocal<Map<Object, Object>> usedTestData = ThreadLocal.withInitial(HashMap::new);

	public static Map<Object, Object> getUsedTestData() {
		return usedTestData.get();
	}

	public static Object getTestData(Object key) {
		Object data = TestData.getData(key);
		getUsedTestData().put(key, data);
		return data;
	}

	public static void setUserDefinedtestDataAsInput(Object key, Object data) {
		getUsedTestData().put(key, data);
	}

	public static void clear() {
		usedTestData.remove();
	}

}
