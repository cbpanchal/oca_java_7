package com.sc.pkg;

public class DefaultClass
{
	public SuperClass superClass = new SuperClass();

	public void print()
	{
		// System.out.println("this.a: " + this.a); // this.a doesn't exisit, because this class doesn't extend SuperClass
		// System.out.println("this.b: " + this.b); // this.b doesn't exisit, because this class doesn't extend SuperClass
		System.out.println("superClass.a: " + superClass.a); // Has access modifier of 'public' therfore any class can access and modify the SuperClass.a varaible from an instance variable
		System.out.println("superClass.b: " + superClass.b); // Has access modifier of 'protected' therfore classes that extend SuperClass will get a compile time copy but can't access it directly through an instance variable. Classes in the same package will be able to access it through an instance variable.
		System.out.println("superClass.c: " + superClass.c); // Has access modifier of 'default' therfore any class in the same pacakge can access and modify the SuperClass.c varaible from an instance variable
		// System.out.println("superClass.d: " + superClass.d); // Has access modifier of 'private' therfore only the SuperClass has access to it.
	}
}