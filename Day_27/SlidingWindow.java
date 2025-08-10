import java.util.HashMap;

class SlidingWindow {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for(int i=0;i<=s.length()-3;i++){
            String str = s.substring(i,i+3);
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j=0;j<3;j++){
                map.put(str.charAt(j),map.getOrDefault(str.charAt(j),0)+1);
            }
            if(map.size()==3){
                count = count +1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SlidingWindow obj =  new SlidingWindow();
        String str = "xyzzaz";
        int res = obj.countGoodSubstrings(str);
        System.out.println(res);
    }
}