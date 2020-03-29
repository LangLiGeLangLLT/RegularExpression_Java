public class Test_11 {

    public static void main(String[] args) {
        String message = "肚...子。。好饿........，....早知道.....当.....初...。。。多.....刷.....点。。。力.....扣了.........！";
        System.out.println(message.replaceAll("[.。\\s]+", ""));
    }

}
