//LAB ACTIVITY 1
//November 21, 2025
//Programmed by: Leila Denisse C. Mirano

import java.util.Scanner;
  public class LabExercise1{
    public static void main(String []args){
    Scanner ck = new Scanner(System.in);

    System.out.print("1. Asterisk\n2. Ascending\n3. Descending\n4. Combined\n5. Sum of array(Given)\n6. Sum of array(Input)\n7. Arrray Operators");
    System.out.print("\nEnter your choice: ");
    int choice = ck.nextInt();
      
    switch(choice){
      case 1://asterisk
        //asks for a number
        System.out.print("Enter a number: ");
        int num = ck.nextInt();
        //loops for the column
        for(int i = 1; i <= num; i++){
          System.out.print("*");
        }
      break;


      case 2://Triangle
        System.out.print("Enter a number: ");
        int num1 = ck.nextInt();

          //loops for the line or rows
          for(int i = 1; i <= num1; i++){
            //loop for the asterisk inside the line
            for(int j = 1; j <= i; j++){
             System.out.print("*");
           }
          System.out.println("");
          }
      break;


      case 3://descending reverse
        System.out.print("Enter number: ");
        int num2 = ck.nextInt();
          //loop for the asterisk inside the line
          for(int i = num2; i >= 1; i--){
             //loop for the asterisk inside the line
            for(int j = 1; j <= i; j++){
              System.out.print("*");
          }
           System.out.println("");
          }
      break;
    

      case 4://combined
        System.out.print("Enter number: ");
        int num3 = ck.nextInt();

          //loop for the asterisk inside the line
          for(int i = 1; i <= num3; i++){
            //loop for the asterisk inside the line
            for(int j = 1; j <= i; j++){
            System.out.print("*");
           }
            System.out.println("");
          }
          //loop for the asterisk inside the line
          for(int i = num3; i >= 1; i--){
             //loop for the asterisk inside the line
            for(int j = 1; j <= i; j++){
           System.out.print("*");
            }
          System.out.println("");
         }
      break;
    
      case 5://Sum of array(given)
        //variables
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = {10,1,8,3,6,2,4,5,7,8};
        
          for(int i = 0; i < 10; i++){
            int sum = array1[i] + array2[i];
            System.out.print(sum+ ", ");
          }
      break;
        
      case 6://Sum of array(input)
        //variables

        //array
        int[] array3 = new int[10];
        int[] array4 = new int[10];
        int[] sumarray = new int[10];
        int i = 0;
          
        System.out.println("Enter numbers for the first array");
        for(i = 0; i <= 9; i++){
          System.out.print("Enter number " + (i + 1) + ": ");
          array3[i] = ck.nextInt();
        }
        
        System.out.println("Enter numbers for the second array");
        for(i = 0; i <= 9; i++){
          System.out.print("Enter number " + (i + 1) + ": ");
          array4[i] = ck.nextInt();
        }
        for(i = 0; i <= 9; i++){
          sumarray[i] = array3[i] + array4[i];
            System.out.print(sumarray[i] + ", ");
        }
        break;

      case 7://arrayoperators
        int[] array5 = new int[10];
        int[] array6 = new int[10];
        int[] sumarray1 = new int[10];
        int[] diffarray = new int[10];
        int[] quotarray = new int[10];
        int[] moduloarray = new int[10];

        int j = 0;
          
        System.out.println("Enter numbers for the first array");
        for(j = 0; j <= 9; j++){
          System.out.print("Enter number " + (j + 1) + ": ");
          array5[j] = ck.nextInt();
        }
        
        System.out.println("Enter numbers for the second array");
        for(j = 0; j <= 9; j++){
          System.out.print("Enter number " + (j + 1) + ": ");
          array6[j] = ck.nextInt();
        }

         for(j = 0; j <= 9; j++){
          sumarray1[j] = array5[j] + array6[j];

          diffarray[j] = array5[j] - array6[j];

          quotarray[j] = array5[j] / array6[j];

          moduloarray[j] = array5[j] % array6[j]; 
            System.out.println("Sum = " + sumarray1[j] + " " + "\t" + "Difference = " + diffarray[j] + " " + "\t" + "Quotient = " + quotarray[j] + " " + "\t" + "Modulo Division = " + moduloarray[j] + " ");
         }
        break;



      default:
        System.out.print("Invalid");
      }
    }
  } 
