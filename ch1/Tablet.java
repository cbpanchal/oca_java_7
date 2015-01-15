/**
* This program works if you add "public" to line 14
* $ javac Tablet.java && java Tablet
**/
interface Gadget {
	void doStuff(); // default access level of methods in interfaces is public and abstract 
}

abstract class Electronic {
	void getPower() { System.out.println("plug in ");} // default access level of methods in classes is package
}

public class Tablet extends Electronic implements Gadget {
	void doStuff(){System.out.println("hello");}
	public static void main(String[] args){
		new Tablet().getPower();
		new Tablet().doStuff();
	}
}