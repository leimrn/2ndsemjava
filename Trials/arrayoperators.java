import java.util.Scanner;
  public class arrayoperators{
    public static void main(String []args){
    Scanner ck = new Scanner(System.in);

    int[] array5 = new int[10];
    int[] array6 = new int[10];
    int[] sumarray1 = new int[10];
    int[] diffarray = new int[10];
    int[] quotarray = new int[10];
    int[] moduloarray = new int[10];

    //variable
    int j = 0;

      //for loop for user to input 10 numbers
      System.out.println("\nEnter numbers for the first array");
        for(j = 0; j <= 9; j++){
          System.out.print("Enter number " + (j + 1) + ": ");
          array5[j] = ck.nextInt();
        }
       //for loop for user to input 10 numbers
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
  }
}
