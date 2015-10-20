// $ javac Eggs.java && java Eggs

class Dozens {
	int[] dz = {1,2,3,4,5,6,7,8,9,10,11,12};
}
public class Eggs {
	public static void main(String[] args) {
		Dozens[] da = new Dozens[3];
		da[0] = new Dozens();
		Dozens d = new Dozens();
		da[1] = d;
		d = null;
		da[1] = null;
		// do stuff
	}
}

/**
* 5.6
* Chapter 5
* Question 6 
* Which two are true about the objects
* created within main(), and which are eligible for
* garbage collection when line 14 is reached?
* A. Three objects were created
* B. Four objects were created
* C. Five objects were created
* D. Zero objects are eligible for garbage collection
* E. One objects are eligible for garbage collection
* F. Two objects are eligible for garbage collection
* G. Three objects are eligible for garbage collection
**/ 



/** 
* Answer: C, F
* da refers to an object of type "Dozens array"
* and each Dozens object that is created comes
* with it's own "int array" object.
* When line 14 is reached, only the second
* Dozens object (and it's "int array" object)
* are not reachable.
**/
