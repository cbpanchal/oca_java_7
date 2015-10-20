// $ javac SpecialOps.java && java SpecialOps


public class SpecialOps {
	public static void main(String[] args) {
		String s = " ";
		boolean b1 = true;
		boolean b2 = false;
		if((b2 = false) | (21%5) > 2) 	s += "x";
		if(b1 || (b2 == true))			s += "y";
		if(b2 == true)					s += "z";
		System.out.println(s);
	}
}

/**
* 4.8
* Chapter 4
* Question 8
* Which are true (Choose all that apply.)
* A. Compilation fails
* B. x will be included in the output
* C. y will be included in the output
* D. z will be included in the output
* E. An exception is thrown at runtime
**/

/**
* Answer: C
* Line 9 uses the modulus operator, 
* which in this case is 1. Also, line 9 sets
* b2 to false, and it doesn't test b2's value.
**/