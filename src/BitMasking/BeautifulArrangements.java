package BitMasking;
import java.util.*;
public class BeautifulArrangements {
    public static int countArrangement(int n) {

        int[] memo = new int[1<<n];
        Arrays.fill(memo,-1);

        return solve(n, 0, memo,1);

    }


    private static int solve(int n,int mask,int[] memo,int pos) {

        if(pos>n) return 1;
        int count = 0;
        if(memo[mask]!=-1) return memo[mask];
        for (int num = 1; num <= n; num++) {

            int bit = num-1;
            if((mask & (1<<bit))==0 && (num % pos == 0 || pos % num == 0)){
                int nextMask = mask | (1 << bit);
                count+= solve(n,nextMask,memo,pos+1);
            }
        }
        return memo[mask] = count;
    }

    public static void main(String[] args) {
        int n = 2;

        System.out.println(countArrangement(n));
    }
}
