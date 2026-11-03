package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Comparator;
public class TwoSum {


    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // storing number and index
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{map.get(target - numbers[i]), i};
            }
            map.put(numbers[i],i);
        }
        return new int[]{};
    }



        public static int[] twoSumBetter(int[] nums, int target) {
            // Create a 2D array to store pairs of [value, original_index]
            int[][] numWithIndex = new int[nums.length][2];
            for (int i = 0; i < nums.length; i++) {
                numWithIndex[i][0] = nums[i];
                numWithIndex[i][1] = i;
            }


            Arrays.sort(numWithIndex, Comparator.comparingInt(a -> a[0]));

            int left = 0;
            int right = nums.length - 1;

            while (left < right) {
                int sum = numWithIndex[left][0] + numWithIndex[right][0];

                if (sum == target) {
                    return new int[]{numWithIndex[left][1], numWithIndex[right][1]};
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
            return new int[]{};

    }


    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);

      System.out.println("Your Result Of Array "+ Arrays.toString(numbers) +" With Target "+target+" is "+result[0]+" and "+result[1]);
        int[] resultBetter = twoSumBetter(numbers, target);

        System.out.println("Your Better Solution Result Of Array "+ Arrays.toString(numbers) +" With Target "+target+" is "+resultBetter[0]+" and "+resultBetter[1]);



    }
}
