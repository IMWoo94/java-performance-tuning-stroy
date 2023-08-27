package com.perf.statics.bad;

import java.io.FileReader;
import java.util.HashMap;

public class BadQueryManager {
	private static String queryURL = null;
	
	public BadQueryManager(String badUrl) {
		queryURL = badUrl;
	}
	
	public static String getSql(String idSql) {
		try {
			FileReader reader = new FileReader(queryURL);
			HashMap<String, String> document = new HashMap<>();
			int i = reader.read();
			return document.get(idSql);
		} catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
