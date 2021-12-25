package com.supreme7.leetcode;

import java.util.ArrayList;
import java.util.Collections;
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
        int[] nums = new int[2];
        nums[0] = 10;
        nums[1] = 2;
            ArrayList arrayList = new ArrayList();
            for (int num : nums) {
                //arrayList.add(String.valueOf(num));
            }
            Collections.sort(arrayList);
            // 反转
            Collections.reverse(arrayList);
            StringBuffer result = new StringBuffer();
            for (Object o : arrayList) {
                result.append(o);
            }
        System.out.println(result);
            //return result.toString();


    }
}
