package com.perf.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetAdd {
	
	int LOOP_COUNT = 1000;
	Set<String> set;
	String data = "abcdefghi";
	
	public void addHashSet() {
		set = new HashSet<>();
		for(int i = 0; i < LOOP_COUNT; i++) {
			set.add(data + i);
		}
	}
	
	public void addHashSetWithInitialSize() {
		set = new HashSet<>(LOOP_COUNT);
		for(int i = 0; i < LOOP_COUNT; i++) {
			set.add(data + i);
		}
	}

	public void addTreeSet() {
		set = new TreeSet<>();
		for(int i = 0; i < LOOP_COUNT; i++) {
			set.add(data + i);
		}
	}
	
	public void addHLinkedHashSet() {
		set = new LinkedHashSet<>();
		for(int i = 0; i < LOOP_COUNT; i++) {
			set.add(data + i);
		}
	}
}
