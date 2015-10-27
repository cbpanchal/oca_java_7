// $ javac ExceptionType.java && java ExceptionType

class ExceptionType {
	public static void main(String[] args) {
		try { int x = Integer.parseInt("two"); }
		// catch(ClassCastException e){}
		// catch(IllegalStateException e){}
		// catch(NumberFormatException e){}
		// catch(IllegalArgumentException e){}
		// catch(ExceptionInInitializerError e){}
		// catch(ArrayIndexOutOfBoundsException e){}
	}
}

/**
* 6.3
* Chapter 6
* Question 3
* Which could be used to create an appropriate
* catch block? (Choose all that apply.)
* A. ClassCastException
* B. IllegalStateException
* C. NumberFormatException
* D. IllegalArgumentException
* E. ExceptionInInitializerError
* F. ArrayIndexOutOfBoundsException
**/

/**
* Answer: D C
*
**/