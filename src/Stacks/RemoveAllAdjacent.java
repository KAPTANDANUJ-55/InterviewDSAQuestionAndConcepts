package Stacks;
import java.util.*;
public class RemoveAllAdjacent {
    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        st.push(s.charAt(0));
        StringBuilder s1 = new StringBuilder();


        for(int i=1;i<n;i++){
            if(!st.isEmpty() &&st.peek()==s.charAt(i)){

                st.pop();

            }

            else

                st.push(s.charAt(i));


        }


        for (char c : st) {
            s1.append(c);
        }

        return s1.toString();
    }

    public static void main(String[] args) {
        String s = "abbacababb";
        String s1 = "abbaca";

        String res = removeDuplicates(s);
        String res2 =  removeDuplicates(s1);
        System.out.println(res);
        System.out.println(res2);
    }

}
