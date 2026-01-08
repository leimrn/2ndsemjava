import java.io.File;
import java.io.IOException;

public class FileTry{
  public static void main(String []args){
    try{
      File file = new File("Lab3Trial.txt");

      if(file.exists()){
        System.out.println("File already exists: " + file.getAbsolutePath());
      } else {
        if(file.createNewFile()){
          System.out.println("File created successfully: " + file.getAbsolutePath());
        } else {
          System.out.println("Failed to create the file.");
        }
      }
    }catch (IOException e){
      System.err.println("An error occured while creatiing the file: " + e.getMessage());
    }
  }
}
