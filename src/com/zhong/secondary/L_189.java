package com.zhong.secondary;


/**
 * Created by cc on 2021/9/10
 */
public class L_189 {
    public static void main(String[] args) {
        int[] arr = new int[]{-1,2,3,4};
        int k = 3;
        new L_189().rotate(arr, k);
    }

    /**
     * 当 len < key 时不适用
     */
//    public void rotate(int[] nums, int k) {
//        int len = nums.length;
//        int[] tem = new int[k];
//        for (int i = 0, j = len-1-k; i < k; ) {
//            tem[i++] = nums[++j];
//        }
//
//        for (int i = 0, pos = len-1-k; i <= len -1- k; i++) {
//            nums[pos+k] = nums[pos];
//            pos--;
//        }
//
//        for (int i = 0; i < k; i++) {
//            nums[i] = tem[i];
//        }
//        for (int t : nums){
//            System.out.print(t + "\t");
//        }
//
//    }

    /**
     * 暴力法
     */
    public void rotate(int[] nums, int k){
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[(i+k)%nums.length] = nums[i];
        }
        System.arraycopy(res,0,nums,0,nums.length);
        for (int i : res){
            System.out.print(i + "\t");
        }
}

}
/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 *  进阶：
 *  尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 *  你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？
 *   
 *  示例 1:
 *  输入: nums = [1,2,3,4,5,6,7], k = 3
 *  输出: [5,6,7,1,2,3,4]
 *  解释:
 *  向右旋转 1 步: [7,1,2,3,4,5,6]
 *  向右旋转 2 步: [6,7,1,2,3,4,5]
 *  向右旋转 3 步: [5,6,7,1,2,3,4]
 *
 *  示例 2:
 *  输入：nums = [-1,-100,3,99], k = 2
 *  输出：[3,99,-1,-100]
 *  解释:
 *  向右旋转 1 步: [99,-1,-100,3]
 *  向右旋转 2 步: [3,99,-1,-100]
 *
 *  提示：
 *  1 <= nums.length <= 2 * 10^4
 *  -2^31 <= nums[i] <= 2^31 - 1
 *  0 <= k <= 10^5
 * */
