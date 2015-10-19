/** $ javac Tenor.java && java Tenor **/

public class Tenor extends Singer {
	public static String sing() { return "fa"; }
	public static void main(String[] args){
		Tenor t = new Tenor();
		Singer s = new Tenor();
		System.out.println(t.sing() + " " + s.sing());
	}
}
class Singer { public static String sing() { return "la"; } }

/**
* 2.19
* Chapter 2
* Question 10
* What is the result?
* A. fa fa
* B. fa la
* C. la la
* D. Compilation fials
* E. An exception is thrown at runtime
**/

/**
* Answer: B
* The code is correct, but polymorphism doesn't apply to static methods.
**/