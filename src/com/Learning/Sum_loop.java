package com.Learning;

import java.util.Scanner;

public class Sum_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int n=sc.nextInt();
        int i=1,sum=0;
        //Using for loop
        for(i=1;i<=n;++i){
            sum=sum+i;

        }
        System.out.println("The sum of given number in increasing order is "+sum);
        // using while loop
        i=1;
        while(i<=n)
        {
            sum=sum+i;
            ++i;
        }
    }


}
