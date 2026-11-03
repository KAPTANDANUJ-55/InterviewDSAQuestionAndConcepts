package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    while(left<right && nums[left]== nums[left+1]) left++;
                    while(left<right && nums[right]== nums[right-1]) right--;

                    left++;
                    right--;

                }
                else if(sum>0){
                    right--;
                }
                else if(sum<0){
                    left++;
                }

            }


        }
        return res;





    }   // Brute Force

    public static List<List<Integer>> threeSumBrute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                for(int k=j+1;k<nums.length;k++){

                    if(k>j+1&&nums[k]==nums[k-1]){
                        continue;
                    }

                    int sum =  nums[i]+nums[j]+nums[k];

                    if(sum==0){
                        res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }

                }
            }
        }
        return res;
    }

     public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = threeSum(arr);
        List<List<Integer>> res2 = threeSumBrute(arr);
        System.out.println(Arrays.toString(res.toArray()));
         System.out.println(Arrays.toString(res2.toArray()));
    }
}




