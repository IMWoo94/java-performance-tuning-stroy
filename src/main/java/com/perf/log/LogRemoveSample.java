package com.perf.log;

import java.util.ArrayList;

public class LogRemoveSample {

	public LogRemoveSample() {

	}

	public ArrayList getList(){
		ArrayList list = new ArrayList(10);

		if(LogFlag.printFlag){
			System.out.format("LogRemoveSample.getList():size=%d\n", list.size());
		}
		return list;
	}
}
