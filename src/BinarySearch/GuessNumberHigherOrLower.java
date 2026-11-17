package BinarySearch;

class GuessGame {
    private int pickedNumber;

    public void setPickedNumber(int pickedNumber) {
        this.pickedNumber = pickedNumber;
    }

    public int guess(int num) {
        if (num > pickedNumber) {
            return -1;
        } else if (num < pickedNumber) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int res = guess(mid);

            if (res == -1) {
                high = mid - 1;
            } else if (res == 1) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

public class GuessNumberHigherOrLower {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 10;
        int secretPick = 6;

        sol.setPickedNumber(secretPick);

        int ans = sol.guessNumber(n);
        System.out.println("Picked Number is: " + ans);
    }
}
