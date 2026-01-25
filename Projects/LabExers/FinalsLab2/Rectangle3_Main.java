import java.util.Scanner;
public class Rectangle3_Main{
  public static void main(String[] args) {
    Scanner ck = new Scanner(System.in);
    
    
    System.out.print("Enter how many rectangles you want: ");
    int counter = ck.nextInt();
    
    Rectangle[] Rectangle = new Rectangle[counter];

    for(int i = 0; i < counter; i++){
    System.out.println("For rectangle " + (i + 1));
    System.out.print("Enter length: ");
    int length =  ck.nextInt();

    System.out.print("Enter Width: ");
    int width = ck.nextInt();

    Rectangle[i] = new Rectangle(length, width);
    }
  
    for(int i = 0; i < counter; i++){
      System.out.print("Rectangle" + (i + 1));
      Rectangle[i].displayInfo();
    }
  }
}
