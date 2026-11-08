package BitManipulation;
import java.util.*;
public class MaximumXorToMaximizeK {

    public static int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;

        int[] kA = new int[n];

        int currXor=0;

        for(int i=0;i<n;i++){
            currXor ^= nums[i];
        }
        int maxK = (1 << maximumBit) - 1;

        for(int i=0;i<n;i++){

            kA[i] =  currXor^maxK;

            currXor^= nums[n-i-1];


        }
        return kA;
    }

    public static void main(String[] args) {
        int[]  nums = {0,1,1,3};
        int maximumBit = 2;


        System.out.println(Arrays.toString(getMaximumXor(nums,maximumBit)));
    }
}
