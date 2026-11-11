package Stacks;
import java.util.*;
public class RemoveStars {

    // Concept is 96% similar to Remove All Adjacent The Rest 4% Is Difference
    // Here We Have To Remove Star

    public String removeStars(String s) {
        int n = s.length();

        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            char c = s.charAt(i);

            if(c=='*' && !st.isEmpty()){
                st.pop();
            }
            else{
                st.push(c);
            }
        }

        for(char w : st){
            sb.append(w);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        String s1 = "erase*****";
        System.out.println(new RemoveStars().removeStars(s));
        System.out.println(new RemoveStars().removeStars(s1));
    }
}
