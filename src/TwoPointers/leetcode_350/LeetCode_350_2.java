package TwoPointers.leetcode_350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ji YongGuang.
 * @date 17:38 2019/1/9.
 * @description 双向指针
 */
public class LeetCode_350_2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0)
            return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0;
        int p2 = 0;
        List<Integer> res = new ArrayList<Integer>();
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                res.add(nums1[p1]);
                p1++;
                p2++;
            } else if (nums1[p1] < nums2[p2])
                p1++;
            else
                p2++;
        }
        int[] t = new int[res.size()];
        for (int i = 0; i < res.size(); i++)
            t[i] = res.get(i);

        return t;
    }
}
