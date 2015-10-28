// $ javac Wind.java && java Wind

public class Wind {
	int id;
	Wind(int i) { id = i; }
	public static void main(String[] args) {
		new Wind(3).go();
		// commented line
	}
	void go() {
		Wind w1 = new Wind(1);
		Wind w2 = new Wind(2);
		System.out.println(w1.id + " " + w2.id);
	}
}

/**
* 3.7
* Chapter 3
* Question 7
* When execution reaches the commented line,
* which are true? (Choose all that apply.)
* A. The output contains 1
* B. The output contains 2
* C. The output contains 3
* D. Zero objects are eligible for garbage collection
* E. One object is eligible for garbage collection
* F. Two objects are eligible for garbage collection
* G. Three objects are eligible for garbage collection
**/


/**
* Answer: A, B, G
* The constructor sets the value of id for w1 and w2.
* When the commented line is reached, none of the three Wind
* objects can be accessed, so they are eligible to be 
* garbage collected.
**/