package SlidingWIndow;

public class MaxVowelsInSubstring {
    public static int maxVowels(String s, int k) {
        int n = s.length();
        int currentVowel =0;

        for(int i =0;i<k;i++){
            if (isVowel(s.charAt(i))) {
                currentVowel++;
            }
        }

        int maxV = currentVowel;


        for(int i =k; i<n;i++){
            if(isVowel(s.charAt(i))) currentVowel++;

            if(isVowel(s.charAt(i-k))) currentVowel--;

            maxV = Math.max(currentVowel,maxV);
            if (maxV == k) return k;
        }

        return maxV;
    }
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
       String s =
                "abciiidef";

       System.out.println(maxVowels(s,3));
    }
}
