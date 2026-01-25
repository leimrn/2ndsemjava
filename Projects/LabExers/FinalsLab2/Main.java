import java.util.Scanner;
  public class Main {
    public static void main(String[] args) {
    Animal a1 = new Dog("Buddy");
    Animal a2 = new Cat("Kitty");
        
    a1.makeSound(); // Dog version
    a2.makeSound(); // Cat version
        
    a1.setName("Max"); // Encapsulation demo via setter
    System.out.println("Updated dog name: " + a1.getName());
    
  }
}
