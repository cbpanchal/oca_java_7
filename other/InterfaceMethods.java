interface InterfaceMethodTypes {
	public static final String DOG = "DOG";

	void method1();
	// protected void method2(); // NOT ALLOWED
	public void method3();
	public static void method4(){ System.out.println("method4"); } // Only allowed in Java 8
	public abstract void method5();
}

public class InterfaceMethods implements InterfaceMethodTypes {
	public void method1(){ System.out.println("method1"); }
	public void method3(){ System.out.println("method3"); }
	public void method5(){ System.out.println("method5"); }

	public static void main(String[] args)
	{
		InterfaceMethodTypes.method4();
		System.out.println(InterfaceMethodTypes.DOG);
	}
}