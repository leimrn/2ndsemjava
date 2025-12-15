import java.util.Scanner;
  public class avearray{
    public static void main(String[] args){
      Scanner ck = new Scanner(System.in);
     //variables
      int i = 0, ave = 0, finalsum = 0, sumarray1 = 0, sumarray2 = 0, sumarray3 = 0, avearray1 = 0, avearray2 = 0;
      //asks for the size of the first array
       System.out.print("Enter the size of your first array: ");
       int size1 = ck.nextInt();
       int[] array1 = new int[size1];

       //asks for the size 2nd array
       System.out.print("Enter the size of your 2nd array: ");
       int size2 = ck.nextInt();
       int[] array2 = new int[size2];

       //process for the final size
       int finalsize = (size1 + size2) / 2;

       //user input number for 1st array
       System.out.print("\nEnter " + size1 + " numbers for the first array: \n");
       for(i = 0; i < size1; i++){
         System.out.print("Enter number " + (i + 1) + ": ");
         array1[i] = ck.nextInt();
       }
       System.out.print("\nEnter " + size2 + " numbers for the second array: \n");
       for(i = 0; i < size2; i++){
         System.out.print("Enter number " + (i + 1) + ": ");
         array2[i] = ck.nextInt();
       }

       //process for the sums of arrays

        for(i = 0; i < finalsize; i++){
      
          sumarray1 = sumarray1 + array1[i];
          sumarray2 = sumarray2 + array2[i];
        
        }

        //process for average
        avearray1 = sumarray1 / size1;
        avearray2 = sumarray2 / size2;
        ave = finalsum / finalsize;


        System.out.println("Average of Array 1: " + avearray1);
        System.out.println("Average of Array 2: " + avearray2);
        System.out.println("Average of both arrays: " +  ave);

    }
  }
