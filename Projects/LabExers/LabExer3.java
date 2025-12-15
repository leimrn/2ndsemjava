////LAB ACTIVITY 2
//November 28, 2025
//Programmed by: Mirano, Leila Denisse C.

import java.util.Scanner;
public class LabExer3{
  public static void main(String[] args){
    Scanner ck = new Scanner(System.in);

     System.out.println("1. String Manipulation\n2. Division\n3. Division Mistake\n4. Exit");
     System.out.print("\nEnter choice for the menu: ");
     int choice = ck.nextInt();
     ck.nextLine();

    switch(choice){
      case 1:
       //asks inputs
        System.out.print("Enter String 1: ");
        String st1 = ck.nextLine();
        System.out.print("Enter String 2: ");
        String st2 = ck.nextLine();
        System.out.print("Enter String 3: ");
        String st3 = ck.nextLine();

        //length of strings
        System.out.println("\nA.");
        System.out.println("Length of String 1: " + st1.length());
        System.out.println("Length of String 2: " + st2.length());
        System.out.println("Length of String 3: " + st3.length());
        
        //replaace spaces
        System.out.println("\nB.");
        System.out.println("String 1 (spaces replaced): " + st1.replace(' ', '*'));
        System.out.println("String 2 (spaces replaced): " + st2.replace(' ', '*'));
        System.out.println("String 2 (spaces replaced): " + st3.replace(' ', '*'));

        //combine strings
        System.out.println("\nC.");
        System.out.println("Concatnate String 1: " + st1.concat(st2));
        System.out.println("Concatnate String 1: " + st2.concat(st3));
        System.out.println("Concatnate String 1: " + st1.concat(st2.concat(st3)));

        //compaare strings
        System.out.println("\nD.");
        int result;
        result = st1.compareTo(st2);
        System.out.println("Compare To result (st1 vs st2): " + result);

        int result1;
        result1 = st2.compareTo(st3);
        System.out.println("CompareTo result (st2 vs st3): " + result1);

        int result2;
        result2 = st2.compareTo(st1);
        System.out.println("CompareTo result (st2 vs st1): " + result2);
        break;

      case 2:
        //variable
        int numerator, denominator, cs2result;

        System.out.print("Enter numerator >> ");
        numerator = ck.nextInt();

        System.out.print("\nEnter denominator >> ");
        denominator = ck.nextInt();

        //Process
        cs2result = numerator / denominator;
        System.out.println(numerator + "/" + denominator + " = " + cs2result);
        break;

      case 3:
        int cs3numerator, cs3denominator, cs3result;

        System.out.print("\nEnter numerator >> ");
        cs3numerator = ck.nextInt();

        System.out.print("Enter denominator >> ");
        cs3denominator = ck.nextInt();

        //Process
        try{
          cs3result = cs3numerator / cs3denominator;
          System.out.println(cs3numerator + "/" + cs3denominator + " = " + cs3result);
          }
        catch(ArithmeticException mistake){
          System.out.println("Arithmetic exception was thrown and caught");
          }
          System.out.println("End of Program");
        break;

      case 4:
        System.out.println("End of program. Thank you!");
        break;

      default:
        System.out.println("Invalid");
    }
  }
}
