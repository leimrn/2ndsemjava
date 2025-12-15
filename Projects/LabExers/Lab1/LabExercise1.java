//LAB ACTIVITY 1
//November 21, 2025
//Programmed by: Leila Denisse C. Mirano

import java.util.Scanner;
  public class LabExercise1{
    public static void main(String []args){
    Scanner ck = new Scanner(System.in);

    System.out.print("1. Asterisk\n2. Ascending\n3. Descending\n4. Combined\n5. Sum of array(Given)\n6. Sum of array(Input)\n7. Arrray Operators\n8. Two Dimensional Array");
    System.out.print("\n\nEnter your choice: ");
    int choice = ck.nextInt();
      
    switch(choice){
      case 1://asterisk
        //asks for a number
        System.out.print("\nEnter a number: ");
        int num = ck.nextInt();
        //loops for the column
        for(int i = 1; i <= num; i++){
          System.out.print("*");
        }
<<<<<<< HEAD
        System.out.println();
=======
>>>>>>> 815da7d5dbbc017d7fc08df35f0496d1560843a3
      break;
      
      case 2://Triangle (Ascending)
        System.out.print("\nEnter a number: ");
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


      case 3://Reverse (Descending)
        System.out.print("\nEnter number: ");
        int num2 = ck.nextInt();
          //loops for the rows
          for(int i = num2; i >= 1; i--){
             //loop for the asterisk inside the line
            for(int j = 1; j <= i; j++){
              System.out.print("*");
          }
           System.out.println("");
          }
      break;
    

      case 4://Combined
        System.out.print("\nEnter number: ");
        int num3 = ck.nextInt();

          //loops for the row
          for(int i = 1; i <= num3; i++){
            //loop for the asterisk inside the line
            for(int j = 1; j <= i; j++){
            System.out.print("*");
           }
            System.out.println("");
          }
          //loops for the row
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
        int[] array1 = {1,3,5,7,9,11,13,15,17,19};
        int[] array2 = {2,4,6,8,10,12,14,16,18,20};
       
        //displays the given template
        System.out.print("\nThe sum of Array 1 and Array 2 is: \n");
          for(int i = 0; i < 10; i++){
            int sum = array1[i] + array2[i];
            System.out.println(sum);
          }
      break;
        
      case 6://Sum of array(input)
        //variables

        //array
        int[] array3 = new int[10];
        int[] array4 = new int[10];
        int[] sumarray = new int[10];
        int i = 0;
          
        System.out.println("\nEnter numbers for the first array");
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

        //variable
        int j = 0;

        System.out.println("\nEnter numbers for the first array");
        for(j = 0; j <= 9; j++){
          System.out.print("Enter number " + (j + 1) + ": ");
          array5[j] = ck.nextInt();
        }

        System.out.println("Enter numbers for the second array");
        for(j = 0; j <= 9; j++){
          System.out.print("Enter number " + (j + 1) + ": ");
          array6[j] = ck.nextInt();
        }

        //process
         for(j = 0; j <= 9; j++){
          sumarray1[j] = array5[j] + array6[j];
          diffarray[j] = array5[j] - array6[j];
          quotarray[j] = array5[j] / array6[j];
          moduloarray[j] = array5[j] % array6[j];
        }
        System.out.println();
        //prints the sum arrays
        System.out.print("The sum of 2 arrays are: ");
        for (j = 0; j < 10; j++) {
            System.out.print(sumarray1[j] + " ");
        }
        System.out.println();

        //print the diffarray
        System.out.print("The difference 2 arrays are: ");
        for (j = 0; j < 10; j++) {
            System.out.print(diffarray[j] + " ");
        }
        System.out.println();

        //print the quotient array
        System.out.print("The quotient 2 arrays are: ");
        for (j = 0; j < 10; j++) {
            System.out.print(quotarray[j] + " ");
        }
        System.out.println();

        //print the modulo array
        System.out.print("The modulo 2 arrays are: ");
        for (j = 0; j < 10; j++) {
            System.out.print(moduloarray[j] + " ");
        }

        break;

        case 8://two dimensiona array
          int[][] twodimarr = {{1,2}, {3,4}, {5,6}, {7,8}, {9,10}};
          int[][] twodimarr1 = {{10,20}, {30,40}, {50,60}, {70,80}, {90,100}};
        
          for(int k = 0; k < twodimarr.length; k++){
            int sum = twodimarr[k][0] + twodimarr1[k][0];
            int sum1 = twodimarr[k][1] + twodimarr1[k][1];
            System.out.println(sum+ " " + sum1);
          }
          break;

      default:
        System.out.print("Invalid");
      }
    }
  } 
