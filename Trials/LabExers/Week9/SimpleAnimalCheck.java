import java.util.Scanner;
public class SimpleAnimalCheck {
  public static boolean isCatOrDog(String animal) {
      return animal.matches("cat|dog");
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an animal: ");
    String input = sc.nextLine();
    if (isCatOrDog(input)) {
      System.out.println("It matches: cat or dog.");
    } else {
      System.out.println("It does NOT match cat or dog.");
    }
    sc.close();
  }
}
