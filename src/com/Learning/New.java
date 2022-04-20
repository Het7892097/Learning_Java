package com.Learning;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int n= sc.nextInt();
    int  num1 = 0, num2 = 1;
    System.out.print("Fibonacci Series of "+n+" numbers:");

    for (int i = 1; i <=n; ++i)
    {
        System.out.print(num1+" ");

        /* On each iteration, we are assigning second number
         * to the first number and assigning the sum of last two
         * numbers to the second number
         */
        int sumOfPrevTwo = num1 + num2;
        num1 = num2;
        num2 = sumOfPrevTwo;
    }
}

}
