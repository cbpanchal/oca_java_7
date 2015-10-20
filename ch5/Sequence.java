// $ javac Sequence.java && java Sequence

import java.util.*;
public class Sequence {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("apple");
		myList.add("carrot");
		myList.add("banana");
		myList.add(1, "plum");
		System.out.print(myList);
	}
}

/**
* 5.5
* Chapter 5
* Question 5
* A. [apple, banana, carrot, plum]
* B. [apple, plum, carrot, banana]
* C. [apple, plum, banana, carrot]
* D. [plum, banana, carrot, apple]
* E. [plum, apple, carrot, banana]
* F. [banana, plum, carrot, apple]
* G. Compilation fails
**/




/**
* Answer: B
* ArrayList elements are automatically inserted in the order of entry;
* They are not automatically sorted. ArrayLists use zero-based
* indexes and the last add() inserts a new element and 
* shifts the remaining elements back.
**/

