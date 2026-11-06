package Arrays;
 import java.util.*;
public class FindErrorNum {

    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        LinkedList<Integer> ans = new LinkedList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();


        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }


        for (int i =1;i<=n;i++) {
            if(hm.containsKey(i)){
                if(hm.get(i)==2){
                    ans.add(0,i);
                }
            }
            else{
                ans.add(i);
            }
        }
        return  ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,4};

        int[] res = findErrorNums(nums1);
        System.out.println(Arrays.toString(res));
    }

}
