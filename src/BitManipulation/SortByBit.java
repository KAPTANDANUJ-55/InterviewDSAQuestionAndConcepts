package BitManipulation;
import java.util.*;
public class SortByBit {
    public static int[] sortByBits(int[] arr) {
        int n = arr.length;

        Integer[] k = new Integer[n];
        int curP=0;
        for (int i = 0; i < n; i++) {
            k[i] = arr[i];
        }
        Arrays.sort(k , (a,b) -> {
            int bitCountA = countBit(a);
            int bitCountB = countBit(b);


            if (bitCountA != bitCountB) {
                return Integer.compare(bitCountA, bitCountB);
            }

            return Integer.compare(a, b);
        });

        for(int i=0;i<n;i++){
            arr[i] = k[i];
        }
        return arr;
    }

    private static int countBit(int n){
        int count=0;
        while(n>1){
            count += (n&1);

            n = n >> 1;
        }
        if(n==1) count++;


        return count;

    }


    public static void main(String[] args) {
       int[] arr = {1024,512,256,128,64,32,16,8,4,2,1};

        System.out.println(Arrays.toString(sortByBits(arr)));
    }
}
