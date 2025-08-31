public class Problem2 {
    public boolean isPerfectSquare(int num) {
        if (num < 2)
            return true;
        int left = 2;
        int right = num / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == num) {
                return true;
            } else if (square > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Problem2 obj = new Problem2();
        boolean res = obj.isPerfectSquare(16);
        System.out.println(res);
    }
}
