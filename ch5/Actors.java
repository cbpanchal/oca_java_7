// $ javac Actors.java && java Actors

public class Actors {
	public static void main(String[] args) {
		char[] ca = {0x4e, \u004e, 78};
		System.out.println((ca[0] == ca[1]) + " " + (ca[0] == ca[2]));
	}
}


/**
* 5.3
* Chapter 5
* Question 3
* What is the result?
* A. true true
* B. true false
* C. false true
* D. false false
* E. Compilation fails
**/

/**
* Answer: E
* The Unicode declaration must be enclosed in single quotes:
* '\u004e'. If this were done, the answer would be A,
* but knowing that equality isn't on the OCA exam.
**/