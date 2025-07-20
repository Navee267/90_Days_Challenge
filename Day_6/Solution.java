import java.util.HashMap;

class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet()){
            if(map.containsKey(key + 1)){
                result = Math.max(result,map.get(key) + map.get(key + 1));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {1,2,3,3,3,4,6,2,2};
        int result = obj.findLHS(arr);
        System.out.println(result);
    }
}