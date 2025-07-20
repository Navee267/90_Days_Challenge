public class ArrayProblem {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count = count + 1;

                if (count > 1)
                    return false;

                if (i > 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                } else {
                    nums[i] = nums[i + 1];
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayProblem obj = new ArrayProblem();
        int[] nums = {4,2,3};
        boolean res = obj.checkPossibility(nums);
        System.out.println(res);
    }
}
