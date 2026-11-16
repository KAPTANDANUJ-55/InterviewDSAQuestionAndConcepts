package SlidingWIndow;

public class CulpritIndex {
    public static long countSubarrays(int[] nums, int minK, int maxK) {

        long count = 0;
        int badIdx = -1;
        int minIdx = -1;
        int maxIdx = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < minK || nums[i] > maxK) {
                badIdx = i;
            }


            if (nums[i] == minK) {
                minIdx = i;
            }
            if (nums[i] == maxK) {
                maxIdx = i;
            }


            int validStart = Math.min(minIdx, maxIdx);
            if (validStart > badIdx) {
                count += (validStart - badIdx);
            }
        }

        return count;

    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,2,7,5};
        int minK = 1;
        int maxK = 5;

        System.out.println(countSubarrays(nums, minK, maxK));
    }
}
