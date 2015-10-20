// $ javac Fork.java && java Fork live2

class Fork {
	public static void main(String[] args) {
		if(args.length == 1 | args[1].equals("test")){
			System.out.println("test case");
		} else {
			System.out.println("production " + args[0]);
		}
	}
}

/**
* 4.3
* Chapter 4
* Question 3
* What is the result?
* A. test case
* B. prodcution live2
* C. test case live2
* D. Compilation fails
* E. An exception is thrown at runtime
**/

/**
* Answer: E
* Because the short circuit (||) is 
* not used, both operands are evaluated.
* Since args[1] is past the args array bounds,
* an ArrayIndexOutOfBoundsException is thrown.
**/