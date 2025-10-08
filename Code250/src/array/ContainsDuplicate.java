package array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicateHash(int[] nums) {



        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            } else {
                seen.add(num);
            }
        }
        return false;


    }


    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        boolean result = containsDuplicateHash(nums1);
        System.out.println(result);
    }
}
