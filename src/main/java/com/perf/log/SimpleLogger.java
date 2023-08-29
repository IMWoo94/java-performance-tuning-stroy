package com.perf.log;

public class SimpleLogger {
	private static final boolean printFlag = false;
	public static void log(String message){
		if(printFlag){
			System.out.println(message);
		}
	}
}
