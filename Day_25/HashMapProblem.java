import java.util.*;

public class HashMapProblem {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int oddcount = 0;
        int result = 0;

        for (int num : nums) {
            if (num % 2 != 0) {
                oddcount++;
            }

            if (map.containsKey(oddcount - k)) {
                result += map.get(oddcount - k);
            }
            map.put(oddcount, map.getOrDefault(oddcount, 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        HashMapProblem obj = new HashMapProblem();
        int[] arr = {1,1,2,1,1};
        int k = 3;
        int res = obj.numberOfSubarrays(arr, k);
        System.out.println(res);
    }
}