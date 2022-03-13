package homework6rashila;

public class Program4 {
    //Declare two instance and two static variables
    int a = 30;
    String name = "Rashila";
    static int b = 50;
    static String surname = "Patel";

    //Declare one instance method
    public void test (){ //Call all four instance and static variables into instance methods inside the print statement
        System.out.println(a);
        System.out.println(name);
        System.out.println(b);
        System.out.println(surname);
    }
    //Declare one static method
    static public void test1(){//Call all four instance and static variables into static methods inside the print statement
        Program4 obj = new Program4();
        System.out.println(obj.a);
        Program4 obj1 = new Program4();
        System.out.println(obj1.name);
        System.out.println(b);
        System.out.println(surname);
    }
    //Declare the Main method
    public static void main(String[] args) {
        Program4 obj = new Program4(); //Call both instance and static methods into the Main method and run the programme
        obj.test();
        System.out.println("-------------------");
        test1();
    }

}
