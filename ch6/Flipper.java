// $ javac Flipper.java && java Flipper

public class Flipper {
	public static void main(String[] args) {
		String o = "-";
		switch("FRED".toLowerCase().substring(1,3)){
			case "yellow":
				o += "y";
			case "red":
				o += "r";
			case "green":
				o += "g";
		}
		System.out.println(o);
	}
}

/**
* 6.1
* Chapter 6
* Question 1
* What is the result?
* A. -
* B. -r
* C. -rg
* D. Compilation fails
* E. An exception is thrown at runtime
**/



/**
* Answer: C (-rg)
* As of Java 7 the code is legal, but the substring()
* method's second argument is exclusie. If the invocation
* had been substring(1,4), the output would have been -rg.
* Note: We hope you won't have too many exam questions that
* focus on API trivia like this one. If you knew the 
* switch was legal, give yourself "almost full credit."
* Strings in switch statments are not supported in Java 1.6
* and below.
**/