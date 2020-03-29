import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_10 {

    public static void main(String[] args) {
        String[] messages = {
          "LeetCode",
          "LeetCodeeee",
          "LeetCodeee"
        };

        Pattern pattern = Pattern.compile("(\\w+)(e*)");
        for (String message : messages) {
            Matcher matcher = pattern.matcher(message);
            if (matcher.matches()) {
                String group1 = matcher.group(1);
                String group2 = matcher.group(2);
                System.out.println("group1 = " + group1 + ", length = " + group1.length());
                System.out.println("group2 = " + group2 + ", length = " + group2.length());
            }
        }

        Pattern pattern1 = Pattern.compile("(\\w+?)(e*)");
        for (String message : messages) {
            Matcher matcher = pattern1.matcher(message);
            if (matcher.matches()) {
                String group1 = matcher.group(1);
                String group2 = matcher.group(2);
                System.out.println("group1 = " + group1 + ", length = " + group1.length());
                System.out.println("group2 = " + group2 + ", length = " + group2.length());
            }
        }
    }

}
