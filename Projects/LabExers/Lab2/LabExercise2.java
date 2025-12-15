//LAB ACTIVITY 2
//November 28, 2025
//Programmed by: Mirano, Leila Denisse C.
import java.util.Scanner;

public class LabExercise2 {
    public static void main(String[] args) {
        Scanner ck = new Scanner(System.in);

        int attempts = 0;
        boolean isin = false;

        String username = "LEILA DENISSE", password = "MIRANO";
        
        while (attempts < 3) {
            System.out.print("\nEnter username: ");
            String inputuser = ck.nextLine();
            String upperuser = inputuser.toUpperCase();
            
            System.out.print("Enter password: ");
            String inputpass = ck.nextLine();
            String upperpass = inputpass.toUpperCase();

            if (username.equals(upperuser) && password.equals(upperpass)) {
                isin = true;
                System.out.println("Login Successful."); // Added success message
                break;
            } else {
                attempts++;
                System.out.print("Incorrect username or password.");
                
                if (attempts < 3) {
                    System.out.println(" Attempts remaining: " + (3 - attempts));
                } else {
                    System.out.println(" Access locked.");
                }
            }
        }

        if (isin) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Array Sum and Average\n2. Array Operators\n3. String methods\n4. Exit");
            System.out.print("Enter choice for the menu: ");
            int choice = ck.nextInt();
            // Consume the newline character left over after reading the integer
            ck.nextLine(); 

            // start menu
            switch (choice) {
                case 1:
                    // Replaced int variables with necessary types.
                    int i = 0, sumarray1 = 0, sumarray2 = 0;
                    double avearray1 = 0.0, avearray2 = 0.0, ave = 0.0;
                    
                    // asks for the size of the first array
                    System.out.print("Enter the size of your first array: ");
                    int size1 = ck.nextInt();
                    int[] array1 = new int[size1];

                    // asks for the size 2nd array
                    System.out.print("Enter the size of your 2nd array: ");
                    int size2 = ck.nextInt();
                    int[] array2 = new int[size2];
                    
                    // Process for the final size (used for combined average)
                    int finalsize = size1 + size2;

                    // user input number for 1st array
                    System.out.print("\nEnter " + size1 + " numbers for the first array: \n");
                    for (i = 0; i < size1; i++) {
                        System.out.print("Enter number " + (i + 1) + ": ");
                        array1[i] = ck.nextInt();
                        sumarray1 += array1[i]; // Accumulate sum of Array 1 here
                    }
                    
                    System.out.print("\nEnter " + size2 + " numbers for the second array: \n");
                    for (i = 0; i < size2; i++) {
                        System.out.print("Enter number " + (i + 1) + ": ");
                        array2[i] = ck.nextInt();
                        sumarray2 += array2[i]; // Accumulate sum of Array 2 here
                    }

                    // process for average
                    // Use type casting for accurate floating-point division
                    if (size1 > 0) {
                        avearray1 = (double)sumarray1 / size1;
                    }
                    if (size2 > 0) {
                        avearray2 = (double)sumarray2 / size2;
                    }
                    if (finalsize > 0) {
                        ave = (double)(sumarray1 + sumarray2) / finalsize;
                    }

                    System.out.printf("Average of Array 1: %.2f\n", avearray1);
                    System.out.printf("Average of Array 2: %.2f\n", avearray2);
                    System.out.printf("Average of both arrays: %.2f\n", ave);

                    break;

                case 2:
                    int j = 0;
                    
                    // asks for the size of the first array
                    System.out.print("Enter the size of your first array: ");
                    int size3 = ck.nextInt();
                    int[] array3 = new int[size3];

                    // asks for the size 2nd array
                    System.out.print("Enter the size of your 2nd array: ");
                    int size4 = ck.nextInt();
                    int[] array4 = new int[size4];
                    
                    int finalsize1 = Math.min(size3, size4); // Use Math.min for safe loop size

                    // array (Operation arrays are sized using the safe size)
                    int[] sumarray3 = new int[finalsize1];
                    int[] productarray = new int[finalsize1];
                    int[] diffarray = new int[finalsize1];
                    int[] quotarray = new int[finalsize1];
                    int[] moduloarray = new int[finalsize1];


                    // user input number for 1st array
                    System.out.print("\nEnter " + size3 + " numbers for the first array: \n");
                    // Loop condition must be j < size3 and increment j
                    for (j = 0; j < size3; j++) {
                        System.out.print("Enter number " + (j + 1) + ": ");
                        array3[j] = ck.nextInt();
                    }
                    
                    System.out.print("\nEnter " + size4 + " numbers for the second array: \n");
                    for (j = 0; j < size4; j++) {
                        System.out.print("Enter number " + (j + 1) + ": ");
                        array4[j] = ck.nextInt();
                    }

                    // process
                    // Loop up to the processSize (finalsize1) for safety
                    for (j = 0; j < finalsize1; j++) {
                        sumarray3[j] = array3[j] + array4[j];
                        diffarray[j] = array3[j] - array4[j];
                        productarray[j] = array3[j] * array4[j];
                        
                        // Add safety check for division by zero
                        if (array4[j] != 0) {
                            quotarray[j] = array3[j] / array4[j];
                            moduloarray[j] = array3[j] % array4[j];
                        } else {
                            quotarray[j] = 0; // Avoid crashing on division by zero
                            moduloarray[j] = 0;
                        }
                    }

                    // Print Header for Data
                    System.out.println("\nArray 1\t\tArray 2\t\tSum\t\tProduct\t\tDifference\tDivision\tModulo Division");
                    
                    // Print Data Row
                    for (j = 0; j < finalsize1; j++) {
                        System.out.println(array3[j] + "\t\t" + array4[j] + "\t\t" + sumarray3[j] + "\t\t" + productarray[j] + "\t\t" + diffarray[j] + "\t\t" + quotarray[j] + "\t\t" + moduloarray[j]);
                    }

                    // --- Individual Array Analysis Logic (Variable Scope Fix) ---
                    
                    // Variables must be declared outside the IF blocks to be used later
                    int max3 = 0, min3 = 0;
                    int max4 = 0, min4 = 0;
                    int maxSum = 0, minSum = 0;
                    int maxProd = 0, minProd = 0;
                    int maxDiff = 0, minDiff = 0;
                    int maxQuot = 0, minQuot = 0;
                    int maxMod = 0, minMod = 0;
                    
                    // 1. Analyze Array 3 (Input)
                    if (size3 > 0) {
                        max3 = array3[0]; min3 = array3[0];
                        for (int k = 1; k < size3; k++) {
                            if (array3[k] > max3) max3 = array3[k];
                            if (array3[k] < min3) min3 = array3[k];
                        }
                    }

                    // 2. Analyze Array 4 (Input)
                    if (size4 > 0) {
                        max4 = array4[0]; min4 = array4[0];
                        for (int k = 1; k < size4; k++) {
                            if (array4[k] > max4) max4 = array4[k];
                            if (array4[k] < min4) min4 = array4[k];
                        }
                    }

                    // 3. Analyze Sum Array
                    if (finalsize1 > 0) {
                        maxSum = sumarray3[0]; minSum = sumarray3[0];
                        for (int k = 1; k < finalsize1; k++) {
                            if (sumarray3[k] > maxSum) maxSum = sumarray3[k];
                            if (sumarray3[k] < minSum) minSum = sumarray3[k];
                        }
                    }
                    
                    // 4. Analyze Product Array
                    if (finalsize1 > 0) {
                        maxProd = productarray[0]; minProd = productarray[0];
                        for (int k = 1; k < finalsize1; k++) {
                            if (productarray[k] > maxProd) maxProd = productarray[k];
                            if (productarray[k] < minProd) minProd = productarray[k];
                        }
                    }

                    // 5. Analyze Difference Array
                    if (finalsize1 > 0) {
                        maxDiff = diffarray[0]; minDiff = diffarray[0];
                        for (int k = 1; k < finalsize1; k++) {
                            if (diffarray[k] > maxDiff) maxDiff = diffarray[k];
                            if (diffarray[k] < minDiff) minDiff = diffarray[k];
                        }
                    }
                    
                    // 6. Analyze Division (Quotient) Array
                    if (finalsize1 > 0) {
                        maxQuot = quotarray[0]; minQuot = quotarray[0];
                        for (int k = 1; k < finalsize1; k++) {
                            if (quotarray[k] > maxQuot) maxQuot = quotarray[k];
                            if (quotarray[k] < minQuot) minQuot = quotarray[k];
                        }
                    }
                    
                    // 7. Analyze Modulo Array
                    if (finalsize1 > 0) {
                        maxMod = moduloarray[0]; minMod = moduloarray[0];
                        for (int k = 1; k < finalsize1; k++) {
                            if (moduloarray[k] > maxMod) maxMod = moduloarray[k];
                            if (moduloarray[k] < minMod) minMod = moduloarray[k];
                        }
                    }
                    
                    // Display results in the required format
                    System.out.println("\nHigh" + "\t\t" + max3 + "\t\t" + max4 + "\t\t" + maxSum + "\t\t"  + maxDiff + "\t\t" + maxProd + "\t\t" + maxQuot + "\t\t" + maxMod);
                    System.out.println("Low" + "\t\t" + min3 + "\t\t" + min4 + "\t\t" + minSum + "\t\t" + minDiff + "\t\t" + minProd + "\t\t"  + minQuot + "\t\t" + minMod);
                    
                    break; // Proper break for case 2

                case 3:
                    // String methods logic
                    System.out.print("input String 1: ");
                    String st1 = ck.nextLine();
                    System.out.print("Input String 2: ");
                    String st2 = ck.nextLine();

                    int length = st1.length();
                    System.out.println("Length of String 1: " + length);
                    int length1= st2.length();
                    System.out.println("Length of String 2: " + length1);

                    boolean result;
                    result = st1.equals(st2);
                    System.out.println("Are the strings equal? " + result);

                    System.out.println("String 1 concatenated with itself: " + st1.concat(st1));
                    
                    int result1;
                    result1 = st1.compareTo(st2);
                    System.out.println("CompareTo result (st1 vs st2): " + result1);

                    System.out.println("String 1 (spaces replaced): " + st1.replace(' ', '*'));
                    System.out.println("String 2 (spaces replaced): " + st2.replace(' ', '*'));

                    break;
                    
                case 4:
                    System.out.println("Exiting program.");
                    break;
                    
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        
        ck.close();
    }
}
        
