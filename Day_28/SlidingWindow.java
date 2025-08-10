import java.util.HashMap;

class SlidingWindow {
    public int maximumUniqueSubarray(int[] nums) {
        int maxSum = 0;
        int windowSum = 0;
        int left = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            windowSum += num;
            map.put(num,map.getOrDefault(num,0)+1);

            while(map.get(num)>1){
                int leftNum = nums[left];
                map.put(leftNum,map.get(leftNum)-1);
                windowSum -=leftNum;
                left++;
            }
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        SlidingWindow obj = new SlidingWindow();
        int[] arr = {4,2,4,5,6};
        int res = obj.maximumUniqueSubarray(arr);
        System.out.println(res);
    }
}