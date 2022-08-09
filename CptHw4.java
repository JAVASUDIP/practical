 //Q-4 Write a java program to convart kilometer to miles ?

import java.util.Scanner;

 class CptHw4{

 public static void main(String[]arge){

     double kilometer;

  System.out.println("please enter your  kilometer");
        
        Scanner sc = new Scanner(System.in);

         kilometer = sc.nextDouble();

          double miles = kilometer /1.6;

        System.out.println(miles+    "miles");


      }
}