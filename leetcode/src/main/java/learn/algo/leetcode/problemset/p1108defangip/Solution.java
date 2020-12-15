package learn.algo.leetcode.problemset.p1108defangip;

/*
1108. Defanging an IP Address

Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".
 */
@SuppressWarnings("SpellCheckingInspection")
public class Solution {
    public String defangIPaddr(String address) {
        return replace(address);
    }

    /*
    Result:
    Runtime: 0 ms, faster than 100.00%
    Memory Usage: 37.2 MB, less than 52.42%
     */
    @SuppressWarnings("unused")
    private String append(String address) {
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if (ch == '.') {
                r.append("[.]");
            } else {
                r.append(ch);
            }
        }
        return r.toString();
    }

    /*
    Result:
    Runtime: 0 ms, faster than 100.00%
    Memory Usage: 37 MB, less than 66.88%
     */
    private String replace(String address) {
        StringBuilder r = new StringBuilder(address);
        for (int i = 0; i < r.length(); i++) {
            if (r.charAt(i) == '.') {
                r.replace(i, i + 1, "[.]");
                i += 2;
            }
        }
        return r.toString();
    }
}
