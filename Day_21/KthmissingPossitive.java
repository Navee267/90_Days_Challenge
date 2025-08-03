public class KthmissingPossitive {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low + k;
    }

    public static void main(String[] args) {
        KthmissingPossitive obj = new KthmissingPossitive();
        int[] arr = {2,3,4,7,11};
        int k = 5;

        int result = obj.findKthPositive(arr, k);
        System.out.println(result);
    }
}