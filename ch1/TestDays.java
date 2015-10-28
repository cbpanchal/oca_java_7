// $ javac TestDays.java && java TestDays

public class TestDays {
	public enum Days { MON, TUE, WED };
	public static void main(String[] args) {
		for(Days d : Days.values() )
			;
		Days [] d2 = Days.values();
		System.out.println(d2[2]);
	}
}

/**
* 1.8
* Chapter 1
* Question 8
* What is the result? (Choose all that apply.)
* A. TUE
* B. WED
* C. The output is unpredictable
* D. Compilation fails due to an error on line 4
* E. Compilation fails due to an error on line 6
* F. Compilation fails due to an error on line 8
* G. Compilation fails due to an error on line 9
**/



/**
* Answer: B
* Every enum comes with a static values() method
* that returns an array of the enum's values, in
* the order in which they are declared in the enum.
**/