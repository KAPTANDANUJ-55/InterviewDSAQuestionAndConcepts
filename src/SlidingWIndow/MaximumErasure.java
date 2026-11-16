package SlidingWIndow;

public class MaximumErasure {
    public static int maximumUniqueSubarray(int[] nums) {
        boolean[] seen = new boolean[10001];
        int n = nums.length;
        int maxSum=0;
        int currSum =0;
        int left =0;
        for(int i=0;i<n;i++){
            currSum+= nums[i];
            while(seen[nums[i]]){
                seen[nums[left]]=false;
                currSum -= nums[left];
                left++;
            }



            seen[nums[i]] = true;
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,4,5,6};
        System.out.println(maximumUniqueSubarray(nums));
    }
}
