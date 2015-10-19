// $ javac Telescope.java && java Telescope

public class Telescope {
	static int magnify = 2;
	public static void main(String[] args){
		go();
	}
	static void go(){
		int magnify = 3;
		zoomIn();
	}
	static void zoomIn() {
		magnify *= 5;
		zoomMore(magnify);
		System.out.println(magnify);
	}
	static void zoomMore(int magnify){
		magnify *= 7;
	}
}

/**
* 3.12
* Chapter 3
* Question 12
* What is the result?
* A. 2
* B. 10
* C. 15
* D. 30
* E. 70
* F. 105
* G. Compilation fails
**/


/** 
* Answer: B
* In the Telescope class, there are three 
* different variables named magnify. The go()
* method's version and the zoomMore() method's version
* are not used in the zoomIn() method. The zoomIn()
* method multiplies the class variable * 5.
* The result (10) is sent to zoomMore(), but 
* what happens in zoomMore() stays in zoomMore().
* The System.out.print command prints the 
* value of zoomIn()'s magnify.
*
*
* MORE DETAIL:
* Because the zoomMore method declares a parameter named magnify on line 17,
* the magnify *= 7 is contained locally and not applied to the static magnify variable.
**/

