public class Test_05 {

    public static void main(String[] args) {
        System.out.println("a".matches("\\d")); // 输出为 false
        System.out.println("1".matches("\\d")); // 输出为 true

        System.out.println("a".matches("\\D")); // 输出为 true
        System.out.println("1".matches("\\D")); // 输出为 false
    }

}
