import java.util.*;

public class CombinationSum {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> list = new ArrayList<>();
        combination(list,new ArrayList<>(),nums,0,n);
        List<List<Integer>> res = new ArrayList<>();
        for(List li : list){
            if(li.size() == k){
                res.add(li);
            }
        }
        return res;
    }

    public void combination(List<List<Integer>> li,List<Integer> temp,int[] nums,int start,int target){
        if(target == 0){
            li.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(nums[i] > target) break;
            temp.add(nums[i]);
            combination(li,temp,nums,i+1,target-nums[i]);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        CombinationSum obj = new CombinationSum();
        List<List<Integer>> res = obj.combinationSum3(3, 7);
        System.out.println(res);
    }
}