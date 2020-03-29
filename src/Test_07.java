public class Test_07 {

    public static void main(String[] args) {
        System.out.println(isValidPhoneNumber("13754565912")); // 输出为 true
        System.out.println(isValidPhoneNumber("03754565912")); // 输出为 false
        System.out.println(isValidPhoneNumber2("13754565912")); // 输出为 true
        System.out.println(isValidPhoneNumber2("03754565912")); // 输出为 false

        System.out.println("1".matches("[1-9a-gU-Z]")); // 输出为 true
        System.out.println("b".matches("[1-9a-gU-Z]")); // 输出为 true
        System.out.println("X".matches("[1-9a-gU-Z]")); // 输出为 true
        System.out.println("A".matches("[1-9a-gU-Z]")); // 输出为 false

        System.out.println("1".matches("[0-18-9]")); // 输出为 true
        System.out.println("5".matches("[0-18-9]")); // 输出为 false

        System.out.println("1".matches("0|1|8|9")); // 输出为 true
        System.out.println("5".matches("0|1|8|9")); // 输出为 false

        System.out.println("abc".matches("abc|ABC")); // 输出为 true
        System.out.println("ABC".matches("abc|ABC")); // 输出为 true
        System.out.println("123".matches("abc|ABC")); // 输出为 false

        System.out.println("1".matches("[^1-3]")); // 输出为 false
        System.out.println("2".matches("[^123]")); // 输出为 false
        System.out.println("a".matches("[^123]")); // 输出为 true
    }

    public static boolean isValidPhoneNumber(String number) {
        return number.matches("[123456789]\\d{10}");
    }

    public static boolean isValidPhoneNumber2(String number) {
        return number.matches("[1-9]\\d{10}");
    }

}
