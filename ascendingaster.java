import java.util.Scanner;
  public class ascendingaster{
    public static void main(String []args){
      Scanner ck = new Scanner(System.in);

      System.out.print("Enter number: ");
      int num = ck.nextInt();

      for(int i = 0; i <= num; i++){
        for(int j = 0; j <= i; j++){
        System.out.print("*");
        }
      System.out.println("");
      }
    }
  }
