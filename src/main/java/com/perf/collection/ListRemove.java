package com.perf.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListRemove {
	
	int LOOP_COUNT = 1000;
	List<Integer> arrayList;
	Vector<Integer> vector;
	LinkedList<Integer> linkedList;
	
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
	
	public void removeArrayListFromFirst() {
		ArrayList<Integer> tempList = new ArrayList<>(arrayList);
		for(int i = 0; i<LOOP_COUNT; i++) {
			tempList.remove(0);
		}
	}
	
	public void removeVectorFromFirst() {
		Vector<Integer> tempList = new Vector<>(vector);
		for(int i = 0; i<LOOP_COUNT; i++) {
			tempList.remove(0);
		}
	}
	
	public void removeLinkedListFromFirst() {
		LinkedList<Integer> tempList = new LinkedList<>(linkedList);
		for(int i = 0; i<LOOP_COUNT; i++) {
			tempList.remove(0);
		}
	}
	
	public void removeArrayListFromLast() {
		ArrayList<Integer> tempList = new ArrayList<>(arrayList);
		for(int i = LOOP_COUNT-1; i>=0; i--) {
			tempList.remove(i);
		}
	}
	
	public void removeVectorFromLast() {
		Vector<Integer> tempList = new Vector<>(vector);
		for(int i = LOOP_COUNT-1; i>=0; i--) {
			tempList.remove(i);
		}
	}
	
	public void removeLinkedListFromLast() {
		LinkedList<Integer> tempList = new LinkedList<>(linkedList);
		for(int i = 0; i<LOOP_COUNT; i++) {
			tempList.removeLast();
		}
	}
	

}
