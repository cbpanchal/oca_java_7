enum Animals {
	DOG("woof"), CAT("meow"), FISH("burble");
	String sound;
	Animals(String s) { sound = s; }
}
class TestEnum {
	static Animals a;
	public static void main(String[] args) {
		System.out.println(a.DOG.sound + " " + a.FISH.sound);
	}
}


/**
* 1.4
* Chapter 1
* Question 4
* What is the result?
* A. woof burble
* B. Multiple compilation errors
* C. Compilation fails due to an error on line 2
* D. Compilation fails due to an error on line 3
* E. Compilation fails due to an error on line 4
* F. Compilation fails due to an error on line 9
**/





/** 
* Answer: A
* Enums can have constructors and variables.
**/
