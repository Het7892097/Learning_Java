package com.Learning;

import java.util.Scanner;

public class Simple_Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int i=0;
        //for(i=0;i<=n;i++){
          //  System.out.println(i);
  //In while loop when updation(Inc/Dec) is written before out then loop...
        // also move on one step after terminating condition as can be seen in example given below
        /*   while(i<=n){
        ++i;
        System.out.println(i);
        */
        //In do while loop, after while & terminating conditioning, semicolon is used to terminate the command
        // Generally the do while loop is not used as the condition comes at the end of loop
        //Sometimes it may differ the output
         do{
             System.out.println(i);
             i++;
    }while (i<=n);

    }
}
