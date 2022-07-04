package com.simplilearn.sample;

import java.util.Iterator;

public class Continue {

	public static void main(String[] args) {
		
		for (int i = 0; i <=10; i++) {
			
			if(i==6)
				continue;
			
			System.out.println(i);
		} 
		
		System.out.println("Continue Loop Completed");
	}
}
//We Can Use Continue To Skip Some Value In Loop