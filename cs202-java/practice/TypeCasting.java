// Converting Types

public class TypeCasting {
    
    int a = 20;
    double b = 5.0;
    boolean married = true;
    char middleInitial = 'T';
    String greet = "Hello There!";

    /* Converting int to double */
    double int2Double = (double)a;

    /* Converting double to int */
    int double2Int = (int)b;


    public static void main(String[] args) {
        // Creating an object to access class variables
        TypeCasting obj = new TypeCasting();

        System.out.println(obj.int2Double);
        System.out.println(obj.double2Int);
        System.out.println(obj.married);
        System.out.println(obj.middleInitial);
        System.out.println(obj.greet);
    }
}
