public class StringProblem {
    public boolean isPrefixString(String s, String[] words) {
        String str = "";
        for(int i=0;i<words.length;i++){
            str += words[i];
            if(str.equals(s)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        StringProblem obj = new StringProblem();
        String[] arr = {"i","love","leetcode","apples"};
        boolean res = obj.isPrefixString("iloveleetcode", arr);
        System.out.println(res);
    }
}