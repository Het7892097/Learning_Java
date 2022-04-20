//Finding Largest nunmber using Nested if Long one
package com.Learning;
import java.util.Scanner;
public class Nested_if {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter num1");

        int num1 =scan.nextInt();
        System.out.println("Enter num2");
        int num2 = scan.nextInt();
        System.out.println("Enter num3");
        int num3 =scan.nextInt();
        if (num1 < num2) {
            if (num3 < num2)
                System.out.println("num2 is largest");
            else
                System.out.println("num3 is largest");
        } else
        {
            if (num1<num3)
                System.out.println("num3 is Largest");
            else
                System.out.println("num1 is Largest");
        }


    }
}
