import java.util.Arrays;

class Kweakrows {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] arr = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count = count + 1;
                }
            }
            arr[i] = count;
        }

        boolean[] used = new boolean[arr.length];
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            int small = Integer.MAX_VALUE;
            int idx = -1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < small && !used[j]) {
                    small = arr[j];
                    idx = j;
                }
            }
            used[idx] = true;
            res[i] = idx;
        }
        System.out.println(Arrays.toString(arr));
        return res;
    }

    public static void main(String[] args) {
        Kweakrows obj = new Kweakrows();
        int[][] arr = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int[] res = obj.kWeakestRows(arr, 3);
        System.out.println(Arrays.toString(res));
    }
}