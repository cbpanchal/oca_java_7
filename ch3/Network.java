// $ javac Network.java && java Network

public class Network {
	Network(int x, Network n) {
		id = x;
		p = this;// p is declared as a null value..
		if(n != null) p = n;
	}
	int id;
	Network p;
	public static void main(String[] args) {
		Network n1 = new Network(1, null);
		n1.go(n1);
	}

	void go(Network n1) {
		Network n2 = new Network(2, n1);
		Network n3 = new Network(3, n2);
		System.out.println(n3.p.p.id);
	}
}

/** 
* 3.10
* Chapter 3
* Question 10
* What is the result?
* A. 1
* B. 2
* C. 3
* D. null
* E. Compilation fails
**/

/**
* Answer: A
* Three Network objects are created. The n2 object has 
* a reference to the n1 object, and the n3 object has a 
* reference to the n2 object. The System.oout.println can
* be read as, "Use the n3 object's Network reference
* (the frist p), to find the object's reference (n2), and
* use the object's reference (the second p) to find that 
* object's (n1's) id, and print that id."
**/
