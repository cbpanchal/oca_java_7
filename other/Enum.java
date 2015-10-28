public class Enum
{
	private enum Size {LARGE, MEDIUM, SMALL, TINY};
	// because it is inside of a class, it can use any access level
	// public, protected, default, private
	
	// An enum that isn’t enclosed in a class can be declared with only the public or default modifier, 
	// just like a non-inner class.

	private int i;
	private Size size;

	public Enum()
	{

	}

	public void setI(int i)
	{
		this.i = i;
	}

	public int getI()
	{
		return i;
	}

	public Size getSize()
	{
		return size;
	}

	public void setSize(Size size)
	{
		this.size = size;
	}

	@Override
	public String toString()
	{
		return "[Enum] i: "+getI() +"\n"
		+ "Size: " + getSize() + "\n";
	}

	public static void main(String[] args)
	{
		Enum e = new Enum();
		e.setI(10);
		e.setSize(Enum.Size.LARGE);
		System.out.println("i: "+e.toString());
	}

}