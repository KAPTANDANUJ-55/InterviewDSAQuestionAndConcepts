package BitManipulation;

public class LongestSubsequenceWithNonZeroXor {

    public static int longestSubsequence(int[] nums) {
        int n = nums.length;
        int totalXor = 0;
        boolean hasNonZero = false;


        for (int x : nums) {
            totalXor ^= x;
            if (x > 0) {
                hasNonZero = true;
            }
        }


        if (totalXor != 0) {
            return n;
        }


        if (hasNonZero) {
            return n - 1;
        }


        return 0;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3};

        System.out.println(longestSubsequence(nums));


    }
}
