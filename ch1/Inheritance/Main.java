import com.sc.pkg.SuperClass;
import com.sc.pkg.DefaultClass;
import com.sc.other.SubClass;

public class Main
{
	public static void main(String[] args)
	{
		SuperClass superclass = new SubClass();
		System.out.println("superclass.a: " + superclass.a);
		superclass.a = 100;
		System.out.println("superclass.a = 100; ");
		System.out.println("superclass.a: " + superclass.a);
		SubClass subclass = new SubClass();
		System.out.println("subclass.a: " + subclass.a);
		subclass.printVars();
	}
}