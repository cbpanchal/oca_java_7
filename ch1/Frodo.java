/**
* This program works if you add "static" to line 15
* $ javac Frodo.java && java Frodo
**/
public class Frodo extends Hobbit 
{
	public static void main(String[] args)
	{
		int myGold = 7;
		System.out.println(countGold(myGold,6));
	}
}
class Hobbit 
{
	int countGold(int x, int y){ return x + y;}
}