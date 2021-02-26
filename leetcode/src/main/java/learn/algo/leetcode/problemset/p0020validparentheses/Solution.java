package learn.algo.leetcode.problemset.p0020validparentheses;

import java.util.ArrayDeque;
import java.util.Deque;

/*
20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.
An input string is valid if:
1) Open brackets must be closed by the same type of brackets.
2) Open brackets must be closed in the correct order.
 */
public class Solution {
    private static final char[] OPENING = new char[] {'(', '[', '{'};
    private static final char[] CLOSING = new char[] {')', ']', '}'};

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int openingIdx = index(OPENING, ch);
            if (openingIdx != -1) {
                stack.push(ch);
                continue;
            }
            int closingIdx = index(CLOSING, ch);
            if (closingIdx != -1) {
                if (stack.isEmpty()) {
                    return false;
                }
                char expected = OPENING[closingIdx];
                if (stack.peek() == expected) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private int index(char[] chars, char ch) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                return i;
            }
        }
        return -1;
    }
}
