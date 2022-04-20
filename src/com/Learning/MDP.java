//Menu driven program
package com.Learning;
import java.util.Scanner;
public class MDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter o or 1");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("You have requested to stop");
                }
        else {
            do {
                System.out.println("Enter your  marks");
                int marks = sc.nextInt();
                if (marks >= 90) {
                    System.out.println("This is good");
                } else if (marks <=89 && marks >=60) {
                    System.out.println("This is also good");
                } else if(marks<60) {
                    System.out.println("This is good at all");
                }

            } while (n == 1);

        }
    }
}