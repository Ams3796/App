package com.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

 

public class ReadFromProp {

	public String readDatafrompropfile(String key) throws IOException 
	{

		FileInputStream fis = new FileInputStream(IPathConstants.propPath);	
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	
	
}
