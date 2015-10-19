class CardBoard {
	Short story = 200;
	CardBoard go(CardBoard cb){
		cb = null;
		return cb;
	}
	public static void main(String[] args){
		CardBoard c1 = new CardBoard();
		CardBoard c2 = new CardBoard();
		CardBoard c3 = c1.go(c2);
		c1 = null;
		// do Stuff
} }

/**
* Chapter 3
* Question 1
* When // do Stuff is reached, how many objects are eligible for garbage collection?
* A. 0
* B. 1
* C. 2
* D Compilaiton fails
* E. It is not possible to know
* F. An exception is thrown at runtime
**/

/** 
* Answer: c
* Only one CardBoard object (c1) is eligible, 
* but it has an assoiciated Short wrapper object that is also eligible.
*
* DETAILED EXPLINATION:
* c1 is ready for garbage collection because it is set to null on line 11.
* The c1 object has a Short object (the "story" reference variable) that is
* also eligible for garbage collection. If the "story" reference variable were 
* declared as a primitive short, then it's value would have been stored on the Stack
* and no Object would have been created and likewise there would have been only one 
* object eligible for garbage collection.
*
* c2 and c2's "story" variable are not eligible because c2 is nver set to null.
* passing a copy of the c2's reference variable into the go method and setting the local
* reference variable (cb) to null has no affect on the c2 reference variable. c2 will point to the
* same object before and after the execution of the go method.
*
* c3 is never allocated any space on the Heap because it is "initialized" as null
*
* The above staments can be verified by adding the follwoing code after // do Stuff
* System.out.println("c2: " + c2.story); // c2 is still a valid reference
* System.out.println("c3: " + c3.story); // trying to access c3 will throw a null pointer
* 
**/