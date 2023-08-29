package com.perf.timer;

import java.util.ArrayList;
import java.util.HashMap;

public class CompareTimerJMH {
	
	public static void main(String[] args) {
		CompareTimerJMH com = new CompareTimerJMH();
		com.dummy = com.makeObjecttWithSize();
	}
	
	private DummyData dummy;
	
	public DummyData makeObjecttWithSize() {
		HashMap<String, String> map = new HashMap<>(1000000);
		ArrayList<String> list = new ArrayList<>(1000000);
		return new DummyData(map, list);
	}

}
