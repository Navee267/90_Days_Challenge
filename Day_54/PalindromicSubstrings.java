public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        int count = 0;
        for (int left = 0; left < s.length(); left++) {
            for (int right = left + 1; right <= s.length(); right++) {
                String str = s.substring(left, right);
                StringBuilder builder = new StringBuilder(str);
                builder.reverse();
                String rev = builder.toString();
                if (str.equals(rev)) {
                    count = count + 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        PalindromicSubstrings obj = new PalindromicSubstrings();
        int res = obj.countSubstrings("ABC");
        System.out.println(res);
    }
}
