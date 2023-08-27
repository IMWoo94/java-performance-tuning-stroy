package com.perf.timer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import javax.annotation.processing.Generated;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;

@BenchmarkMode({Mode.AverageTime})
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class CompareTimerJMH {
	
	public static void main(String[] args) {
		CompareTimerJMH com = new CompareTimerJMH();
		com.dummy = com.makeObjecttWithSize();
	}
	
	private DummyData dummy;
	
	@Benchmark
	public DummyData makeObjecttWithSize() {
		HashMap<String, String> map = new HashMap<>(1000000);
		ArrayList<String> list = new ArrayList<>(1000000);
		return new DummyData(map, list);
	}

}
