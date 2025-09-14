public class SlidingWindow {
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxSum = 0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count = count+1;
            }
        }
        maxSum = Math.max(count,maxSum);
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                count = count+1;
            }

            if(isVowel(s.charAt(i-k))){
                count = count-1;
            }
        maxSum = Math.max(count,maxSum);
        }
        return maxSum;
    }

    public boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }

    public static void main(String[] args){
        SlidingWindow obj = new SlidingWindow();
        int res = obj.maxVowels("abciiidef", 3);
        System.out.println(res);
    }
}