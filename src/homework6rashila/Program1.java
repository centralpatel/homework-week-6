package homework6rashila;

public class Program1 {
    // Declaring 2 variables
    int a = 100;
    String name = "Rashila";

    // instance method
    public void test() {

        //Print statement
        System.out.println(a);
        System.out.println(name);
    }

    //Main method
    public static void main(String[] args) {
        //call instance method into main method
        Program1 obj = new Program1();
        obj.test();

    }
}
