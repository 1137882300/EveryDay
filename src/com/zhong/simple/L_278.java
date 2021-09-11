package com.zhong.simple;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Created by cc on 2021/9/8
 * 278. 第一个错误的版本
 */
public class L_278 {
    public static void main(String[] args) {
        int version = new L_278().firstBadVersion(5);
        System.out.println(version);
    }

    public boolean isBadVersion(int version){
        int badStart = 4;
        if (version >= badStart){
            return true;
        }
        return false;
    }

    /**
     * 暴力法
     */
//    public int firstBadVersion(int n) {
//        for (int i = n; i > 0; i--) {
//            if (Boolean.TRUE.equals(isBadVersion(i)) && Boolean.FALSE.equals(isBadVersion(i-1))){
//                return i;
//            }
//        }
//        return -1;
//    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right){
            int middle = left + (right - left) / 2;
            if (isBadVersion(middle)){
                right = middle;
            }else {
                left = middle + 1;
            }
        }
        return right;
    }


}

/**
 * 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。
 * 由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
 * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
 * 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。
 * 实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
 *
 * 示例 1：
 * 输入：n = 5, bad = 4
 * 输出：4
 * 解释：
 * 调用 isBadVersion(3) -> false
 * 调用 isBadVersion(5) -> true
 * 调用 isBadVersion(4) -> true
 * 所以，4 是第一个错误的版本。
 *
 * 示例 2：
 * 输入：n = 1, bad = 1
 * 输出：1
 *
 * 提示：
 * 1 <= bad <= n <= 2^31 - 1
 */
