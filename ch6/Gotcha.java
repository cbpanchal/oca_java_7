// $ javac Gotcha.java && java Gotcha

public class Gotcha {
	public static void main(String[] args) {
		// insert code here

	}
	void go() {
		go();
	}
}

/** And given the following three code fragments:
* I.   new Gotcha().go();
* II.  try { new Gotcha().go(); }
*	   catch (Error e) { System.out.println("ouch"); }
* III. try { new Gotcha().go(); }
*	   catch (Exception e) { System.out.println("ouch"); }
*
* When fragments I-III are added, independently, at
* line 5, which are true? (Choose all that apply.)
* A. Some will not compile
* B. They will all compile
* C. All will complete normally
* D. None will complete normally
* E. Only one will complete normally
* F. Two of them will complete normally
**/









/**
* Answer: B, E
* First off, go() is a badly designed recursive method,
* guaranteed to cause a StackOverflowError. Since 
* Exception is not a superclass of Error, so fragment 
* III will not complete normally. Only fragment II will 
* catch the Error.
**/