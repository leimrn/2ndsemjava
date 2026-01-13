import java.util.regex.Pattern;
public class SplitExample {
  public static void main(String[] args) {
    
    Pattern pattern = Pattern.compile("[, ]");
    String text = "apple banana,grape mango,orange";
    String[] result = pattern.split(text);
    System.out.println("Split results:");
    
    for (String word : result) {
      System.out.println(word);
    }
  }
}
