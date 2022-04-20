//The sum of even and odd numbers upto given number
package com.Learning;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int number=sc.nextInt();
        int i,oddSum=0,evenSum=0;

        for(i = 1; i <= number; i++)
        {
            if(i % 2 == 0){
                evenSum=evenSum+i;
            }
            else{
                oddSum=oddSum+i;
            }
        }
        System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evenSum);
        System.out.println("The sum of odd nnumbers upto "+number + " = "+ oddSum);
    }
        }




