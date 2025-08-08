import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sliding {
    public List<Integer> findAnagrams(String s, String p) {
        int left = 0;
        int right = p.length();
        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);
        String sortedP = new String(pArr);
        List<Integer> arr = new ArrayList<>();
        while (right <= s.length()) {
            String val = s.substring(left, right);
            char[] valArr = val.toCharArray();
            Arrays.sort(valArr);
            String sortedVal = new String(valArr);

            if (sortedVal.equals(sortedP)) {
                arr.add(left);
            }
            left++;
            right++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Sliding obj = new Sliding();
        String str1 = "cbaebabacd";
        String str2 = "abc";
        List<Integer> res = obj.findAnagrams(str1, str2);
        System.out.println(res);
    }
}