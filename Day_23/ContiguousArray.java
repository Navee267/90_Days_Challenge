import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class ContiguousArray {
    public int minOperations(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            max = Math.max(nums[i],max);
            min = Math.min(nums[i],min);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        int n = nums.length;
        int left = 0;
        int best = 0;

        for(int right = 0;right < list.size();right++){
            while(list.get(right) - list.get(left) >= n){
                left ++;
            }
            best = Math.max(best,right-left+1);
        }

        System.out.println(max + " " + min);
        return n - best;
    }

    public static void main(String[] args) {
        ContiguousArray obj = new ContiguousArray();
        int[] arr = {4,2,5,3};
        int res = obj.minOperations(arr);
        System.out.println(res);
    }
}