public class Test_03 {

    public static void main(String[] args) {
        System.out.println("abc".matches("abc")); // 输出为 true
        System.out.println("ab".matches("abc")); // 输出为 false
        System.out.println("Abc".matches("abc")); // 输出为 false

        System.out.println("a&b".matches("a\\&b")); // 输出为 true

        System.out.println("1".matches("\\d\\d")); // 输出为 false
        System.out.println("11".matches("\\d\\d")); // 输出为 true
        System.out.println("111".matches("\\d\\d")); // 输出为 false

        System.out.println("1".matches("\\d{1,2}")); // 输出为 true
        System.out.println("12".matches("\\d{1,2}")); // 输出为 true
        System.out.println("123".matches("\\d{1,2}")); // 输出为 false

        System.out.println("123".matches("\\d{2,}")); // 输出为 true
    }

}
