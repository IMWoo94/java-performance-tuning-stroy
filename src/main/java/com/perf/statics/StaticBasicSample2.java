package com.perf.statics;

public class StaticBasicSample2 {
	static String staticVal;
	
	static {
		staticVal = "Static val";
		staticVal = StaticBasicSample.staticInt + "";
	}
	
	public static void main(String[] args) {
		System.out.println(StaticBasicSample2.staticVal);
	}
	
	static {
		staticVal = "Performance is important!!";
	}

}
