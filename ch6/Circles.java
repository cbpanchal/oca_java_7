// $ javac Circles.java && java Circles

public class Circles {
	public static void main(String[] args) {
		int[] ia = {1,3,5,7,9};
		for(int x : ia){
			for (int j = 0; j < 3; j++) {
				if(x > 4 && x < 8) continue;
				System.out.print(" " + x);
				if(j == 1) break;
				continue;
			}
			continue;
		}
	}
}


/**
* 6.10
* Chapter 6
* Question 10
* What is the result?
* A. 1 3 9
* B. 5 5 7 7
* C. 1 3 3 9 9
* D. 1 1 3 3 9 9
* E. 1 1 1 3 3 3 9 9 9
* F. Compilation fails
**/





/**
* Answer: D
* The basic rule for unlabeled continue statements
* is that the current iteration stops early and 
* execution jumps to the next iteration. The last 
* two continue statements are redundant!
**/