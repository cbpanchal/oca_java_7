import java.util.*;
class Fortress {
	private String name;
	private ArrayList<Integer> list;
	Fortress() { list = new ArrayList<Integer>(); }

	String getName() { return name; }
	void addToList(int x) { list.add(x); }
	ArrayList getList() { return list; }
}
// $ javac Fortress.java && java Fortress


/**
* 5.12
* Chapter 5
* Question 12
* Which lines of code (if any) break encapsulation? (Choose all that apply.)
* A. Line 3
* B. Line 4
* C. Line 5
* D. Line 7
* E. Line 8
* F. Line 9
* G. The class is already well encapsulated
**/


/**
* Answer: F
* When encapsulating a mutable object like an ArrayList,
* your getter must return a reference to a copy of the object,
* not just the reference to the origional object.
**/
