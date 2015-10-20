// $ javac Tailor.java && java Tailor

public class Tailor {
	public static void main(String[] args) {
		byte[][] ba = {{1,2,3,4}, {1,2,3}};
		System.out.println(ba[1].length + " " + ba.length);
	}
}

/**
* 5.7
* Chapter 5
* Question 7
* What is the result?
* A. 2 4
* B. 2 7
* C. 3 2
* D. 3 7
* E. 4 2
* F. 4 7
* G. Compilation fails
**/






/**
* Answer: C (3 2)
* A two-dimensional array is an "array of arrays."
* The length of ba is 2 because it contains two,
* one-dimensional arrays. Array indexes are
* zero-based, so ba[1] refers to ba's second array.
**/