// $ javac Hexy.java && java Hexy

class Hexy {
	public static void main(String[] args){
		int i = 42;
		String s = (i<40)?"life":(i>50)?"universe":"everything";
		System.out.println(s);
	}
}

/**
* 4.1
* Chapter 4
* Question 1
* What is the result?
* A. null
* B. life
* C. universe
* D. everything
* E. Compilation fails
* F. An exception is thrown at runtime
**/

/**
* Answer: D
* This is a ternary nested in a ternary. Both of the ternary expressions are false.
**/