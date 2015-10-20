// $ javac Hedges.java && java Hedges

public class Hedges {
	public static void main(String[] args) {
		String s = "JAVA";
		s = s + "rocks";
		s = s.substring(4,8);
		s.toUpperCase();
		System.out.println(s);
	}
}


/**
* 5.11
* Chapter 5
* Question 11
* What is the result?
* A. JAVA
* B. JAVAROCKS
* C. rocks
* D. rock
* E. ROCKS
* F. ROCK
* G. Compilation fails
**/


/** 
* Answer: D
* The substring() invocation uses a zero-based
* index and the second argument is exclusive,
* so the character at index 8 is NOT included.
* The toUpperCase() invocation makes a new String
* object that is instantly lost. The toUpperCase()
* invocation does NOT affect the String refered to by s.
**/