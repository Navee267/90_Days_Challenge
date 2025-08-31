import java.util.Arrays;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]%2==0){
                arr[left++] = nums[i];
            }
            else{
                arr[right--] = nums[i];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {3,1,2,4};
        int[] res = obj.sortArrayByParity(arr);
        System.out.println(Arrays.toString(res));
    }
}