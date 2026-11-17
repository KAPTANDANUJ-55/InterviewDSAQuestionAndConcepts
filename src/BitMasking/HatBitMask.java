package BitMasking;
import java.util.*;
public class HatBitMask {

        private static final int MOD = 1_000_000_007;
        private static int targetMask;
        private static List<Integer>[] hatToPeople;
        private static int[][] dp;

        public static int numberWays(List<List<Integer>> hats) {
            int n = hats.size();
            targetMask = (1 << n) - 1;


            hatToPeople = new ArrayList[41];
            for (int hat = 1; hat <= 40; hat++) {
                hatToPeople[hat] = new ArrayList<>();
            }
            for (int person = 0; person < n; person++) {
                for (int hat : hats.get(person)) {
                    hatToPeople[hat].add(person);
                }
            }


            dp = new int[41][targetMask + 1];
            for (int[] row : dp) {
                Arrays.fill(row, -1);
            }


            return solve(1, 0);
        }

        private static int solve(int hat, int mask) {

            if (mask == targetMask) {
                return 1;
            }

            if (hat > 40) {
                return 0;
            }


            if (dp[hat][mask] != -1) {
                return dp[hat][mask];
            }


            long ways = solve(hat + 1, mask);


            for (int person : hatToPeople[hat]) {
                if ((mask & (1 << person)) == 0) {
                    ways = (ways + solve(hat + 1, mask | (1 << person))) % MOD;
                }
            }

            return dp[hat][mask] = (int) ways;
        }

        public static void main(String[] args) {
            List<List<Integer>> hats = new ArrayList<>();
            hats.add(Arrays.asList(3, 4));
            hats.add(Arrays.asList(4, 5));
            hats.add(Arrays.asList(5));

            System.out.println(numberWays(hats));
        }
    }

