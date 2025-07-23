package Day_10;

import java.util.Arrays;

public class Sorting {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIdx] > nums[j]) {
                    minIdx = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Sorting obj = new Sorting();
        int[] arr = {5,2,4,3,6,9,7,8,1,10,20,11,12};
        obj.sortColors(arr);
    }
}
