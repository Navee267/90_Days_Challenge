import java.util.Arrays;

public class ValidTriangle {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int low = j + 1;
                int high = n - 1;
                int k = j;
                while (low <= high) {
                    int mid = (low+high)/2;
                    if (nums[i] + nums[j] > nums[mid]) {
                        k = mid;
                        low = mid + 1;
                    }else {
                        high = mid - 1;
                    }
                }
                count += (k-j);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ValidTriangle obj = new ValidTriangle();
        int[] arr = {2,2,3,4};
        int res = obj.triangleNumber(arr);
        System.out.println(res);
    }
}