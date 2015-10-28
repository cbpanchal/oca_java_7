// insert code here
class StatTest {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
	}
}
// $ javac StatTest.java && java StatTest

/**
* 1.11
* Chapter 1
* Question 11
* Which, inserted independently at line 1 compiles?
* (Choose all that apply.)
* A. import static java.lang;
* B. import static java.lang.Integer;
* C. import static java.lang.Integer.*;
* D. static import java.lang.Integer.*;
* E. import static java.lang.Integer.MAX_VALUE;
**/



/** 
* Answer: C, E
* Line 4 isn't making use of static imports, so the
* code will also compile with none of the imports.
**/