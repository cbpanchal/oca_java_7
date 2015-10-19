/** $ javac Redwood.java && java Redwood **/

public class Redwood extends Tree {
	public static void main(String[] args){
		new Redwood().go();
	}
	void go() {
		go2(new Tree(), new Redwood());
		go2((Redwood) new Tree(), new Redwood());
	}
	void go2(Tree t1, Redwood r1){
		Redwood r2 = (Redwood)t1;
		Tree t2 = (Tree)r1;
	}
}
class Tree { }

/**
* 2.9
* Chapter 2
* Question 9
* What is the result? (Choose all that apply.)
* A. An exception is thrown at runtime
* B. The code compiles and runs with no output
* C. Compilation fails with an error at line 8
* D. Compilation fails with an error at line 9
* E. Compilation fails with an error at line 12
* F. Compilation fails with an error at line 13
*
**/

/**
* Answer: A
**/