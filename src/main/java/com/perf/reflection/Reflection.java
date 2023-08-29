package com.perf.reflection;

import java.math.BigDecimal;

public class Reflection {

	int LOOP_COUNT = 1000;
	String result;

	public void withEquals(){
		Object src = new BigDecimal("6");
		for(int i = 0; i < LOOP_COUNT; i++){
			if(src.getClass().getName().equals("java.math.BigDecimal")){
				result = "BigDecimal";
			}
		}
	}

	public void withInstanceof(){
		Object src = new BigDecimal("6");
		for(int i = 0; i < LOOP_COUNT; i++){
			if(src instanceof java.math.BigDecimal){
				result = "BigDecimal";
			}
		}
	}
}
