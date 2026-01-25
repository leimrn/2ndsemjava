import java.util.regex.*;
public class MobileNoValidator {
  private static final String MobileNo_REGEX = "^09\\d{9}$";
  private static final Pattern MobileNo_PATTERN = Pattern.compile(MobileNo_REGEX);
  public static boolean isValidNum(String Number) {
    return MobileNo_PATTERN.matcher(Number).matches();
  }
public static void main(String[] args) {
      String[] tests = {
      "09310303607",
      "zero91743598",
      "0975two11435"
    };
    for (String e : tests) {
      System.out.printf("%-30s -> %s%n", e, isValidNum(e));
    }
  }
}
