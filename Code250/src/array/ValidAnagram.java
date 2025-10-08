package array;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean result = validAnagram(s, t);
        System.out.println(result);
    }

    private static boolean validAnagram(String s, String t) {

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        if (sArray.length != tArray.length) {
            return false;
        }

        for (int i = 0; i < sArray.length - 1; i++) {

                if (sArray[i] != tArray[i]) {
                    return false;
                }

        }

        return true;
    }
}
