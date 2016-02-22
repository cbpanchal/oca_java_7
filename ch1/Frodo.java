// $ javac Frodo.java && java Frodo


public class Frodo extends Hobbit {
	public static void main(String[] args){
		int myGold = 7;
		System.out.println(countGold(myGold,6));
	}
}
class Hobbit {
	int countGold(int x, int y){ return x + y; }
}

/**
* 1.9
* Chapter 1
* Question 9
* What is the result?
* A. 13
* B. Compilation fails due to multiple errors
* C. Compilation fails due to an error on line 6
* D. Compilation fails due to an error on line 7
* E. Compilation fails due to an error on line 11
**/

/**
* Answer: D
* The countGold() method cannot be invoked from a 
* static context.
**/


/**
* Note
* This program works if you add "static" to line 15 
* or if countGold were called from a non-static method
**/