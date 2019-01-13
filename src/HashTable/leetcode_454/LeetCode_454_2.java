package HashTable.leetcode_454;

import java.util.HashMap;

/**
 * @author Ji YongGuang.
 * @date 17:05 2019/1/11.
 * @description
 */
public class LeetCode_454_2 {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        if (A == null || B == null || C == null || D == null)
            throw new IllegalArgumentException("Illegal argument");

        HashMap<Integer, Integer> mapAB = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < B.length; j++) {
                int sum = A[i] + B[j];
                if (mapAB.containsKey(sum))
                    mapAB.put(sum, mapAB.get(sum) + 1);
                else
                    mapAB.put(sum, 1);
            }

        HashMap<Integer, Integer> mapCD = new HashMap<Integer, Integer>();
        for (int i = 0; i < C.length; i++)
            for (int j = 0; j < D.length; j++) {
                int sum = C[i] + D[j];
                if (mapCD.containsKey(sum))
                    mapCD.put(sum, mapCD.get(sum) + 1);
                else
                    mapCD.put(sum, 1);
            }

        int res = 0;
        for (Integer sumab : mapAB.keySet()) {
            if (mapCD.containsKey(-sumab))
                res += mapAB.get(sumab) * mapCD.get(-sumab);
        }

        return res;
    }
}
