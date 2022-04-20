package com.Learning;

import java.util.Scanner;

public class fibonacci_sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many terms of fibonnaci seq to print");
        int n=sc.nextInt();
        int i,num1,num2;
        num1=0;
        num2=1;
int num3=1;
        for(i=1;i<=n;++i){
            System.out.println(num1+" ");
            int sumofprev=num1+num2;
            num1=num2;
        num2=sumofprev;


        }
    }
}
