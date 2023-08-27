package com.perf.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetContains {
	
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
		
		if(keys == null || keys.length != LOOP_COUNT) {
			keys=RandomKeyUtil.generateRandomSetKeysSwap(LOOP_COUNT);
		}
		
	}
	
	public void containsHashSet() {
		for(String key : keys) {
			hashSet.contains(key);
		}
	}
	
	public void containsTreeSet() {
		for(String key : keys) {
			treeSet.contains(key);
		}
	}
	
	public void containsLinkedHashSet() {
		for(String key : keys) {
			linkedHashSet.contains(key);
		}
	}

}
