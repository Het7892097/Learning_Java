//Finding Largest number using else if
package com.Learning;
import java.util.Scanner;
public class ELSE_IF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num a,b and c in space");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("Num a is Largest");
        } else if (b > a && c < b) {
            System.out.println("Num b is Largest");
        } else if (a==b && b==c) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("Num c is largest");
        }
    }
}