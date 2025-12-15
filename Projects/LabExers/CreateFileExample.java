import java.io.File;
import java.io.IOException;

public class CreateFileExample{
  public static void main(String[] args){
    try{
      //specify the file name
      File file = new File("COM251_Mirano.txt");

      //check if file already exists
      if(file.exists()){
        System.out.println("File already exists: " + file.getAbsolutePath());
      } else {
        //create new file
        if(file.createNewFile()){
          System.out.println("File created successfully: " + file.getAbsolutePath());
        } else{
          System.out.println("Failed to create the file.");
        }
      }
    }catch (IOException e){
      System.err.println("An error occuered while creating the file: " + e.getMessage());
    }
  }
}
