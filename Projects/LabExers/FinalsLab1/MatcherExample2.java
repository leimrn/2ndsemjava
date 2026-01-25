import java.util.regex.Matcher;
import java.util.regex.Pattern;
class MatcherExample2 {
  public static void main(String[] args) {
    Pattern p = Pattern.compile("Geeks", Pattern.CASE_INSENSITIVE);
    Matcher m = p.matcher("geeksforgeeks.org");

    
    while (m.find()) {
      System.out.println("Pattern found from " + m.start() + " to " + (m.end() - 1));
    }
  }
}
