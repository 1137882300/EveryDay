package com.zhong.simple;

/**
 * Created by cc on 2021/9/11
 * 283. 移动零
 * 双指针
 */
public class L_283 {
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,4,0,0,3,0,5,1,0};
        new L_283().moveZeroes(arr);
    }

    /**
     * 前后指针，暴力法
     */
//    public void moveZeroes(int[] nums) {
//        int len = nums.length;
//        if (len <= 1) return;
//        int left = 0, right = 1;
//        while (right <= len - 1 && left <= len - 1){
//            if (nums[left] == 0){
//                if ( nums[right] != 0){
//                    int temp = nums[right];
//                    nums[right] = nums[left];
//                    nums[left] = temp;
//                } else {
//                    right ++;
//                }
//            } else {
//                left ++;
//            }
//            if (left > right){
//                right = left + 1;
//            }
//        }
//
//        for (int i : nums){
//            System.out.print(i + "\t");
//        }
//    }

    /**
     * 分类抓元素
     */
    public void moveZeroes(int[] nums){
        if (nums == null || nums.length <= 1){
            return;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 ){
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length ; i++) {
            nums[i] = 0;
        }

        for (int l : nums){
            System.out.print(l + "\t");
        }

    }


}
/**
 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

 示例:
 输入: [0,1,0,3,12]
 输出: [1,3,12,0,0]
 说明:

 必须在原数组上操作，不能拷贝额外的数组。
 尽量减少操作次数。
 **/
