package com.zhong.simple;

import java.util.Arrays;

/**
 * Created by cc on 2021/9/10
 * 977. 有序数组的平方
 * 双指针
 */
public class L_977 {
    public static void main(String[] args) {
        int[] array = new int[]{-4,-1,0,3,10};
        int[] sortedSquares = new L_977().sortedSquares(array);
        for (int i : sortedSquares) {
            System.out.print(i + "\t");
        }
    }

    /**
     * 暴力法
     */
//    public int[] sortedSquares(int[] nums) {
//        int[] newArr = new int[nums.length];
//        //平方
//        for (int i = 0; i < nums.length; i++) {
//            newArr[i] = nums[i] * nums[i];
//        }
//        //排序
//        Arrays.sort(newArr);
////        for (int i = 0; i < newArr.length - 1; i++) {
////            int min = i;
////            for (int j = i + 1; j < newArr.length; j++) {
////                if (newArr[min] > newArr[j]){
////                    min = j;
////                }
////            }
////            if (i != min){
////                int temp = newArr[i];
////                newArr[i] = newArr[min];
////                newArr[min] = temp;
////            }
////        }
//        return newArr;
//    }

    /**利用好原本就是有序的条件
     * 双指针，归并
     */
//    public int[] sortedSquares(int[] nums) {
//         int len = nums.length;
//         int neg = -1;
//        for (int i = 0; i < len; i++) {
//            if (nums[i] < 0){
//                neg = i;
//            } else {
//                break;
//            }
//        }
//        // 负数^2变倒序，正数还是正序
//        int[] newArr = new int[len];
//        int index = 0, i = neg, j = neg + 1;
//        while(i >= 0 || j < len){
//            //全正数
//            if (i < 0){
//                newArr[index] = nums[j] * nums[j];
//                ++j;
//
//            //全负数
//            } else if (j == len){
//                newArr[index] = nums[i] * nums[i];
//                --i;
//
//            //负数＞正数
//            } else if (nums[i] * nums[i] > nums[j] * nums[j]){
//                newArr[index] = nums[j] * nums[j];
//                ++j;
//
//            //负数＜正数
//            } else {
//                newArr[index] = nums[i] * nums[i];
//                --i;
//            }
//            ++index;
//        }
//        return newArr;
//    }

    /**利用好原本就是有序的条件
     * 双指针，归并, 首尾指针
     */
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0, j = len - 1, pos = len - 1; i <= j ; ) {
            if (nums[i] * nums[i] > nums[j] * nums [j]){
                res[pos] = nums[i] * nums[i];
                ++i;
            }else {
                res[pos] = nums[j] * nums[j];
                --j;
            }
            --pos;
        }
        return res;
    }


}

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 *  
 * 示例 1：
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100]
 * 排序后，数组变为 [0,1,9,16,100]
 *
 * 示例 2：
 * 输入：nums = [-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 *  
 * 提示：
 * 1 <= nums.length <= 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums 已按 非递减顺序 排序
 *  
 * 进阶：
 * 请你设计时间复杂度为 O(n) 的算法解决本问题
 * */
