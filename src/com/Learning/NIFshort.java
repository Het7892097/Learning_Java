//Finding Largest number using Nested if with exception /in short
package com.Learning;
import java.util.Scanner;
public class NIFshort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        System.out.println("Enter num3");
        int num3=sc.nextInt();
        if(num1<num2)
        { if (num3<num2)
            System.out.println("num2 is largest");
            else
            System.out.println("num3 is largest");
        }
        else
        System.out.println("num1 is largest");
    }
}
