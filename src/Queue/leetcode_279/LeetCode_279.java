package Queue.leetcode_279;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ji YongGuang.
 * @date 0:12 2019/1/17.
 * @description 完全平方数
 * 类似于图论中的求无权图的最短路径
 */
public interface LeetCode_279 {
    class Pair {
        int key;
        int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }
    }


    class Solution {
        public int numSquares(int n) {
            Queue<Pair> queue = new LinkedList<>();
            int[] visited = new int[n + 1];// 访问过的数字，后续没有再记录的必要
            queue.add(new Pair(n, 0));

            while (!queue.isEmpty()) {
                Pair p = queue.poll();
                int num = p.getKey();// num代表小于数字n的 被减去平方和的一个数
                int step = p.getValue();// step代表n到达num所需要的最少步数

                if (num == 0)
                    return step;

                for (int i = 1; ; i++) {// 把该数的所有平方和减一遍存到队列中。直到出现0为止
                    int tar = num - i * i;

                    if (tar < 0)
                        break;
                    if (tar == 0)
                        return step + 1;
                    if (visited[tar] == 0) {
                        queue.add(new Pair(num - i * i, step + 1));
                        visited[tar] = i;
                    }
                }
            }
            return 0;
        }
    }
}
