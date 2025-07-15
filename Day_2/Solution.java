class Solution {
    public boolean isValid(String word) {
        int len = word.length();
        if(len <3){
            return false;
        }
        boolean hasVowel = false;
        boolean hasConsonant = false;

        for(int i=0;i<len;i++){
            char ch = word.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }

            if(Character.isLetter(ch)){
                char lower = Character.toLowerCase(ch);
                if("aeiou".indexOf(lower) !=-1){
                    hasVowel = true;
                }
                else{
                    hasConsonant = true;
                }
            }
        }
        return hasVowel && hasConsonant;
    }

    public static void main(String[] args){
        Solution obj = new Solution();
        boolean ans = obj.isValid("123Nav");
        System.out.println(ans);
    }

}