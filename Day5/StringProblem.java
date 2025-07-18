import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringProblem {
    public String frequencySort(String s) {
        char[] arr = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();

        for(char val : arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        List<Map.Entry<Character, Integer>> freqList = new ArrayList<>(map.entrySet());
        System.out.println(freqList);
        Collections.sort(freqList,(a,b)->b.getValue() - a.getValue());
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : freqList) {
            char c = entry.getKey();
            int freq = entry.getValue();
            sb.append(String.valueOf(c).repeat(freq));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        StringProblem obj = new StringProblem();
        String result = obj.frequencySort("Naveen");
        System.out.println(result);
    }
}
