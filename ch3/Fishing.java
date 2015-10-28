// $ javac Fishing.java && java Fishing

public class Fishing {
	byte b1 = 4;
	int i1 = 123456;
	long L1 = (long)i1;		// line A
	short s2 = (short)i1;	// line B
	byte b2 = (byte)i1;		// line C
	int i2 = (int)123.456;	// line D
	byte b3 = b1 + 7;		// line E
}

/** 
* 3.2
* Chapter 3
* Question 2
* Which lines WILL NOT compile? (Choose all that apply.)
* A. Line A
* B. Line B
* C. Line C
* D. Line D
* E. Line E
**/




/**
* Answer: E
* Compilation of line E fails. When a mathematical operation is
* performed on any primitives smaller than ints, the result is 
* automatically cast to an integer.
**/