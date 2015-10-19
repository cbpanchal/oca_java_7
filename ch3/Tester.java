// $ java Tester.java && java Tester

class Beta { }
class Alpha {
	static Beta b1;
	Beta b2;
}
public class Tester {
	public static void main(String[] args){
		Beta b1 = new Beta(); 		Beta b2 = new Beta();
		Alpha a1 = new Alpha();	 	Alpha a2 = new Alpha();
		a1.b1 = b1;
		a1.b2 = b1;
		a2.b2 = b2;
		a1 = null; b1 = null; b2 = null;
		// do stuff
	}
}

/** 
* 3.11
* Chapter 3
* Question 11
* When line 16 is reached, how many objects will be 
* eligible for garbage collection?
* A. 0
* B. 1
* C. 2
* D. 3
* E. 4
* F. 5
**/


/**
* Answer: B
* It should be clear that there is still
* a reference to the object referred to by a2,
* and that there is still a reference to the object
* referred to by a2.b2. What might be less clear
* is that you can still access the other Beta object
* through the static variable a2.b1-because it's static.
*
* MORE DETAIL:
* Add the following code after // do stuff to demonstarte the objects still on the Heap
* System.out.println("a2: " + a2); // a2 Object is on the Heap
* System.out.println("a2.b2: " + a2.b2); // b2 Object is on the Heap
* System.out.println("Alpha.b1: " + Alpha.b1); // b1 Object is on the Heap
**/