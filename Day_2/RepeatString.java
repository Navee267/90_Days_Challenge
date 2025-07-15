import java.util.LinkedHashMap;

class RepeatString {
    static char nonRepeatingChar(String s) {
        // code here
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        char res = '$';
        // System.out.println(map);
        for(char key : map.keySet()){
            if(map.get(key)==1){
                res = key;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args){
        RepeatString obj = new RepeatString();
        char ch = obj.nonRepeatingChar("Naveen");
        System.out.println(ch);
    }
}
