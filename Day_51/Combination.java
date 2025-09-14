import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        combinations(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    public void combinations(List<List<Integer>> li, List<Integer> temp, int[] arr, int target, int start) {
        if (target == 0) {
            li.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            if (i > start && arr[i] == arr[i - 1])
                continue;
            if (arr[i] > target)
                break;
            temp.add(arr[i]);
            combinations(li, temp, arr, target - arr[i], i + 1);
            // System.out.println(temp);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        Combination obj = new Combination();
        int[] arr = {10,1,2,7,6,1,5};
        List<List<Integer>> res = obj.combinationSum2(arr, 8);
        System.out.println(res);

    }
}
