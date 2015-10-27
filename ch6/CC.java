// $ javac CC.java && java CC

class SubException extends Exception { }
class SubSubException extends SubException { }

public class CC { void dostuff() throws SubException { } }

class CC2 extends CC { void dostuff() throws SubSubException { } }

class CC3 extends CC { void dostuff() throws Exception { } }

class CC4 extends CC { void dostuff(int x) throws Exception { } }

class CC5 extends CC { void dostuff() { } }

/**
* 6.7
* Chapter 6
* Question 7
* What is the result? (Choose all that apply.)
* A. Compilation succeeds
* B. Compilation fails due to an error on line 8
* C. Compilation fails due to an error on line 10
* D. Compilation fails due to an error on line 12
* E. Compilation fails due to an error on line 14
**/





/**
* Answer: C
* An overriding method cannot throw a broader 
* exception than the method it's overriding.
* Class CC4's method is an overload, not an 
* override.
**/