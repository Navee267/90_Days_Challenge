class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int res = 0;
        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 2) {
            return nums[0] > nums[1] ? 0 : 1;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }

        if(nums[nums.length-1] > nums.length-2){
            return nums.length-1;
        }

        return res;
    }

    public static void main(String[] args) {
        FindPeakElement obj = new FindPeakElement();
        int[] arr = {1,2,3,4};
        int result = obj.findPeakElement(arr);
        System.out.println(result);
    }
}