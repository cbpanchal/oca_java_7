/** $ javac SubSubAlpha.java && java SubSubAlpha **/

class Alpha {
	static String s = " ";
	protected Alpha() { s += "alpha "; }
}
class SubAlpha extends Alpha {
	private SubAlpha() { s += "sub "; }
}
public class SubSubAlpha extends Alpha {
	private SubSubAlpha() { s += "subsub "; }
	public static void main(String[] args){
		new SubSubAlpha();
		System.out.println(s);
	}
}

/**
* 2.11
* Chapter 2
* Question 11
* What is the result?
* A. subsub
* B. sub subsub
* C. alpha subsub
* D. alpha sub subsub
* E. Compilation fails
* F. An exception is thrown at runtime
**/

/**
* Answer: C
* Watch out, because SubSubAlpha extends Alpha! Since 
* the code doesn't attempt to make a SubAlpha, 
* the private constructor in SubAlpha is okay.
**/
