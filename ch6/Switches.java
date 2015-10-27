// $ javac Switches.java && java Switches

public class Switches {
	public static void main(String[] args) {
		new Switches().go();
	}
	void go() {
		String s = "bob";
		String[] sa = {"a", "bob"};
		StringBuilder sb = new StringBuilder("bob");

		// switch(sa[1]) {				// line 1
		// switch("b" + "ob") {			// line 2
		// switch(sb.toString()) {		// line 3

		// case "ann": ;				// line 4
		// case s:		;				// line 5
		// case s2:	;					// line 6
	}
}


/**
* 6.14
* Chapter 6
* Question 14
* Given that the numbered lines will all be tested
* by un-commenting one switch statement and one case
* statement together, which line(s) will FAIL to 
* compile? (Choose all that apply.)
* A. line 1
* B. line 2
* C. line 3
* D. line 4
* E. line 5
* F. line 6
* G. All six lines of code will compile
**/





/** 
* Answer: E
* E is correct. A switch's cases must be compile time
* constants or enum values.
**/
