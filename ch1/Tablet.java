// $ javac Tablet.java && java Tablet

interface Gadget {
	void doStuff();
}

abstract class Electronic {
	void getPower() { System.out.println("plug in "); } 
}

public class Tablet extends Electronic implements Gadget {
	void doStuff(){System.out.println("hello");}
	public static void main(String[] args){
		new Tablet().getPower();
		new Tablet().doStuff();
	}
}

/**
* 1.10
* Chapter 1
* Question 9
* Which are true? (Choose all that apply.)
* A. The class Tablet will NOT compile.
* B. The interface Gadget will NOT compile.
* C. The output will be plug in show book.
* D. The abstract class Elextronic will NOT compile.
**/

/**
* Answer: A
* By default, an interface's methods are public so the 
* Tablet.doStuff method must be public, too. The rest 
* the code is valid.
**/

/**
* Note
* This program works if you add "public" to line 12
**/