package com.perf.timer;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class GetProperties {

	public static void main(String[] args) {
		System.setProperty("JavaTuning", "Tune Lee");
		Properties prop = System.getProperties();
		
		Set key = prop.keySet();
		Iterator it = key.iterator();
		
		while(it.hasNext()) {
			String curKey = it.next().toString();
			System.out.printf("%s = %s \n", curKey, prop.get(curKey));
		}
	}

}
