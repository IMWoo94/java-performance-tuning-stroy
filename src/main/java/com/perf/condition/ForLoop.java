package com.perf.condition;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {

	int LOOP_COUNT = 100000;
	List<Integer> list;
	
	public void setUp() {
		list = new ArrayList<>();
		for(int i = 0; i < LOOP_COUNT; i++) {
			list.add(i);
		}
		
	}
	
	public void traditionalForLoop() {
		int listSize = list.size();
		for(int i = 0; i<listSize; i++) {
			resultProcess(list.get(i));
		}
	}
	
	public void traditionalSizeForLoop() {
		for(int i = 0; i<list.size(); i++) {
			resultProcess(list.get(i));
		}
	}
	
	public void timeForEachLoop() {
		for(Integer i : list) {
			resultProcess(i);
		}
	}
	
	int current;
	public void resultProcess(int result) {
		current = result;
	}
}
