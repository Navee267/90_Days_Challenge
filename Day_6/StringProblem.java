import java.util.Arrays;

public class StringProblem {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) {
            return false;
        }

        char[] arr = s1.toCharArray();
        Arrays.sort(arr);

        for (int i = 0; i <= len2 - len1; i++) {
            String sub = s2.substring(i, len1 + i);
            char[] arr2 = sub.toCharArray();
            Arrays.sort(arr2);
            if (Arrays.equals(arr, arr2)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        StringProblem obj = new StringProblem();
        boolean result = obj.checkInclusion("ab", "ccdba");
        System.out.println(result);
    }
}
