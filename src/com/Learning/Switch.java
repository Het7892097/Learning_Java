//Conditioning  using Switch
package com.Learning;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Emter any number");
   int button =sc.nextInt();
   if(button==1){
       System.out.println("Namaste");
   } else if(button==2){
       System.out.println("Hello");
   } else if(button==3){
       System.out.println("Bonjour");
   } else{
       System.out.println("Invalid input");
   }

    }
}
