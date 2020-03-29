import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_08 {

    public static void main(String[] args) {
        System.out.println("Name：Aurora        Age：18".matches("Name：\\w+\\s*Age：\\d{1,3}")); // 输出为 true
        System.out.println("其中还夹杂着一些无关紧要的数据".matches("Name：\\w+\\s*Age：\\d{1,3}")); // 输出为 false
        System.out.println("Name：Bob            Age：20".matches("Name：\\w+\\s*Age：\\d{1,3}")); // 输出为 true
        System.out.println("错误的数据有着各种各样错误的格式".matches("Name：\\w+\\s*Age：\\d{1,3}")); // 输出为 false
        System.out.println("Name：Cassin        Age：22".matches("Name：\\w+\\s*Age：\\d{1,3}")); // 输出为 true

        String[] messages = {
                "Name：Aurora        Age：18",
                "其中还夹杂着一些无关紧要的数据",
                "Name：Bob            Age：20",
                "错误的数据有着各种各样错误的格式",
                "Name：Cassin        Age：22"
        };

        Pattern pattern = Pattern.compile("Name：(\\w+)\\s*Age：(\\d{1,3})");
        for (String message : messages) {
            Matcher matcher = pattern.matcher(message);
            if (matcher.matches()) {
                String group0 = matcher.group(0);
                String group1 = matcher.group(1);
                String group2 = matcher.group(2);
                System.out.println(group0);
                System.out.println(group1);
                System.out.println(group2);
            }
        }

        // 错误的做法，每次都会新建一个 Pattern，效率低
        boolean result1 = "Name：Aurora        Age：18".matches("Name：\\w+\\s*Age：\\d{1,3}");
        boolean result2 = "Name：Bob            Age：20".matches("Name：\\w+\\s*Age：\\d{1,3}");
        boolean result3 = "Name：Cassin        Age：22".matches("Name：\\w+\\s*Age：\\d{1,3}");

        // 正确的做法，复用同一个 Pattern，效率高
        Pattern pattern1 = Pattern.compile("Name：\\w+\\s*Age：\\d{1,3}");
        boolean result4 = pattern.matcher("Name：Aurora        Age：18").matches();
        boolean result5 = pattern.matcher("Name：Bob            Age：20").matches();
        boolean result6 = pattern.matcher("Name：Cassin        Age：22").matches();
    }

}
