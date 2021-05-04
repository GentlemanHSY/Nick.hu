import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class One {
    public static void main(String[] args) {
        //问题：给定一个数组和一个目标和，从数组中找两个数字相加等于目标和，输出这两个数字的下标。
        /**
         * 给定数组，给定目标值
         * 遍历两次数组，值相加判断是否等于目标值
         * 记录两次位置，打印出来
         *
         *
         * 方法： 1、先敲“/”在敲两个**，然后回车
         * 方法： 2、alt+shift+J
         * 添加 注释  Ctrl+Shift+/,
         * 去除注释的快捷键是Ctrl+Shift+\
         *
         * idea默认快捷键：
         * 去掉空白： Ctrl + Shift + J
         * 格式化代码： Ctrl + Alt + L
         */
        int[] givenum = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetnum = 8;
        int[] returnnum=new sum().twoSum(givenum,targetnum);
        System.out.println(Arrays.toString(returnnum));
    }
}

class sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            if (map.containsKey(sub) && map.get(sub) != i) {
                return new int[]{i, map.get(sub)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}


