// $ javac Literally.java && java Literally

public class Literally {
	public static void main(String[] args) {
		int i1 = 1_000;		// Line A
		int i2 = 10_00;		// Line B
		int i3 = _10_000;	// Line C
		int i4 = 0b101010;	// Line D
		int i5 = 0B10_1010;	// Line E
		int i6 = 0x2_a;		// Line F
	}
}

/**
* 3.3
* Chapter 3
* Question 3
* Which lines WILL NOT compile? (Choose all that apply.)
* A. Line A
* B. Line B
* C. Line C
* D. Line D
* E. Line E
* F. Line F
**/


/** 
* Answer: C
* Line C will NOT compile. As of Java 7, underscores can be
* included in numberic literals, but not at the beginning 
* or the end.
**/
