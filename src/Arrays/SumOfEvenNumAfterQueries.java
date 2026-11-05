package Arrays;
import java.util.Arrays;
public class SumOfEvenNumAfterQueries {


    // Below is brute force
    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int  n = nums.length;

        int index=0;

        int[] res = new int[queries.length];
        for(int i =0;i<queries.length;i++){
            nums[queries[i][1]] = nums[queries[i][1]]+ queries[i][0];



            int eveSum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % 2 == 0) {
                    eveSum += nums[j];
                }
            }


            res[i]=eveSum;

        }
        return res;
    }



    // Below is optimized O(M+N)

    public int[] sumEvenAfterQueriesOptimized(int[] nums, int[][] queries) {
        int n = nums.length;

        int index = 0;
        int eveSum = 0;

        // Find The Running Even Sum First

        for (int x : nums) {
            if (x % 2 == 0) eveSum += x;
        }

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {


            // What is it? huh lets take a close look it says if there is already even at query index before doing any ops minus it
            if (nums[queries[i][1]] % 2 == 0) {
                eveSum -= nums[queries[i][1]];
            }
            nums[queries[i][1]] = nums[queries[i][1]] + queries[i][0];


            if (nums[queries[i][1]] % 2 == 0) {
                eveSum += nums[queries[i][1]];
            }


            res[i] = eveSum;

        }
        return res;

    }

     public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};



        int[] res  = sumEvenAfterQueries(nums, queries);
        int [] res1 = sumEvenAfterQueries(nums, queries);

         System.out.println("The Result After Sum Of Even Num After Queries is: "+ Arrays.toString(res)+ " And Optimized Algo's Ans Is: "+Arrays.toString(res1));

    }
}
