//Q3-Write a java programe akks the user to enter his/her name and greats them with "Hello"<name>"have a good day" text?

import java.util.Scanner;

class CptHw3{

     public static void main(String[]args){

    System.out.println("What is your name");

     Scanner sc = new Scanner(System.in);

      String name = sc.next();
   
    System.out.println( "Hello" +    name     +" hava a good day");

   }
}
  

    