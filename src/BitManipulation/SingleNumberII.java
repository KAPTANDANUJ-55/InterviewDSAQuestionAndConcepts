package BitManipulation;

import java.util.*;

// it will be a follow up question
public class SingleNumberII {


    //1. Brute Force -1
    public static int singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm  = new HashMap<>();


        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }



        for(int i=0;i<n;i++){
            if(hm.containsKey(nums[i])){
                if(hm.get(nums[i])==1) return nums[i];
            }
        }

        return -1;
    }


    //2. Brute Force 2




    //3. Bit Manipulation

    
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,0,1,99};

        System.out.println(singleNumber(nums));
    }
}
