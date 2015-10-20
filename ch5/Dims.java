class Dims {
	public static void main(String[] args) {
		int[][] a = {{1,2}, {3,4}};
		int[] b = (int[]) a[1];
		Object o1 = a;
		int[][] a2 = (int[][]) o1;
		int[] b2 = (int[]) o1;
		System.out.println(b[1]);
	}
}

// $ javac Dims.java && java Dims

/**
* 5.4
* Chapter 5
* Question 4
* What is the result? (Choose all that apply.)
* A. 2
* B. 4
* C. An exception is thrown at runtime
* D. Compilation fails due to an error on line 4
* E. Compilation fails due to an error on line 5
* F. Compilation fails due to an error on line 6
* G. Compilation fails due to an error on line 7
**/


/**
* Answer: C
* A ClassCastException is thrown at line 7 because o1
* refers to an int[][], not an int[]. If line 7
* were removed, the output would be 4.
**/

