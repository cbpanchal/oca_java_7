// $ javac Foo.java Baz.java && java Baz

package pkgB;
import pkgA.*;
public class Baz {
	public static void main(String[] args) {
		Foo f = new Foo();
		System.out.print(" " + f.a);
		System.out.print(" " + f.b);
		System.out.println(" " + f.c);
	}
}

/**
* 1.5
* Chapter 1
* Question 5
* Given that Foo consits of the following file:
* package pkgA;
* public class Foo {
* 	int a = 5;
* 	protected int b = 6;
* 	public int c = 7;
* }
* What is the result? (Choose all that apply.)
* A. 5 6 7
* B. 5 followed by an exception
* C. Compilation fails with an error on line 7
* D. Compilation fails with an error on line 8
* E. Compilation fails with an error on line 9
* F. Compilation fails with an error on line 10
**/



/** 
* Answer: D E
* Variable a has default access, so it cannot be accessed
* from outside the package. Variable b has procted access
* in pkgA.
**/