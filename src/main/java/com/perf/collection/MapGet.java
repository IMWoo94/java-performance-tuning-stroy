package com.perf.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapGet {
	
	int LOOP_COUNT = 1000;
	Map<Integer, String> hashMap;
	Map<Integer, String> hashTable;
	Map<Integer, String> treeMap;
	Map<Integer, String> linkedHashMap;
	String[] keys;
	
	public void setUp() {
		if(keys == null || keys.length != LOOP_COUNT) {
			hashMap = new HashMap<>();
			hashTable = new Hashtable<>();
			treeMap = new TreeMap();
			linkedHashMap = new LinkedHashMap<>();
			String data ="abcdefg";
			
			for(int i =0; i <LOOP_COUNT; i++) {
				String tempData = data+i;
				
				hashMap.put(i, tempData);
				hashTable.put(i, tempData);
				treeMap.put(i, tempData);
				linkedHashMap.put(i, tempData);
			}
			
			keys = RandomKeyUtil.generateRandomSetKeysSwap(LOOP_COUNT);
			
		}
	}
	
	public void getSeqHashMap() {
		for(int i =0; i<LOOP_COUNT; i++) {
			hashMap.get(i);
		}
	}
	
	public void getRandomHashMap() {
		for(int i =0; i<LOOP_COUNT; i++) {
			hashMap.get(Integer.parseInt(keys[i]));
		}
	}
	
	public void getSeqHashTable() {
		for(int i =0; i<LOOP_COUNT; i++) {
			hashTable.get(i);
		}
	}
	
	public void getRandomHashTable() {
		for(int i =0; i<LOOP_COUNT; i++) {
			hashTable.get(Integer.parseInt(keys[i]));
		}
	}
	
	public void getSeqTreeMap() {
		for(int i =0; i<LOOP_COUNT; i++) {
			treeMap.get(i);
		}
	}
	
	public void getRandomTreeMap() {
		for(int i =0; i<LOOP_COUNT; i++) {
			treeMap.get(Integer.parseInt(keys[i]));
		}
	}
	
	public void getSeqLinkedHashMap() {
		for(int i =0; i<LOOP_COUNT; i++) {
			linkedHashMap.get(i);
		}
	}
	
	public void getRandomLinkedHashMap() {
		for(int i =0; i<LOOP_COUNT; i++) {
			linkedHashMap.get(Integer.parseInt(keys[i]));
		}
	}
	

}
