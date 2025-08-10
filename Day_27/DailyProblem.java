import java.util.Arrays;

public class DailyProblem {
    public boolean reorderedPowerOf2(int n) {
        String str = String.valueOf(n);
        char[] digits = str.toCharArray();
        Arrays.sort(digits);
        for (int i = 0; i < 31; i++) {
            char[] power = Integer.toString(1 << i).toCharArray();
            Arrays.sort(power);
            if (Arrays.equals(power, digits)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DailyProblem obj = new DailyProblem();
        boolean res = obj.reorderedPowerOf2(128);
        System.out.println(res);
    }
}