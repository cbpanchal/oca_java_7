// $ javac OverAndOver.java && java OverAndOver

public class OverAndOver {
	static String s = "";
	public static void main(String[] args) {
		try {
			s += "1";
			throw new Exception();
		} catch (Exception e) { s += "2";
		} finally { s += "3"; doStuff(); s += "4";
		}
		System.out.println(s); 
	}
	static void doStuff() { int x = 0; int y = 7/x; }
}

/**
* 6.11
* Chapter 6
* Question 11
* What is the result?
* A. 12
* B. 13
* C. 123
* D. 1234
* E. Compilation fails
* F. 123 followed by an exception
* G. 1234 followed by an exception
* H. An exception is thrown with no other output
**/




/**
* Answer: H
* It's true that the value of String s is 123 at
* the time that the divide-by-zero exception is 
* thrown, but finally() is not guaranteed to complete,
* and in this case finally() never completes, so the 
* System.out.println (S.O.P) never executes.
**/

