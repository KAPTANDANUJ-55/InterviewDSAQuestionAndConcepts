package Stacks;

import java.util.Stack;

public class RPN {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String token: tokens){
            if(token.equals("+")|| token.equals("-")|| token.equals("*")|| token.equals("/")){
                int num2=st.pop();
                int num1=st.pop();

                if (token.equals("+")) st.push(num1 + num2);
                else if (token.equals("-")) st.push(num1 - num2);
                else if (token.equals("*")) st.push(num1 * num2);
                else if (token.equals("/")) st.push(num1 / num2);

            }
            else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String[]  tokens = {"2","1","+","3","*"};

        int res = evalRPN(tokens);

        System.out.println(res);
    }
}
