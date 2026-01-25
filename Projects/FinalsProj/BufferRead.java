import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead {
    public void ReadFile() {

      //file you want to read
        String filename = "FinalProj.txt";

        try {
            FileReader filereader = new FileReader(filename); 
            BufferedReader bufferreader = new BufferedReader(filereader);

            //reads strings inside the txt
            String line; 
            while ((line = bufferreader.readLine()) != null) { 
                System.out.println(line); 
            }

            bufferreader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
