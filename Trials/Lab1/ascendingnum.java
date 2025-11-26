import java.util.Scanner;
  public class ascendingnum{
    public static void main(String []args){
    Scanner ck = new Scanner(System.in);

    System.out.print("Input: ");
    int num = ck.nextInt();

    for(int i = 1; i <= num; i++){
      for(int j = 1; j <= i; j++){
        System.out.print(j);
      }
      System.out.println("");
    }
    }
  }
