/** $ javac DogShow.java && java DogShow **/

class Dog {
	public void bark() { System.out.print("woof "); }
}
class Hound extends Dog {
	public void sniff() { System.out.print("sniff "); }
	public void bark() { System.out.print("howl "); }
}
public class DogShow {
	public static void main(String[] args){ new DogShow().go(); }
	void go() {
		new Hound().bark();
		((Dog) new Hound()).bark();
		((Dog) new Hound()).sniff();
	}
}

/**
* 2.8
* Chapter 2
* Question 8
* 
* What is the result? (Choose all that apply.)
* A. howl howl sniff
* B. howl woof sniff
* C. howl howl followed by an exception
* D. howl woof followed by an exception
* E. Compilation fails with an error at line 14
* F. Compilation fails with an error at line 15
*
*/

/**
* Answer: F
**/

/**
* Note: What would happen if you comment out line 15? -- howl howl
**/