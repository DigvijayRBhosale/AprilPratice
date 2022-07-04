package com.simplilearn.typecasting;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		char a= 'A';
		System.out.println("char value " +a);
		int b=a;  //Implicit Type Casting
		System.out.println("int value " +b);
		float c=b;
		System.out.println("float value " +c);
		double d=c;
		System.out.println("double value " +d);
		
		
		byte x=(byte) b;  // Explicitly Type Casting
		System.out.println("byte value " +x);
		
		double z=34.6789;
		int y=(int) z;
		System.out.println("Double " +y+ " converted to int " +z );
		
		//Loss Of Data While Converting Value From Double To int
	}
}
