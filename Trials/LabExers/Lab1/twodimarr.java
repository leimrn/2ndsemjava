import java.util.Scanner;
public class twodimarr{
  public static void main(String[] args){
    Scanner ck = new Scanner(System.in);

     int[][] array1 = {{1,2}, {3,4}, {5,6}, {7,8}, {9,10}};
     int[][] array2 = {{10,20}, {30,40}, {50,60}, {70,80}, {90,100}};
        
      for(int i = 0; i < array1.length; i++){
        int sum = array1[i][0] + array2[i][0];
        int sum1 = array1[i][1] + array2[i][1];
        System.out.println(sum+ " " + sum1);
      }
  }
}
