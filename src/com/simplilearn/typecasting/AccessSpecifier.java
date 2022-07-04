package com.simplilearn.typecasting;

//Sample Class
public class AccessSpecifier {
		
		int a=40;           // Default
	public	int b=30;       // Pubilc
	private	int c=40;       // Private
	protected	int d=50;   // Protected
		
	public static void main(String[] args) {
		
		AccessSpecifier obj = new AccessSpecifier ();  // Object Creation Syntax
		
		System.out.println("get default " +obj.a);
		System.out.println("get public " +obj.b);
		System.out.println("get private " +obj.c);
		System.out.println("get protected " +obj.d);
	}
	/*          In same class
	 * 	     all public,private, default, protected accessible
	 */
	
}
