public class Test_02 {

    public static void main(String[] args) {
        System.out.println(isValidPhoneNumber("13754565912")); // 输出为 true
    }

    /*public static boolean isValidPhoneNumber(String number) {
        if (number.length() != 11) {
            return false;
        }

        for (int i = 0; i < number.length(); ++i) {
            if (number.charAt(i) < '0' || number.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }*/

    public static boolean isValidPhoneNumber(String number) {
        return number.matches("\\d{11}");
    }

}
