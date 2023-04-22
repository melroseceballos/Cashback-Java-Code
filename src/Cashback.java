// Importing Scanner class 
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

/**
* ICS 111 Coursework: Cashback code
*@author     Ceballos,Melrose
*@assignment ICS Assignment 5
*@date       Feb 12, 2023
*@bugs       Unable to calculate change correctly. 
*            Unable to locate exception for try-catch
**/

public class Cashback{
   public static void main(String[] args){
   // Declaring variables
   String name = " ";
   String menu1 = "Adobo";
   double price1 = 32.55;
   double price2 = 50.88;
   double price3 = 78.99;
   String menu2 = "Nilaga";
   String menu3 = "Lechon";
   double pay;
   
   // Scanner Object here
   Scanner myScanner = new Scanner(System.in);
   //Name Question
   System.out.println("Hey there! What's your name?");
   System.out.println("Nice to meet you, " + name);
   //Name try-catch
   try{
   name = myScanner.nextLine();  
   }
   catch (InputMismatchException e){
   System.out.println("Please use letters only");
   }
   // Kitchen Code here
   System.out.println("\n");
  System.out.println("Welcome to the first metaverse restaurant!");
  System.out.println("Special dish prices change daily!");
  System.out.println("\n");
  System.out.println("For today's dish, we offer: ");
  //Generating Math random method
  int dishRandom = (int) (Math.random() * 4);
  if(dishRandom == 1 )
   System.out.println(menu1 + '\n' + "price: " + "$" + price1);
  else if(dishRandom == 2)
   System.out.println(menu2 + '\n' + "price: " + "$" + price2);
  else if(dishRandom == 3)
   System.out.println(menu3 + '\n' + "price: " + "$" + price3);
  System.out.println("\n");
  //Generating pay and change
  System.out.println("Would you like to pay now?");
  //Pay try-catch 
  try{
   pay = myScanner.nextDouble();  
   }
   catch(InputMismatchException e) {
   System.out.println("Please use numbers only");
   }
  
  //Calculate change
  double change = pay - dishRandom;
  if(pay > dishRandom)
   System.out.println("Goobye!");
  else
  System.out.println("Perfect! Here is your change: " + "$" + change);
  System.out.println("\n Enjoy your meal!");
  }
}
