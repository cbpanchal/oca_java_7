// $ javac Ouch.java && java Ouch

public class Ouch {
	static int ouch = 7;
	public static void main(String[] args){
		new Ouch().go(ouch);
		System.out.print(" " + ouch);
	}
	void go(int ouch) {
		ouch++;
		for(int ouch = 3; ouch < 6; ouch++)
			;
		System.out.print(" " + ouch);
	}
}

/**
* 3.8
* Chapter 3
* Question 8
* What is the result?
* A. 5 7
* B. 5 8
* C. 8 7
* D. 8 8
* E. Compilation fails
* F. An exception is thrown at runtime
**/

/** 
* Answer: E
* The parameter declared on line 9 is
* valid (although ugly), but the variable name ouch
* cannot be decalred again on line 11 in the same 
* scope as the declaration on line 9.
**/