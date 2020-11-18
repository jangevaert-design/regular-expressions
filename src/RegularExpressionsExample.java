import java.util.regex.Pattern;

public class RegularExpressionsExample {

  public static void main(String[] args) {
    // if String is a number or not.
    Pattern pattern = Pattern.compile(".*[^0-9].*");
    //instead of [^0-9] use \\D
    String[] inputs = {"123", "-123", "123.12", "abcd123"};

    for (String input : inputs) {
      System.out.println("does " + input + " is a number: " + !pattern.matcher(input).matches());
    }

    //Regex to check whether String is a 6 digit number or not.
    String[] numbers = {"123", "-123", "123.12", "abcd123", "123456"};
    Pattern digitPattern = Pattern.compile("\\d{6}");

    for (String number: numbers) {
      System.out.println("does " + number + " is a 6 digit number: " + digitPattern.matcher(number).matches());
    }
  }

}
