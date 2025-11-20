import java.util.Scanner;
  public class ascendingaster{
    public static void main(String []args){
      Scanner ck = new Scanner(System.in);

      System.out.print("Enter number: ");
      int num = ck.nextInt();

      for(int i = 1; i <= num; i++){
        for(int j = 1; j <= i; j++){
        System.out.print("*");
        }
      System.out.println("");
      }
    }
  }
