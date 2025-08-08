class Sliding2 {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        for(int i=0;i<k;i++){
            windowSum += nums[i];
        }

        double maxSum = (double) windowSum /k;

        for(int i=k;i<nums.length;i++){
            windowSum += nums[i] - nums[i-k];
            maxSum = Math.max(maxSum,(double) windowSum/k);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Sliding2 obj = new Sliding2();
        int[] arr = {1,12,-5,-6,50,3};
        double res = obj.findMaxAverage(arr, 4);
        System.out.println(res);
    }
}