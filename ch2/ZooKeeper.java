// $ javac ZooKeeper.java && java ZooKeeper

class Mammal {
	String name = "furry ";
	String makeNoise() { return "generic noise"; }
}

class Zebra extends Mammal {
	String name = "stripes ";
	String makeNoise() { return "bray "; }
}

public class ZooKeeper {
	public static void main(String[] args){
		new ZooKeeper().go();
	}

	void go() {
		Mammal m = new Zebra();
		System.out.println(m.name + m.makeNoise());
	}
}

/**
* Chapter 2
* Question 13
* What is the result?
* A. furry bray
* B. stripes bray
* C. furry generic noise
* D. stripes generic noise
* E. Compilation fails
* F. An exception is thrown at runtime
**/

/**
* Answer: A
* Polymorphism is only for instance methods, not instance variables.
**/