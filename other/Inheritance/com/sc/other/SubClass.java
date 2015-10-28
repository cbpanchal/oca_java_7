package com.sc.other;

import com.sc.pkg.SuperClass;

public class SubClass extends SuperClass
{
	public SuperClass superClass = new SuperClass();

	

	@Override
	public void print()
	{
		System.out.println("this.a: "+ this.a); // a copy of the SuperClass.a variable is stored at compile time because it is public
		System.out.println("this.b: "+ this.b); // a copy of the SuperClass.b variable is stored at compile time because it is protected
		System.out.println("superClass.a: " + superClass.a); // Has access modifier of 'public' therfore any class can access and modify the SuperClass.a varaible from an instance variable
		// System.out.println("superClass.b: " + superClass.b); // Has access modifier of 'protected' therfore classes that extend SuperClass will get a compile time copy but can't access it directly through an instance variable. Classes in the same package will be able to access it through an instance variable.
		// System.out.println("superClass.c: "+ superClass.c); // Cannot be accessed from outside package
		// System.out.println("superClass.d: "+ superClass.d); // Cannont be accessed from outside of the class
	}
}