public class Final 
{
    // The initial assignment of a value for a final reference 
    // must happen before the constructor completes.

    final int number; // must initialize this variable before compelation of the constrcutor
    // static final int STATIC_NUMBER; // must initiiazlie this variable at decalaration

    public Final()
    {
        number = 10; // okay as long as number is assigned before completion of the constructor
        // STATIC_NUMBER = 1; // Not okay - compilation error
    }

    public static void main(String[] args)
    {
        Final f = new Final();
        System.out.println("number: "+f.number);

    }
}
