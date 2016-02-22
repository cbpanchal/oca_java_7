public class Electronic implements Device { public void doIt() {} }

abstract class Phone1 extends Electronic { }

abstract class Phone2 extends Electronic { public void doIt(int x) { } }

class Phone3 extends Electronic implements Device { public void doStuff() { } }

interface Device { public void doIt(); }

// $ javac Electronic.java

/**
* 1.6
* Chapter 1
* Question 6
*
* What is the result? (Choose all that apply.)
* A. Compilation succeeds
* B. Compilation fails with an error on line 1
* C. Compilation fails with an error on line 3
* D. Compilation fails with an error on line 5
* E. Compilation fails with an error on line 7
* F. Compilation fails with an error on line 9
*
*/

/**
* Answer: A
*/

/**
* NOTE: If you were to change doStuff on line 7 to doIt, compilation would still succeed. 
* If changed doStuff on line 7 to doIt and also changed 'public' 
* to a different access modifier, then compilation would fail
* 
* Also, because the doIt method is initially defined in an interface, it will always have 
* an access modifier of public.
**/