// For pattern, we have to use nested  loop(Loop inside a loop).
// Generally for a pattern, the loop outside is for row and loop inside is for column
package com.Learning;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int i, j;
        /*/ for a *(char pattern)
        for(i=1;i<=row;++i){
            for(j=1;j<=column;++j){
                System.out.print();
            }
            System.out.println("");

         // for number pattern-1)Same num on row and no effect of inc column
        for(i=1;i<=row;++i){
            for(j=1;j<=column;++j){
                System.out.print(i);
            }
            System.out.println("");

         --2)Inc num on row as column inc
            */
       /*/ Hollow Pattern
        for(i=1;i<=row;++i){
            for(j=1;j<=column;++j){
       if(i==1 || j==1 || i==row || j==column){
           System.out.print("*");
       } else {
           System.out.print(" ");
       }

            }
            System.out.println("");
        } */
/*/Inc Pyramid
        for (i = 1; i <= row; ++i) {
            for(j=1;j<=i;++j){
                System.out.print("*");
            }
            System.out.println();

        }
        */
//Dec pyramid

           for(i=row;i >=1; --i) {
            for(j=1;j<=i;++j){
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
