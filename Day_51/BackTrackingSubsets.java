import java.util.*;

public class BackTrackingSubsets {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        set(list,new ArrayList<>(),nums,0);
        return list;
    }

    public void set(List<List<Integer>> li,List<Integer> temp,int[] nums,int start){
        li.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
        if(start < i && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            set(li,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        BackTrackingSubsets obj = new BackTrackingSubsets();
        int[] nums = {1,2,3};
        List<List<Integer>> res = obj.subsetsWithDup(nums);
        System.out.println(res);
    }
}