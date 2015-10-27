// $ javac Wind.java && java Wind

public class Wind {
	public static void main(String[] args) {
		foreach:
		for (int j=0; j<5; j++) {
			for (int k=0; k< 3; k++) {
				System.out.print(" " + j);
				if(j==3 && k==1) break foreach;
				if(j==0 || j==2) break;
			}
		}		
	}	
}


/**
* 6.12
* Chapter 6
* Question 12
* What is the result?
* A. 0 1 2 3
* B. 1 1 1 3 3
* C. 1 1 1 2 3 3
* D. 1 1 1 3 3 4 4 4
* E. 0 1 1 1 2 3 3 4 4 4
* F. Compilation fails
**/

/** 
* Answer: C
* A break breaks out of the current innermost
* loop and carries on. A labeled break breaks
* out of and terminates the labeled loops.
**/