package Arrays;

public class LongestIncreasingTriplet {




        public static boolean increasingTriplet(int[] nums) {
            int n = nums.length;
            int[] leftMin = new int[n];
            leftMin[0] = nums[0];
            for (int i = 1; i < n; i++) {
                leftMin[i] = Math.min(leftMin[i - 1], nums[i]);
            }

            int[] rightMax = new int[n];
            rightMax[n - 1] = nums[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
            }



            for (int j = 1; j < n - 1; j++) {
                if (leftMin[j - 1] < nums[j] && nums[j] < rightMax[j + 1]) {
                    return true;
                }
            }

            return false;
        }
    // Failed Approach
        public static boolean increasingTripletWrong(int[] nums) {
            int n = nums.length;
            if (n < 3) return false;


            for (int i = 0; i < n - 2; i++) {


                int left = i + 1;
                int right = n - 1;


                while (left < right) {


                    if (nums[i] < nums[left] && nums[left] < nums[right]) {
                        return true;
                    }


                    if (nums[left] <= nums[i]) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            return false;

        }



        public static void main(String[] args) {
          int[] arr =  {1,5,0,4,1,3};

            boolean res = increasingTripletWrong(arr);
            boolean res2 = increasingTriplet(arr);
            System.out.println(res);
            System.out.println(res2); //right ans
        }

}
