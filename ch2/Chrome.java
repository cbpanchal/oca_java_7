class X { void do1() { } }
class Y extends X { void do2() { } }

class Chrome {
	public static void main(String[] args) {
		X x1 = new X();
		X x2 = new Y();
		Y y1 = new Y();
		// insert code here
} }

/**
* 2.6
* Chapter 2
* Question 6
* Which of the following, inserted at line 9, will
* compile? (Choose all that apply.)
* A. x2.do2();
* B. (Y)x2.do2();
* C. ((Y)x2).do2();
* D. None of the above statements will compile
**/


/**
* Answer: C
* Before you can invoke Y's do2 method, you have to 
* cast x2 to b of type Y. B looks like a proper cast,
* but without the second set of parentheses, the compilier
* thinks it's an incomplete statement.
**/