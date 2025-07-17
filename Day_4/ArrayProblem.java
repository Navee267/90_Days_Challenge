import java.util.Arrays;

public class ArrayProblem {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int idx = 0;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                count = count +1;
            }
            else{
                res[idx++] = count;
                count = 0;
            }
        }
        if(nums[nums.length-1] == 1){
            res[idx++] = count;
        }
        System.out.println(Arrays.toString(res));
        int max = 0;
        for (int i = 0; i < idx; i++) {
            if (res[i] > max) {
                max = res[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        ArrayProblem obj = new ArrayProblem();
        int[] input = {1,0,0,1,0,0,1,1,1,0,1,1};
        int output = obj.findMaxConsecutiveOnes(input);
        System.out.println(output);
    }
}
