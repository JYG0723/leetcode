package HashTable.leetcode_447;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ji YongGuang.
 * @date 17:45 2019/1/11.
 * @description 回旋镖的数量(需要考虑元组的顺序)
 */
public class LeetCode_447 {
    class Solution {// (i, j, k)，i 和 j 之间的距离和 i 和 k 之间的距离相等

        public int numberOfBoomerangs(int[][] points) {// [[0,0],[1,0],[2,0]]
            Map<Integer, Integer> maps = new HashMap<>();
            int res = 0;

            for (int i = 0; i < points.length; i++) {
                for (int j = 0; j < points.length; j++) {
                    if (i == j)
                        continue;

                    int len = getLen(points[i], points[j]);
                    maps.put(len, maps.getOrDefault(len, 0) + 1);
                }

                for (Integer value : maps.values()) {
                    res += value * (value - 1);// 由于元组顺序需要考虑
                }
                maps.clear();
            }
            return res;
        }

        private int getLen(int[] a, int[] b) {
            int x = a[0] - b[0];
            int y = a[1] - b[1];
            return x * x + y * y;
        }
    }
}
