package com.supreme7.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/21 下午10:43
 * @Description:
 */
public class FindDuplicatesSolution {
    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 3;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 3;

        for (int i = 0; i < nums.length; i++) {
            Set hashSet = new HashSet();
            hashSet.add(nums[i]);
            if (hashSet.size()<i+1){
                System.out.println(nums[i]);
            }
        }
    }
}
