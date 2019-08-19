package com.amdocs;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(50);
		numbers.add(10);
		numbers.add(500);
		numbers.add(150);
		
		System.out.println(numbers.size());
		
		for(int element:numbers) {
			System.out.println(element);
		}
		
		Collections.sort(numbers);
		
		for(int element:numbers) {
			System.out.println(element);
		}

	}

}
