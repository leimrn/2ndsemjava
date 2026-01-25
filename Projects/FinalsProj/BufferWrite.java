import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWrite {
    public void ReadLines() {
        
        // The file we want to create/write to
        String filename = "FinalProj.txt";

        try {
            // 1. Create a FileWriter (connects to the file)
            FileWriter filewriter = new FileWriter(filename);

            // 2. Wrap it in BufferedWriter for efficiency
            BufferedWriter bufferwriter = new BufferedWriter(filewriter);

            // 3. Write data to the file
            bufferwriter.write("Hello, COM251!");
            bufferwriter.newLine(); // Moves to the next line
            bufferwriter.write("How are you today?");
            bufferwriter.newLine();
            bufferwriter.write("Always remember that you're doing well! :)");

            // 4. Close the writer
            bufferwriter.close();
            
            System.out.println("Success: File written to " + filename);

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
