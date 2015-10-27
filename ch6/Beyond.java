// javac Beyond.java && java Beyond

class Infinity { }
public class Beyond extends Infinity {
	static Integer i;
	public static void main(String[] args) {
		int sw = (int) (Math.random() * 3);
		switch(sw) {
			case 0: { for (int x = 10; x > 5 ; x++) 
						if(x > 1000000) x = 10;
					  break; }
			case 1: { int y = 7 * i; break; }
			case 2: { Infinity inf = new Beyond();
					  Beyond b = (Beyond) inf;	}
		}
	}
}



/**
* 6.9
* Chapter 6
* Question 9
* And given that line 7 will assign the value
* 0,1, or 2 to sw, which are true? (Choose all that apply.)
* A. Compilation fails
* B. A ClassCastException might be thrown
* C. A StackOverflowError might be thrown
* D. A NullPointerException might be thrown
* E. An IllegalStateException might be thrown
* F. The program migh hang without ever completing
* G. The program will always complete without exception
**/


/**
* Answer: D, F
* Because i was not initialized, case 1 will throw a 
* NullPointerException. Case 0 will initiate an endless loop,
* not a stack overflow. Case 2's downcast will not cause an exception.
**/
