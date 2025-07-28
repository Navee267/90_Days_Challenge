import java.util.Arrays;

public class Closet3Sum {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];

                if (Math.abs(total - target) < Math.abs(res - target)) {
                    res = total;
                } else if (total < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Closet3Sum obj = new Closet3Sum();
        int[] arr = {-1,2,1,-4};
        int res = obj.threeSumClosest(arr, 1);
        System.out.println(res);
    }
}
