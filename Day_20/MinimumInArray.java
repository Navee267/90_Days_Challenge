public class MinimumInArray {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                high--;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        MinimumInArray obj = new MinimumInArray();
        int[] arr = {2,2,2,0,1};
        int result = obj.findMin(arr);
        System.out.println(result);
    }
}
