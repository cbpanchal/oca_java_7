// $ javac Ebb.java && java Ebb

public class Ebb {
	static int x = 7;
	public static void main(String[] args) {
		String s = "";
		for (int y = 0; y < 3; y++) {
			x++;
			switch(x) {
				case 8: s += "8 ";
				case 9: s += "9 ";
				case 10: { s+= "10 "; break; }
				default: s += "d ";
				case 13: s += "13 ";
			}
		}
		System.out.println(s);
	}
	static { x++; }
}

/**
* 6.8
* Chapter 6
* Question 8
* What is the result?
* A. 9 10 d
* B. 8 9 10 d
* C. 9 10 10 d
* D. 9 10 10 d 13
* E. 8 9 10 10 d 13
* F. 8 9 10 9 10 10 d 13
* G. Compilation fails
**/

/**
* Answer: D
* Did you catch the static initializer block?
* Remember that switches work on "fall-through"
* logic, and that fall through logic also 
* applies to the default case, which is used when no
* other case matches.
**/