import java.util.Arrays;

class Sliding2 {
    public int[] decrypt(int[] code, int k) {
        int[] arr = new int[code.length];
        int n = code.length;

        if (k > 0) {
            for (int i = 0; i < n; i++) {
                int windowSum = 0;
                for (int j = 1; j <= k; j++) {
                    windowSum += code[(i + j) % n];
                }
                arr[i] = windowSum;
            }
        } else if (k < 0) {
            int kk = -k;
            for(int i = 0; i < n; i++) {
                int windowSum = 0;
                for (int j = 1; j <= kk; j++) {
                    windowSum += code[(i - j+n) % n];
                }
                arr[i] = windowSum;
            }
        }
        else{
            return arr;
        }
        return arr;
    }

    public static void main(String[] args) {
        Sliding2 obj = new Sliding2();
        int[] arr = {5,7,1,4};
        int[] res = obj.decrypt(arr, 3);
        System.out.println(Arrays.toString(res));
    }
}