package learn.algo.leetcode.problemset.p0006zigzag;

/*
ZigZag Conversion

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
(you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R

And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:
string convert(string s, int numRows);

Result:
Runtime: 5 ms, faster than 73.44%
Memory Usage: 39.6 MB, less than 54.81%

 */
public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] builders = new StringBuilder[numRows];
        for (int i = 0; i < builders.length; i++) {
            builders[i] = new StringBuilder();
        }
        int row = 0;
        boolean down = true;
        for (int i = 0; i < s.length(); i++) {
            builders[row].append(s.charAt(i));
            if (down) {
                row++;
                if (row == builders.length) {
                    down = false;
                    row = builders.length - 2;
                }
            } else {
                row--;
                if (row < 0) {
                    down = true;
                    row = 1;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (row = 0; row < builders.length; row++) {
            sb.append(builders[row].toString());
        }
        return sb.toString();
    }
}
