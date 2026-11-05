package Arrays;

public class MinimumAbsoluteDifference {
    public static int minimumAverageDifference(int[] nums) {
        int n = nums.length;


        long[] naiveArray1 = new long[n];
        long[] naiveArray2 = new long[n];
        if(n==1) return 0;


        naiveArray1[0] = nums[0];
        for (int i = 1; i < n; i++) {
            naiveArray1[i] = naiveArray1[i - 1] + nums[i];
        }


        naiveArray2[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            naiveArray2[i] = naiveArray2[i + 1] + nums[i];
        }


        long minAvg = Long.MAX_VALUE;

        int index=0;
        for(int i=0;i<n;i++){
            long lA = naiveArray1[i]/(i+1);
            long rA =  (i==(n-1))?0:naiveArray2[i+1]/(n-i-1);


            long avg = Math.abs(rA-lA);

            if(minAvg>avg){
                minAvg=avg;
                index=i;
            }
        }

        return index;
    }


    public static void main(String[] args) {
        int[] nums = {2,5,3,9,5,3};
          int res = minimumAverageDifference(nums);

        System.out.println(res);
    }
}
