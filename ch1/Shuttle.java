// javac Shuttle.java && java Shuttle

class Rocket {
	private void blastOff() { System.out.print("bang "); }
}
public class Shuttle extends Rocket {
	public static void main(String[] args) {
		new Shuttle().go();
	}
	void go() {
		blastOff();
		// Rocket.blastOff();	// line A
	}
	private void blastOff() { System.out.print("sh-bang "); }
}


/**
* 1.2
* Chapter 1
* Question 2
* Which are true? (Choose all that apply.)
* A. As the code stands, the output is bang
* B. As the code stands, the output is sh-bang
* C. As the code stands, compilation fails.
* D. If line A is uncommented, the output is bang bang
* E. If line A is uncommented, the output is sh-bang bang
* F. If line A is uncommented, compilation fails.
**/




/**
* Answer: B, F
* Since Rocket.blastOff() is private, it can't be overriden,
* and it is invisible to class Shuttle.
**/