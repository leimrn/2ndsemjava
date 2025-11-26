import java.util.Scanner;
  public class multitable{
    public static void main(String []args){
      Scanner ck = new Scanner(System.in);

      System.out.print("Enter first number: ");
      int num1 = ck.nextInt();
      System.out.print("Enter second number: ");
      int num2 = ck.nextInt();

      System.out.print("Multiplication Table: \n");

      System.out.print("\nTable of " + num1 + ": \n");
      for(int i = 1; i <= 10; i++){
        int product = num1 * i;
        System.out.print(num1 + " x " + i + ": " + product + "\n");
      }

      System.out.print("\nTable of " + num2 + ": \n");

      for(int j = 1; j <=10; j++){
        int product1 = num2 * j;
        System.out.print(num2 + " x " + j + ": " + product1 + "\n");
      }

    }
  }
