package com.sc.pkg;

public class SuperClass
{
	// Will be inhereted by any class that extends this class. 
	// If a variable with the same name is decalred in the subclass, this will take precidence.
	public 		int a = 1; 
	// Will be inhereted by any class that extends this class
	protected 	int b = 2;
	// Any class in the same package has access to this variable
				int c = 3;
	// No other classes have access to this variable
	private 	int	d = 4;

	public int getA()
	{
		return a;
	}

	protected int getB()
	{
		return b;
	}

	int getC()
	{
		return c;
	}

	private int getD()
	{
		return d;
	}
}