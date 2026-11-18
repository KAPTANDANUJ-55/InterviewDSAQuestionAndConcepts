package BinarySearch;

public class MinimumTimeToRepairCar {
    public static long repairCars(int[] ranks, int cars) {
        long minRank = ranks[0];
        for (int r : ranks) {
            if (r < minRank) {
                minRank = r;
            }
        }

        long low = 1;
        long high = minRank * cars * cars;
        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (canRepairAll(ranks, cars, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private static boolean canRepairAll(int[] ranks, int cars, long time) {
        long totalCarsRepaired = 0;

        for (int r : ranks) {
            totalCarsRepaired += (long) Math.sqrt(time / r);

            if (totalCarsRepaired >= cars) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[]  ranks = {4,2,3,1};

        int cars = 10;

        System.out.println(repairCars(ranks, cars));
    }
}
