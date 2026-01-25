import java.util.Scanner;
public class Rectangle2_Main{
  public static void main(String[] args) {
    Scanner ck = new Scanner(System.in);
    
    // Create Rectangle objects
    System.out.println("Enter for R1");
    System.out.print("Enter Lenght: ");
    int length = ck.nextInt();
    System.out.print("Enter Width: ");
    int width = ck.nextInt();

    System.out.println("Enter for R2");
    System.out.print("Enter Lenght: ");
    int length2 = ck.nextInt();
    System.out.print("Enter Width: ");
    int width2 = ck.nextInt();

    Rectangle r1 = new Rectangle(length, width);
    Rectangle r2 = new Rectangle(length2, width2);
    
    System.out.println("Rectangle 1:");
    r1.displayInfo();

    System.out.println();
  
    System.out.println("Rectangle 2:");
    r2.displayInfo();
  }
}
