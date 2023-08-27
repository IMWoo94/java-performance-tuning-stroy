package com.perf.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class RandomKeyUtil {
	
	public static String[] generateRandomSetKeysSwap(int count) {
		Set<String> set = new HashSet<>(count);
		int size = set.size();
		String result[] = new String[size];
		
		Random random = new Random();
		int maxNum = size;
		Iterator<String> iterator = set.iterator();
		int resultPos = 0;
		while(iterator.hasNext()) {
			result[resultPos++] = iterator.next();
		}
		
		for(int loop = 0; loop < size; loop++) {
			int randomNum1 = random.nextInt(maxNum);
			int randomNum2 = random.nextInt(maxNum);
			String temp = result[randomNum2];
			result[randomNum2] = result[randomNum1];
			result[randomNum1] = temp;
			
		}
		
		return result;
	}

}
