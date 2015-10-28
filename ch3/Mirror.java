// javac Mirror.java && java Mirror

public class Mirror {
	int size = 7;
	public static void main(String[] args) {
		Mirror m1 = new Mirror();
		Mirror m2 = m1;
		int i1 = 10;
		int i2 = i1;
		go(m2, i2);
		System.out.println(m1.size + " " + i1);
	}
	static void go(Mirror m, int i) {
		m.size = 8;
		i = 12;
	}
}

/**
* 3.6
* Chapter 3
* Question 6
* What is the result?
* A. 7 10
* B. 8 10
* C. 7 12
* D. 8 12
* E. Compilation fails
* F. An exception is thrown at runtime 
**/



/** 
* Answer: B
* In the go() mehtod, m refers to the single Mirror instance,
* but the int i is a new int variable, a detached copy of i2.
**/