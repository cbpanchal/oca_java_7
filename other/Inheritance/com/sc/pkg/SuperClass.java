package com.sc.pkg;

public class SuperClass
{
	// Will be inhereted by any class that extends this class. 
	// If a variable with the same name is decalred in the subclass, this will take precidence.
	// Can be accessed and modified through an instance variable from any other class
	public 	int a = 1; 
	// Will be inhereted by any class that extends this class
	// Can not be accessed through an instance variable from classes in the same package, but not from any classes outside of the same package
	protected 	int b = 2;
	// Can be accessed and modified through an instance variable from any class in the same package.
				int c = 3;
	// No other classes have access to this variable
	private 	int	d = 4;

	public void print()
	{
		System.out.println("this.a: " + this.a);
		System.out.println("this.b: " + this.b);
		System.out.println("this.c: " + this.c);
		System.out.println("this.d: " + this.d);
	}
}