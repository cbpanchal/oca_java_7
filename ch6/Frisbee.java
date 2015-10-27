public class Frisbee {
	// insert code here
		int x = 0;
		System.out.println(7/x);
	}
}
// $ javac Frisbee.java && java Frisbee

/**
* 6.15
* Chapter 6
* Question 15
* Given the following four code fragments:
* I.   public static void main(String[] args) {
* II.  public static void main(String[] args) throws Exception {
* III. public static void main(String[] args) throws IOException {
* IV.  public static void main(String[] args) throws RuntimeException {
* If the four fragments are inserted independently at line 2,
* which are true? (Choose all that apply.)
* A. All four will compile and execute without exception
* B. All four will compile and execute and throw an exception
* C. Some, but not all, will compile and execute without exception
* D. Some, but not all, will compile and execute and throw an exception
* E. When considering fragments II, III, and IV of those that will
*    compile, adding a try/catch block around line 4 will cause 
*    compilation to fail
**/

/**
* Answer: D
* This is kind of sneaky, but remember that we're trying to toughen you
* up for the real exam. If you're going to throw an IOException, you
* have to import the java.io package or declare the exception with a 
* fully qualified name.
**/