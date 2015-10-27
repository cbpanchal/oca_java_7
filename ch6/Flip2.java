// $ javac Flip2.java && java Flip2 RED Green Yellow

public class Flip2 {
	public static void main(String[] args) {
		String o = "-";
		String[] sa = new String[4];
		for (int i = 0; i < args.length ; i++)
			sa[i] = args[i];
		for (String n: sa) {
			switch(n.toLowerCase()) {
				case "yellow": 	o += "y";
				case "red":		o += "r";
				case "green":	o += "g";
			}
		}
		System.out.print(o);
	}
}


/**
* 6.4
* Chapter 6
* Question 4
* Which are true? (Choose all that apply.)
* A. The string rgy will appear somwhere in the output
* B. The string rgg will appear somwhere in the output
* C. The string gyr will appear somwhere in the output
* D. Compilation fails
* E. An exception is thrown at runtime
**/


/**
* Answer: E
* As of Java 7 the syntax is legal. The sa[]
* array receives only three arguments from
* the command line, so on the last iteration 
* through sa[], a NullPointerException is thrown.
**/