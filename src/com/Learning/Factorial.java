//Source code for Finding Factorial of given number using loop
package com.Learning;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int i=10, fact = 1;

        /*/Using for loop
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
        */

        /*/Using while loop
        while(i<=n)
        {

            fact=fact*i;
            ++i;
        }
        System.out.println("Factorial of number is"+fact);
        */

        //Using for loop in decreasing order(not complete)
         for(i=1;i>=n;--i)
         {
             fact=fact*i;
         }
        System.out.println("The factorial of "+n+" is "+fact);

    }
}