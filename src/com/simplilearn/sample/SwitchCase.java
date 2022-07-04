package com.simplilearn.sample;

public class SwitchCase {

	public static void main(String[] args) {
		
		int num=5;
		
	    switch (num) {
		case 1:
			System.out.println("Today Is Monady");
			break;
		case 2:
			System.out.println("Today Is Tuesday");
			break;
		case 3:
			System.out.println("Today Is Wednesday");
			break;
		case 4:
			System.out.println("Today Is Thursday");
			break;
		case 5:
			System.out.println("Today Is Friday");
			break;
		case 6:
			System.out.println("Today Is Saturday");
			break;
		case 7:
			System.out.println("Today Is Sunday");
			break;

		default:
			System.out.println("Error enter proper input");
			break;
		}
		
	}
}
