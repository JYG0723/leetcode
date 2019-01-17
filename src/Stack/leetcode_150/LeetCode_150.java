package Stack.leetcode_150;

import java.util.Stack;

/**
 * @author Ji YongGuang.
 * @date 18:51 2019/1/15.
 * @description 逆波兰表达式求值
 */
public class LeetCode_150 {
    class Solution {
        public int evalRPN(String[] tokens) {
            String symbol = "+-*/";
            Stack<Integer> stack = new Stack<>();

            for (String s : tokens) {

                if (!symbol.contains(s)) {
                    stack.push(Integer.parseInt(s));
                } else {
                    int res = 0;
                    int tar1 = stack.pop();
                    int tar2 = stack.pop();

                    switch (s) {
                        case "+":
                            res = tar2 + tar1;
                            break;
                        case "-":
                            res = tar2 - tar1;
                            break;
                        case "*":
                            res = tar2 * tar1;
                            break;
                        case "/":
                            res = tar2 / tar1;
                            break;
                        default:
                            break;
                    }
                    stack.push(res);
                }
            }
            return stack.pop();
        }
    }
}
