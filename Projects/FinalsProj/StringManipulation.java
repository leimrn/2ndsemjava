import java.util.Scanner;

public class StringManipulation{
    
    public void StringMethod() {
        Scanner ck = new Scanner(System.in);

        //Ask the user for input
        System.out.print("Enter a string (use dash for splitting the words): ");
        String str = ck.nextLine(); 

        System.out.println("\n--- Results for: " + str + " ---");

        // 1. toLowerCase
        System.out.println("Lower: " + str.toLowerCase());
        //2. toUpperCase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 3. substring
        // Check if the string is long enough
        //grabs the first 4 letters of the inputted string
        if (str.length() >= 4) {
            System.out.println("Substring: " + str.substring(0, 4));
        } else {
            System.out.println("Substring: (Input is too short!)");
        }

        // 4. replace()
        System.out.println("Replace: " + str.replace("-", " "));

        // 5. split()
        String[] word = str.split("-");
        for (int i = 0; i < word.length; i++) {
            System.out.println("Split " + i + ": " + word[i]);
        }
    }
}
