public class MaxInt 
{
	public static void main(String[] args)
	{
		int max = Integer.MAX_VALUE;
		max++;

		int min = Integer.MIN_VALUE;
		min--;

		System.out.println("max +1: " + max);
		System.out.println("min -1: " + min);
	}	
}