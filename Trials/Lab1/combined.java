import java.util.Scanner;
  public class combined{
    public static void main(String []args){
      Scanner ck = new Scanner(System.in);
    
      System.out.print("Enter a number: ");
      int num = ck.nextInt();

      for(int i = 1; i <= num; i++){
        for(int j = 1; j <= i; j++){
          System.out.print("*");
        }
        System.out.println("");
      }

      for(int i = num; i >= 1; i--){
        for(int j = 1; j <= i; j++){
          System.out.print("*");
        }
        System.out.println("");
      }

    }
  }
