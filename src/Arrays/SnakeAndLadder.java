package Arrays;
import java.util.*;
public class SnakeAndLadder {


    public static int snakesAndLadders(int[][] board) {
        int n = board.length;
        int target = n * n;


        Queue<int[]> queue = new LinkedList<>();


        boolean[] visited = new boolean[target + 1];


        queue.add(new int[]{1, 0});
        visited[1] = true;

        while (!queue.isEmpty()) {
            int[] currState = queue.poll();
            int curr = currState[0];
            int moves = currState[1];


            if (curr == target) {
                return moves;
            }


            for (int i = 1; i <= 6; i++) {
                int nextSquare = curr + i;


                if (nextSquare <= target) {

                    int[] coords = getCoords(nextSquare, n);
                    int r = coords[0];
                    int c = coords[1];


                    int destination = board[r][c] != -1 ? board[r][c] : nextSquare;


                    if (!visited[destination]) {
                        visited[destination] = true;
                        queue.add(new int[]{destination, moves + 1});
                    }
                }
            }
        }


        return -1;
    }


    private static int[] getCoords(int square, int n) {
        int rem = (square - 1) / n;
        int mod = (square - 1) % n;


        int row = n - 1 - rem;


        int col = (rem % 2 == 0) ? mod : (n - 1 - mod);

        return new int[]{row, col};
    }
    public static void main(String[] args) {
        int[][] board = {
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 35, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1}
        };


        int res = snakesAndLadders(board);


        System.out.println(res);

    }
}

