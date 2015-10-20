// $ javac Hilltop.java && java Hilltop eyra vafi draumur kara

public class Hilltop {
	public static void main(String[] args) {
		String[] horses = new String[5];
		horses[4] = null;
		for(int i = 0; i < horses.length; i++){
			if(i < args.length)
				horses[i] = args[i];
			System.out.print(horses[i].toUpperCase() + " ");
		}
	}
}

/**
* 5.2
* Chapter 5
* Question 2
* What is the result?
* A. EYRA VAFI DRAUMUR KARA
* B. EYRA VAFI DRAUMUR KARA null
* C. An exception is thrown with no other output
* D. EYRA VAFI DRAUMUR KARA, and then a NullPointerException
* E. EYRA VAFI DRAUMUR KARA, and then an ArrayIndexOutOfBoundsException
* F. Compilation fails
**/


/**
* Answer: D
* The horses array's first four elements contain
* Strings, but the fifth is null, so the 
* toUpperCase() invocation for the fifth element
* throws a NullPointerException.
**/