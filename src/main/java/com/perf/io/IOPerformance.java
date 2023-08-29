package com.perf.io;

import java.io.File;

public class IOPerformance {

	long lastModifiedTime;

	public void lastModified(){
		File file = new File("dummy.properties");
		lastModifiedTime = file.lastModified();
	}
}
