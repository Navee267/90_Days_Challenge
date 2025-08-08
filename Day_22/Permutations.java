import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(nums,visited,new ArrayList<>(),res);
        return res;
    }

    public void backtrack(int[] nums,boolean[] visited,List<Integer> temp,List<List<Integer>> res){
        if(nums.length == temp.size()){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            temp.add(nums[i]);
            visited[i] = true;
            backtrack(nums,visited,temp,res);
            temp.remove(temp.size()-1);
            visited[i] = false;
        }
    }

    public static void main(String[] args){
        Solution obj = new Solution();
        int[] arr = {1,2,3};
        List<List<Integer>> result = obj.permute(arr);
        System.out.println(result);
    }
}