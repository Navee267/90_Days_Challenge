import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int minPairSum(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        while(left < right){
            int pair = nums[left] + nums[right];
            list.add(pair);
            left ++;
            right--;
        }
        System.out.println(list);
        int max = Integer.MIN_VALUE;
        for(int num:list){
            max = Math.max(num,max);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {3,5,2,3};
        int res = obj.minPairSum(arr);
        System.out.println(res);
    }
}