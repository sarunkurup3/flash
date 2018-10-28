package com.arun.core;

import java.io.File;

public class FileChecker {

	public static boolean createFolder(String directoryPath) {
		File dirPath=new File(directoryPath);
		if(dirPath.mkdirs()) {
			return true;
		}
		return false;}
	
	public static boolean isDirectoryExists(String directoryPath) {
		File dirPath=new File(directoryPath);
		if(dirPath.exists()) {
			return true;
		}
		return false;
	}
	
	public static boolean isFileExists(String filePath) {
		File fileName=new File(filePath);
		if(fileName.exists()) {
			return true;
		}
		return false;
	}
	
}
