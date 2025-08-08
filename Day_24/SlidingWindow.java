public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,2,1,4,3,6};
        int k =3;
        int maxSum = findmaxsubarrSum(arr,k);
        System.out.println(maxSum);
    }

    public static int findmaxsubarrSum(int[] nums,int k){
        int maxSum = 0;
        int windowSum = 0;

        for(int i=0;i<k;i++){
            windowSum +=nums[i];
        }
        maxSum = windowSum;

        for(int i=k;i<nums.length;i++){
            windowSum +=nums[i] - nums[i-k];
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
}