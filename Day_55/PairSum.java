import java.util.ArrayList;
import java.util.List;

public class PairSum {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                int pair = nums.get(i) + nums.get(j);
                if(pair < target){
                    count = count+1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        PairSum obj = new PairSum();
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        int res = obj.countPairs(list, 2);
        System.out.println(res);

    }
}