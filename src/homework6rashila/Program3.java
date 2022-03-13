package homework6rashila;

public class Program3 {
    //declare one static variable and one instance variable
    int a = 80;
    static int b = 40;

    //Declare one instance method.
    public void test() {
        System.out.println(a);//Call both instance and static variables into instance method inside print statement
        System.out.println(b);
    }
    //Declare one static method.
    public static void test1() {
        Program3 obj = new Program3(); //Call both instance and static variables into static method inside print statement
        System.out.println(obj.a);
        System.out.println(b);
    }
    //Declare the Main method.
    public static void main(String[] args) {
        Program3 obj = new Program3(); //Call both instance and static methods into the Main method and run the programme
        obj.test();
        System.out.println("-------------");
        test1();
    }

}
