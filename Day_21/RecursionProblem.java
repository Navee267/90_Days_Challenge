public class RecursionProblem {
    public boolean isPowerOfFour(int n) {
        if (n == 0)
            return false;
        if (n == 1)
            return true;
        boolean res = false;
        if (n > 1 && n % 4 != 0) {
            return false;
        } else {
            res = isPowerOfFour(n / 4);
        }
        return res;
    }
    public static void main(String[] args) {
        RecursionProblem obj = new RecursionProblem();
        boolean res = obj.isPowerOfFour(16);
        System.out.println(res);
    }
}
