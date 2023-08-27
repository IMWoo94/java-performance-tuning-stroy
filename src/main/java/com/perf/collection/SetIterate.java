package com.perf.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetIterate {
	
	int LOOP_COUNT = 1000;
	Set<String> hashSet;
	Set<String> treeSet;
	Set<String> linkedHashSet;
	
	String data = "abcdefghi";
	String[] keys;
	
	String result = null;
	
	public void setUp() {
		hashSet = new HashSet<>();
		treeSet = new TreeSet<>();
		linkedHashSet = new LinkedHashSet<>();
		
		for(int i = 0; i < LOOP_COUNT; i++) {
			String tempData = data + i;
			hashSet.add(tempData);
			treeSet.add(tempData);
			linkedHashSet.add(tempData);
		}
		
	}
	
	public void iterateHashSet() {
		Iterator<String> iter = hashSet.iterator();
		while(iter.hasNext()) {
			result = iter.next();
		}
	}
	
	public void iterateTreeSet() {
		Iterator<String> iter = treeSet.iterator();
		while(iter.hasNext()) {
			result = iter.next();
		}
	}
	
	public void iterateLinkedHashSet() {
		Iterator<String> iter = linkedHashSet.iterator();
		while(iter.hasNext()) {
			result = iter.next();
		}
	}

}