package Stacks;
import java.util.Stack;
public class ValidateStackSequences {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int idx=0;

        for(int i =0;i<pushed.length;i++){
            st.push(pushed[i]);
            while (!st.isEmpty() && st.peek() == popped[idx]) {
                st.pop();
                idx++;
            }
        }

        if(idx==popped.length) return true;

        return false;
    }

    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5}, popped = {4,5,3,2,1};
        System.out.println(validateStackSequences(pushed, popped));
        int[] pushed1 = {1,2,3,4,5}, popped1 = {4,5,3,1,2};
        System.out.println(validateStackSequences(pushed1, popped1));

    }
}
