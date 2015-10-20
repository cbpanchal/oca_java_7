// $ javac Cowboys.java && java Cowboys

public class Cowboys {
	public static void main(String[] args) {
		int x = 12;
		int a = 5;
		int b = 7;
		System.out.println(x/a + " " + x/b);
	}
}

/**
* 4.6
* Chapter 4
* Question 6
* What is the result (Choose all that apply)
* A. 2 1
* B. 2 2
* C. 3 1
* D. 3 2
* E. An exception is thrown at runtime
**/

/**
* Answer: A
* When dividing ints, remainders are always rounded down.
**/