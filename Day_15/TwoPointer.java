import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TwoPointer {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;

            int left = i+1;
            int right = nums.length-1;

            while(left < right ){
                int total = nums[i] + nums[left] + nums[right];
                if(total == 0){
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    while(left < right && nums[left] == nums[left +1]) 
                        left++;
                    while(left < right && nums[right] == nums[right -1]) 
                        right--;

                    left++;
                    right--;
                }
                else if(total < 0){
                    left ++;
                }
                else{
                    right--;
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        TwoPointer obj = new TwoPointer();
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = obj.threeSum(arr);
        System.out.println(list);
    }
}