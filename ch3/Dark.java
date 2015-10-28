// $ javac Dark.java && java Dark

public class Dark {
	int x = 3;
	public static void main(String[] args) {
		new Dark().go1();
	}
	void go1() {
		int x;
		go2(++x);
	}
	void go2(int y) {
		int x = ++y;
		System.out.println(x);
	}
}
/**
* 3.13
* Chapter 3
* Question 13
* What is the result?
* A. 2
* B. 3
* C. 4
* D. 5
* E. Compilation fails
* F. An exception is thrown at runtime
**/

/**
* Answer: E
* In go1() the local variable x is not initialized.
**/