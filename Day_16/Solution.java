class Solution {
    public int maxArea(int[] height) {
        int max =0;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            int sub = right-left;
            int min = Math.min(height[left] ,height[right]);
            int mul = sub*min;

            max = Math.max(max,mul);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int res = obj.maxArea(arr);
        System.out.println(res);
    }
}