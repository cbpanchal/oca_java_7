// $ javac Clidlet.java && java Clidlet

class Clidder {
	private final void flipper() { System.out.println("Clidder"); }
}

public class Clidlet extends Clidder {
	public final void flipper() { System.out.println("Clidlet"); }
	public static void main(String[] args) {
		new Clidlet().flipper();
	}
}


/** 
* 2.3
* Chapter 2
* Question 3
* What is the result?
* A. Clidlet
* B. Clidder
* C. Clidder Clidlet
* D. Clidlet Clidder
* E. Compilation fails
**/


/** 
* Answer: A
* Although a final method cannot be overriden, in this
* case, the method is private, and therfore hidden.
* The effect is that a new, accessible, method flipper is
* created. Therefore, no polymorphism occurs in this example,
* the method invoked is simply that of the child class, and
* no error occurs.
**/