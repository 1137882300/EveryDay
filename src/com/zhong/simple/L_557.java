package com.zhong.simple;

import java.util.Arrays;

/**
 * Created by cc on 2021/9/12
 * 557. 反转字符串中的单词 III
 * 双指针
 */
public class L_557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String reverseWords = new L_557().reverseWords(s);
        System.out.println(reverseWords);
    }

    /**
     * 操作原字符串
     */
//    public String reverseWords(String s) {
//
//        String[] split = s.split(" ");
//        for (int i = 0; i < split.length; i++) {
//            int left = 0, right = split[i].length()-1;
//            String string = split[i];
//            StringBuilder builder = new StringBuilder(string);
//            while (left < right){
//                builder.reverse();
//                char temp = string.charAt(left);
//                string.replace(string.charAt(left), string.charAt(right));
//                string.replace(string.charAt(right), temp);
//                left++;
//                right--;
//            }
//        }
//        return Arrays.toString(split);
//    }

    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            String string = split[i];
            StringBuilder builder = new StringBuilder(string);
            StringBuilder reverse = builder.reverse();
            stringBuilder.append(reverse);
            if (i != split.length-1){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }



}
/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * 示例：
 * 输入："Let's take LeetCode contest"
 * 输出："s'teL ekat edoCteeL tsetnoc"
 *
 * 提示：
 * 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 * */
