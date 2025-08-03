public class MinimumInRotated {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {
        MinimumInRotated obj = new MinimumInRotated();
        int[] arr = {3,4,5,1,2};
        int result = obj.findMin(arr);
        System.out.println(result);
    }
}