// $ javac Mutant.java && java Mutant

public class Mutant {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");
		String s = "abc";
		sb.reverse().append("d");
		s.toUpperCase().concat("d");
		System.out.println("." + sb + ". ." + s + ".");
	}
}


/** 
* 5.1
* Chapter 5
* Question 1
* Which two substrings will be included in the result? (Choose two.)
* A. .abc.
* B. .ABCd.
* C. .ABCD.
* D. .cbad.
* E. .dcba.
**/



/** 
* Answer: D A (.cbad. .abc.)
* The String operations are working on a new (lost)
* String not String s. The StringBuilder operations
* work from left to right.
**/