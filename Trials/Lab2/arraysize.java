import java.util.Scanner;
  public class arraysize{
    public static void main(String[] args){
      Scanner ck = new Scanner(System.in);

      int i = 0;
      //asks for the size of the first array
       System.out.print("Enter the size of your first array: ");
       int size1 = ck.nextInt();
       int[] array1 = new int[size1];

       //asks for the size 2nd array
       System.out.print("Enter the size of your 2nd array: ");
       int size2 = ck.nextInt();
       int[] array2 = new int[size2];

        //array
        int[] sumarray1 = new int[size1];
        int[] diffarray = new int[size1];
        int[] quotarray = new int[size1];
        int[] moduloarray = new int[size1];


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

       //process
        for(i = 0; i < size1; i++){
          sumarray1[i] = array1[i] + array2[i];
          diffarray[i] = array1[i] - array2[i];
          quotarray[i] = array1[i] / array2[i];
          moduloarray[i] = array1[i] % array2[i];
        }
      // Print Header
      System.out.println("\nArray 1\t\tArray 2\t\tSum\t\tDifference\tDivision\tModulo Division");
      // Print Data Row
      for(i = 0; i < size1; i++){
      System.out.println(array1[i] + "\t\t" + array2[i] + "\t\t" + sumarray1[i] + "\t\t" + diffarray[i] + "\t\t" + quotarray[i] + "\t\t" + moduloarray[i] + "\t\t");
      }
    }
  }
