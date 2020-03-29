public class Test_06 {

    public static void main(String[] args) {
        System.out.println("a0b".matches("a.b")); // 输出为 true
        System.out.println("a_b".matches("a.b")); // 输出为 true
        System.out.println("a b".matches("a.b")); // 输出为 true

        System.out.println("1".matches("\\d*")); // 输出为 true
        System.out.println("123".matches("\\d*")); // 输出为 true
        System.out.println("".matches("\\d*")); // 输出为 true

        System.out.println("1".matches("\\d+")); // 输出为 true
        System.out.println("123".matches("\\d+")); // 输出为 true
        System.out.println("".matches("\\d+")); // 输出为 false

        System.out.println("1".matches("\\d?")); // 输出为 true
        System.out.println("123".matches("\\d?")); // 输出为 false
        System.out.println("".matches("\\d?")); // 输出为 true
    }

}
