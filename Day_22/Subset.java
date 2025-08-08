import java.util.*;

class Subset {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            int size = list.size();
            for(int j=0;j<size;j++){
                List<Integer> li = new ArrayList<>(list.get(j));
                li.add(nums[i]);
                list.add(li);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Subset obj = new Subset();
        int[] nums = {1,2,3};
        List<List<Integer>> result = obj.subsets(nums);
        System.out.println(result);
    }
}