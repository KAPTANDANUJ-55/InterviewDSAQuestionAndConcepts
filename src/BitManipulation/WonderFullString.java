package BitManipulation;

public class WonderFullString {

        public static long wonderfulSubstrings(String word) {
            long[] count = new long[1024];
            count[0] = 1;
            int cumXor = 0;
            long result = 0;

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                cumXor ^= (1 << (ch - 'a'));
                result += count[cumXor];

                for (int shift = 0; shift < 10; shift++) {
                    result += count[cumXor ^ (1 << shift)];
                }

                count[cumXor]++;
            }

            return result;
        }

    public static void main(String[] args) {
          String word = "aabb";
        System.out.println(wonderfulSubstrings(word));
    }

}
