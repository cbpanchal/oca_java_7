/** $ javac House.java && java House **/

class Building {
	Building() { System.out.print("b "); }
	Building(String name){
		this(); System.out.print("bn " + name);
	}
}
public class House extends Building {
	House() { System.out.print("h "); }
	House(String name){
		this(); System.out.print("hn " + name);
	}
	public static void main(String[] args) { new House("x "); }
}


/** 
* 2.12
* Chapter 2
* Question 12
* What is the result?
* A. h hn x
* B. hn x h
* C. b h hn x
* D. b hn x h
* E. bn x h hn x
* F. b bn x h hn x
* G. bn x b h hn x
* H. Compilation fails
**/

/**
* Answer: C
* Remember that constructors call their superclass constructors, 
* which execute first, and that constrcutors can be overloaded.
**/