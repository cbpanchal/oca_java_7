class Loopy {
	public static void main(String[] args) {
		int[] x = {7,6,5,4,3,2,1};
		// insert code here
			System.out.print(y + " ");
		}
	}
}
// $ javac Loopy.java && java Loopy

/**
* 6.5
* Chapter 6
* Question 5
* Which, inserted independently at line 4,
* compiles? (Choose all that apply.)
* A. for(int y: x) {
* B. for(x : int y) {
* C. int y = 0; for(y : x) {
* D. for(int y=0, z=0; z< x.length; z++) { y = x[z];
* E. for(int y=0, int z=0; z< x.length; z++) { y = x[z];
* F. int y = 0; for(int z=0; z< x.length; z++) { y = x[z];
**/



/**
* Answer: A, D, F
* A is an example of the enhanced for loop.
* D and F are examples of the basic for loop.
**/