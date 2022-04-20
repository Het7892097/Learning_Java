package com.Learning;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int i=1,table;
        while(i<=10){
            table=n*i;
            i++;
            System.out.println(table);
        }
    }
}
