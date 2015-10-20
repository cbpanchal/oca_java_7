// $ javac McGee.java && java McGee

public class McGee {
	public static void main(String[] args) {
		Days d1 = Days.TH;
		Days d2 = Days.M;
		for(Days d: Days.values()){
			if(d.equals(Days.F)) break;
			d2 = d;
		}
		System.out.println((d1 == d2)?"same old" : "newly new");
	}
	enum Days { M, T, W, TH, F, SA, SU};
}

/**
* 4.7
* Chapter 4
* Question 7
* What is the result?
* A. same old
* B. newly new
* C. Compilation fails due to multiple errors
* D. Compilation fails due only to an error on line 7
* E. Compilation fails due only to an error on line 8
* F. Compilation fails due only to an error on line 11
* G. Compilation fails due only to an error on line 13
**/

/**
* Anser: A
* All of this syntax is correct. The for-each iterates
* through the enum using the values() method
* to return an array. An enum can be compared using
* either equals() or ==. An enum can be used in a
* ternary operator's boolean test.
**/
