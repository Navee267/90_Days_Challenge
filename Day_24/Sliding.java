class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum =0;
        int minlen = Integer.MAX_VALUE;

        while(right < nums.length){
            sum +=nums[right];

            while(sum >=target){
                int windowSize = right-left +1;
                minlen = Math.min(windowSize,minlen);
                sum -=nums[left];
                left++;
            }
            right++;
        }
        return (minlen == Integer.MAX_VALUE) ? 0:minlen;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {2,3,1,2,4,3};
        int res = obj.minSubArrayLen(7, arr);
        System.out.println(res);
    }
}