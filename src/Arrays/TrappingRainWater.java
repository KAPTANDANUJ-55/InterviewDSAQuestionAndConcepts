package Arrays;

public class TrappingRainWater {

    public static int TrappingRainWater(int[] arr){
        if(arr==null||arr.length==0){
            return 0;
        }

        int[] left_max=new int[arr.length];
        int[] right_max=new int[arr.length];
        left_max[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            left_max[i]=Math.max(left_max[i-1],arr[i]);
        }

        right_max[arr.length-1]=arr[arr.length-1];

        for(int i=arr.length-2;i>=0;i--){
            right_max[i]=Math.max(right_max[i+1],arr[i]);

        }
        int totalWater=0;
        for(int i=0;i<arr.length;i++){
            int waterLevel= Math.min(left_max[i],right_max[i]);

            totalWater+=waterLevel-arr[i];
        }
        return totalWater;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};

        int ans = TrappingRainWater(arr);


        System.out.println(ans);
    }
}
