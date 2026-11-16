package SlidingWIndow;

import java.util.Arrays;

public class FindThePowerOfKSizeSubarray {
    public static int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int con=1;
        int[] res = new int[n-k+1];
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]+1){
                con++;
            }else{
                con=1;
            }


            if(i>=k-1){

                if(con>=k)
                    res[i-k+1] = nums[i];

                else {
                    res[i - k + 1] = -1;
                }
            }


        } return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,2,5};
        int k = 3;
        System.out.println(Arrays.toString(resultsArray(nums, k)));
    }
}
