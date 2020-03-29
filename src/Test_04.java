public class Test_04 {

    public static void main(String[] args) {
        System.out.println("LeetCode_666".matches("\\w{12}")); // 输出为 true
        System.out.println("\t \n".matches("\\s{3}")); // 输出为 true
        System.out.println("Leet\tCode 666".matches("\\w{4}\\s\\w{4}\\s\\d{3}")); // 输出为 true
    }

}
