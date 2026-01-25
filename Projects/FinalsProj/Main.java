import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ck= new Scanner(System.in);
        int choice; 
        
        // START LOOP
        do {
            // Display Menu
            System.out.println("\n--- JAVA MENU ---");
            System.out.println("1 String Manipulation");
            System.out.println("2 Write to File");
            System.out.println("3 Read from File");
            System.out.println("4 Exit");
            System.out.print("Select an option (1-4): ");

            choice = ck.nextInt();
            
            
            ck.nextLine(); 

            switch (choice) {
                
                // --- CASE 1: STRING MANIPULATION ---
                case 1:
                    System.out.println("\n--- OPTION 1: String Manipulation ---");
                    StringManipulation strObj = new StringManipulation();
                    strObj.StringMethod();
                    break;

                // --- CASE 2: WRITE FILE ---
                case 2:
                    System.out.println("\n--- OPTION 2: Writing File ---");
                    BufferWrite writeObj = new BufferWrite();
                    writeObj.ReadLines();
                    break;

                // --- CASE 3: READ FILE ---
                case 3:
                    System.out.println("\n--- OPTION 3: Reading File ---");
                    BufferRead readObj = new BufferRead();
                    readObj.ReadFile();
                    break;

                // --- CASE 4: EXIT ---
                case 4:
                    System.out.println("Exiting the program. Thank you for listening!");
                    System.exit(0); // Terminates the program immediately
                    break;

                // --- DEFAULT: INVALID INPUT ---
                default:
                    System.out.println("\nInvalid selection!");
                    break;
            }

        // END LOOP (Repeats as long as choice is not 4)
        } while (choice != 4);
        
        ck.close();
    }
}
