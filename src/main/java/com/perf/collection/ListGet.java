package com.perf.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListGet {
	
	int LOOP_COUNT = 1000;
	List<Integer> arrayList;
	Vector<Integer> vector;
	LinkedList<Integer> linkedList;
	
	int result = 0;
	
	public void setUp() {
		arrayList = new ArrayList<>();
		vector = new Vector<>();
		linkedList = new LinkedList<>();
		
		for(int i = 0; i < LOOP_COUNT; i++) {
			arrayList.add(i);
			vector.add(i);
			linkedList.add(i);
		}
	}
	
	public void getVector() {
		for(int i = 0; i<LOOP_COUNT; i++) {
			result = vector.get(i);
		}
	}
	
	public void getLinkedList() {
		for(int i = 0; i<LOOP_COUNT; i++) {
			result = linkedList.get(i);
		}
	}
	
	public void peekLinkedList() {
		for(int i = 0; i<LOOP_COUNT; i++) {
			result = linkedList.peek();
		}
	}
	

}
