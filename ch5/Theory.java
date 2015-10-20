// $ javac Theory.java && java Theory

public class Theory {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = s1;
		s1 += "d";
		System.out.println(s1 + " " + s2 + " " + (s1==s2));

		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = sb1;
		sb1.append("d");
		System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2));
	}
}

/**
* 5.8
* Chapter 5
* Question 8
* Which are true? (Choose all that apply.)
* A. Compilation fails
* B. The first line of output is abc abc true
* C. The first line of output is abc abc false
* D. The first line of output is abcd abc false
* E. The second line of output is abcd abc false
* F. The second line of output is abcd abcd true
* G. The second line of output is abcd abcd false
**/


/**
* Answer: D F
* Although String objects are immutable, references
* to Strings are mutable. The code s1 += "d";
* creates a new String object. StringBuilder objects 
* are mutable, so the append() is changing the single 
* StringBuilder object to which both StringBuilder
* references refer.
**/

