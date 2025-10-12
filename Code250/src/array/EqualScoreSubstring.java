package array;

public class EqualScoreSubstring {
    public static void main(String[] args) {
        String s = "abab";
        boolean result = scoreBalance(s);
        System.out.println(result);
    }

    public static boolean scoreBalance(String s) {
        int totalScore = 0;
        for (int i = 0; i<s.length(); i++) {
            totalScore += s.charAt(i) - 'a' + 1;
        }

        int leftScore = 0;
        for (int i = 0; i<s.length() - 1; i++) {
            leftScore += s.charAt(i) - 'a' + 1;
            int rightScore = totalScore - leftScore;

            if (leftScore == rightScore) {
                return true;
            }
        }
        return false;


    }
}
