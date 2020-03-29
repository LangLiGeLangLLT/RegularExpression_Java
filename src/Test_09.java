import java.util.Arrays;

public class Test_09 {

    public static void main(String[] args) {
        String[] messages = {
          "二分，回溯，递归，分治",
          "搜索；查找；旋转；遍历",
          "数论 图论 逻辑 概率"
        };

        // split 不恰当用法
        for (String message : messages) {
            System.out.println(Arrays.toString(splitTabs(message)));
        }

        // split 恰当用法
        for (String message : messages) {
            System.out.println(Arrays.toString(message.split("[，；\\s]")));
        }

        for (String message : messages) {
            System.out.println(message.replaceAll("[，；\\s]+", ";"));
        }

        for (String message : messages) {
            System.out.println(message.replaceAll("([，；\\s]+)", "---$1---"));
        }

    }

    public static String[] splitTabs(String tabs) {
        if (tabs.split("，").length == 4) return tabs.split("，");
        if (tabs.split("；").length == 4) return tabs.split("；");
        if (tabs.split(" ").length == 4) return tabs.split(" ");
        return new String[0];
    }
}
