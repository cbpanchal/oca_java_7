package com.sc.other;

import com.sc.pkg.SuperClass;

public class SubClass extends SuperClass
{
	public void printVars()
	{
		System.out.println("this.a: "+ this.a);
		System.out.println("this.b: "+ this.b);
	}
}