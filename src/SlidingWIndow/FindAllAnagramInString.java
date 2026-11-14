package SlidingWIndow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramInString {
    static HashMap<Character,Integer> hm = new HashMap<>();
    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> al = new ArrayList<>();

        for(int i=0;i<p.length();i++){
            char c = p.charAt(i);

            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        int n = s.length();
        int k = p.length();
        int l = 0;
        int r =0;
        while(r<n){

            char Income = s.charAt(r);
            hm.put(Income,hm.getOrDefault(Income,0)-1);



            if((r-l+1)==k){
                if(isAllZero()){

                    al.add(l);

                }
                char outcome = s.charAt(l);
                hm.put(outcome, hm.getOrDefault(outcome, 0) + 1);

                l++;}


            r++;


        }
        return al;
    }

    private static boolean isAllZero(){
        for(int val : hm.values()){
            if(val!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s,p));
    }
}
