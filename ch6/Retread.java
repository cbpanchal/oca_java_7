// $ javac Retread.java && java Retread
class MyException extends Exception { }
class Tire {
	void doStuff() { }
}
public class Retread extends Tire {
	public static void main(String[] args) {
		new Retread().doStuff();
	}
	// insert code here
		System.out.println(7/0);
	}
}



/** 
* 6.16
* Chapter 6
* Question 16
* Given the following four code fragments:
* I.   void doStuff() {
* II.  void doStuff() throws MyException {
* III. void doStuff() throws RunTimeException {
* IV.  void doStuff() throws ArithmeticException {
* When fragments I-IV are added, independently, at line 10,
* which are true? (Choose all that apply.)
* A. None will compile
* B. They will all compile
* C. Some, but not all, will compile
* D. All of those that compile will throw an exception at runtime
* E. None of those that compile will throw an exception at runtime
* F. Only some of those that compile will throw an exception at runtime
**/




/**
* Answer: C, D (I, III, and IV will compile and throw an exception at runtime)
* An overriding method canot throw checked exceptions that are broader
* than those thrown by the overridden method. However, an overriding
* method can throw RunTimeExceptions not thrown by the overidden method.
**/