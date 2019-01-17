package Stack.leetcode_71;

import java.util.*;

/**
 * @author Ji YongGuang.
 * @date 20:34 2019/1/15.
 * @description 简化路径
 */
public class LeetCode_71 {
    class Solution {
        public String simplifyPath(String path) {
            Deque<String> queue = new ArrayDeque<>();
            Set<String> skip = new HashSet<>(Arrays.asList(".", "..", ""));

            for (String s : path.split("/")) {
                if (s.equals("..") && !queue.isEmpty()) queue.pollLast();
                if (skip.contains(s)) continue;
                queue.add("/" + s);
            }

            StringBuilder sb = new StringBuilder();
            while (!queue.isEmpty()) {
                sb.append(queue.remove());
            }
            return sb.length() == 0 ? "/" : sb.toString();
        }
    }
}
