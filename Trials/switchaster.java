import java.util.Scanner;
  public class switchaster{
    public static void main(String []args){
    Scanner ck = new Scanner(System.in);

    System.out.print("1. Ascending\n2.Descending\n3.Combined");
    System.out.print("\nEnter your choice: ");
    int choice = ck.nextInt();
      
    switch(choice){
      case 1://ascending
        System.out.print("Enter number: ");
        int num = ck.nextInt();

          for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
             System.out.print("*");
           }
          System.out.println("");
          }
      break;

      case 2://descending
        System.out.print("Enter number: ");
        int num1 = ck.nextInt();

          for(int i = num1; i <= 1; i++){
            for(int j = 1; j <= i; j++){
              System.out.print("*");
          }
           System.out.println("");
          }
      break;
    
      case 3://combined
        System.out.print("Enter number: ");
        int num2 = ck.nextInt();

          for(int i = 1; i <= num2; i++){
            for(int j = 1; j <= i; j++){
            System.out.print("*");
           }
            System.out.println("");
          }

          for(int i = num2; i >= 1; i++){
            for(int j = 1; j <= i; j++){
           System.out.print("*");
            }
          System.out.println("");
         }
      break;
    
      default:
      System.out.print("Invalid");
      }
    }
  }
