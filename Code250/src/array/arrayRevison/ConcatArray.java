package array.arrayRevison;

import java.util.Arrays;

public class ConcatArray {

    public static void main(String[] args) {
        int[] one = {1,2,3};

        int[] result = concatArrayPrint(one);
        System.out.println(Arrays.toString(result));
    }

    private static int[] concatArrayPrint(int[] one) {
        int n = one.length;
        int[] ans = new int[2*n];

        for (int i = 0; i<2*n; i++) {
//            ans[i] = one[i];
            ans[i] = one[i%n];
        }
        return ans;
    }
}
