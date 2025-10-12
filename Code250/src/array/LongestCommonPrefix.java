package array;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0) return "";

        String result = strs[0];
        for (int i = 1; i<strs.length; i++) {

            while (!strs[i].startsWith(result)) {
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty()) {
                    return "";
                }
           }
        }

        return result;
    }
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.longestCommonPrefix(strs);
        System.out.println(result);
    }
}
