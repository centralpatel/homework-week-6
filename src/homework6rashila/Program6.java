package homework6rashila;

import java.util.Scanner;

public class Program6 {
    //program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).

    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the radius:");
        double r= s.nextDouble();
        double  area=(22*r*r)/7 ;
        System.out.println("Area of Circle is: " + area);
    }
}