package Arrays;

import java.util.Arrays;

public class TwoSumInputSorted {

    public  static int[] twoSum(int[] nums, int target) {
        int[][] numWithIndex = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            numWithIndex[i][0] = nums[i];
            numWithIndex[i][1] = i;
        }



        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = numWithIndex[left][0] + numWithIndex[right][0];

            if (sum == target) {
                return new int[]{numWithIndex[left][1]+1, numWithIndex[right][1]+1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(nums, target);

        System.out.println(Arrays.toString(res));
    }

}
