package com.perf.condition;

import java.util.Random;

public class ConditionIf {
	
	int LOOP_COUNT = 1000;
	
	public void randomOnly() {
		Random random = new Random();
		int data = 1000 + random.nextInt();
		for(int i =0; i<LOOP_COUNT; i++) {
			resultProcess("dummy");
		}
	}
	
	public void if10() {
		Random random = new Random();
		String result = null;
		int data = 1000 + random.nextInt();
		for(int i = 0; i < LOOP_COUNT; i++) {
			if(data < 50) {
				result = "50";
			}else if(data < 150) {
				result = "150";
			}else if(data < 250) {
				result = "250";
			}else if(data < 350) {
				result = "350";
			}else if(data < 450) {
				result = "450";
			}else if(data < 550) {
				result = "550";
			}else if(data < 650) {
				result = "650";
			}else if(data < 750) {
				result = "750";
			}else if(data < 850) {
				result = "850";
			}else if(data < 950) {
				result = "950";
			}else {
				result = "over";
			}
			resultProcess(result);
		}
	}
	
	
	String current;
	public void resultProcess(String reuslt) {
		current = reuslt;
	}
	
	public int getMonthNumber(String str) {
		int month = -1;
		switch(str) {
			case "January" : month = 1;
				break;
			case "February" : month = 2;
				break;
			default : return month;
		}
		
		return month;
	}

}
