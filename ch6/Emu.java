// $ javac Emu.java && java Emu

class Emu {
	static String s = "-";
	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch (Exception e) {
			try {
				try { throw new Exception();
				} catch (Exception ex) { s += "ic "; }
				throw new Exception(); }
			catch (Exception x) { s += "mc "; }
			finally { s += "mf "; }
		} finally { s += "of "; }
		System.out.println(s);
}  }

/**
* 6.6
* Chapter 6
* Question 6
* What is the result?
* A. -ic of
* B. -mf of
* C. -mc mf
* D. -ic mf of
* E. -ic mc mf of
* F. -ic mc of mf
* G. Compilation fails
**/


/** 
* Answer: E
* There is no problem nesting try/catch blocks.
* As is normal, when an exception is thrown,
* the code in the catch block runs,
* and then the code in the finally block runs.
**/