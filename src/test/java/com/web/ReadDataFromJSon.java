package com.web;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


 

public class ReadDataFromJSon {

	public String readDatafromJSON(String key) throws IOException, ParseException
	{

		FileReader inputfile = new FileReader(IPathConstants.jsonPath);

		//Parsing the JSON into JAVA 
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(inputfile);

		//type cast the object and just read the data
		@SuppressWarnings("rawtypes")
		HashMap jobj = (HashMap) obj;

		String value = jobj.get(key).toString();

		return value;
	}
}
