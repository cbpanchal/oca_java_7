// $ javac Spock.java && java Spock

public class Spock {
	public static void main(String[] args) {
		int mask = 0;
		int count = 0;
		if( ((5<7) || (++count < 10)) | mask++ < 10 )	mask = mask + 1;
		if( (6 > 8) ^ false)							mask = mask + 10;
		if( !(mask > 1) && ++count > 1)					mask = mask + 100;
		System.out.println(mask + " " + count);
	}
}

/**
* 4.9
* Chapter 4
* Question 9
* Which two are true about the value of
* mask and the value of count at line 10? (Choose two.)
* A. mask is 0
* B. mask is 1
* C. mask is 2
* D. mask is 10
* E. mask is greater than 10
* F. count is 0
* G. count is greater than 0
**/





/**
* Answer: C,F (mask is 2, count is 0)
* At line 7 the || keeps count from being incremented, but the | allows
* mask to be incremented. At line 8 the ^ returns true only if
* exactly one operand is true. At line 9 mask is 2 and the 
* && keeps count from being incremented.
**/