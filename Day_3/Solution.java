import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num:nums2){
            if(map.containsKey(num) && map.get(num)>0){
                list.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }

        return res;
    }
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,4,3};
        int[] res = obj.intersect(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }

}