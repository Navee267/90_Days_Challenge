import java.util.*;

class BackTracking {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }

    public void backtrack(int[] candidates, int start, int target, List<Integer> temp, List<List<Integer>> res) {

        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                temp.add(candidates[i]);
                backtrack(candidates,i,target-candidates[i],temp,res);
                temp.remove(temp.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        BackTracking obj = new BackTracking();
        int[] arr = {2,3,4,7};
        List<List<Integer>> res = obj.combinationSum(arr, 7);
        System.out.println(res);
    }
}