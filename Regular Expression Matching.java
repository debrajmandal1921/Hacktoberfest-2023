import java.util.regex.*;

public class RegexMatching {
    public static void main(String[] args) {
        String text = "This is an example string that contains some numbers like 12345 and 42.";
        String pattern = "\\d+";  // Match one or more digits

        // Create a Pattern object
        Pattern regexPattern = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = regexPattern.matcher(text);

        // Find and print all matches
        while (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        }
    }
}
