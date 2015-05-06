import com.sc.pkg.SuperClass;
import com.sc.pkg.DefaultClass;
import com.sc.other.SubClass;

public class Main
{
	public static void main(String[] args)
	{
		// Show origional SuperClass variables
		System.out.println("Show SuperClass's origional variables");
		SuperClass superclass = new SuperClass();
		System.out.println("superclass.print(): ");
		superclass.print();
		System.out.println("\n");

		// show class in same pacakge as SuperClass, but does not extend SuperClass
		System.out.println("Show DefaultClass's variables, a class in same pacakge as SuperClass, but does not extend SuperClass");
		DefaultClass defaultClass = new DefaultClass();
		System.out.println("defaultClass.print(): ");
		defaultClass.print();
		System.out.println("\n");

		// Modify SuperClass variables
		System.out.println("Modify the variables in the SuperClass instance");
		superclass.a = 100;
		System.out.println("superclass.a = 100; ");
		// Show result of modified SuperClass variables
		System.out.println("Show the result of the modified SuperClass instance");
		System.out.println("superclass.print(): ");
		superclass.print();
		System.out.println("\n");

		// Show SubClass, which extends SuperClass's variables.
		System.out.println("Show SubClass's variables, a class in a different package that extends SuperClass");
		SubClass subclass = new SubClass();
		System.out.println("subclass.print(): ");
		subclass.print();
		System.out.println("Note: That if the 'a' variable was decalred as 'static' in the SuperClass class, the the modification would be reflected in the SubClass");
		System.out.println("\n");
	}
}