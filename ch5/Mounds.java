// $ javac Mounds.java && java Mounds

public class Mounds {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String s = new String();
		for (int i = 0; i < 1000; i++) {
			s = " " + i;
			sb.append(s);
		}
		// done with loop
	}
}


/**
* 5.9
* Chapter 5
* Question 9
* If the garbage collector does NOT run
* while this code is executing, approximately how 
* many objects will exist in memory when 
* the loop is done?
* A. Less than 10
* B. About 1000
* C. About 2000
* D. About 3000
* E. About 4000
**/



/**
* Answer: B
* StringBuilders are mutabe, so all of the 
* append() invocations are acting upon the same
* StringBuilder object over and over. Strings,
* however, are immutable, so every String
* concatenation operation results in a new
* String object. Also, the string " " is created
* once and reused in every loop iteration.
**/