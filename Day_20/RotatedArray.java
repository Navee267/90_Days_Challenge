class RotatedArray {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return true;
            }

            if(nums[low] == nums[mid] && nums[high] == nums[mid]){
                low ++;
                high --;
            }
            else if (nums[low] <= nums[mid]) {
                if (nums[mid] > target && nums[low] <= target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && nums[high] >= target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        RotatedArray obj = new RotatedArray();
        int[] arr = {2,5,6,0,0,1,2};
        int target = 5;
        boolean result = obj.search(arr, target);
        System.out.println(result);
    }
}