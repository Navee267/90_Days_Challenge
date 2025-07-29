class StringProblem {
    public String mergeAlternately(String word1, String word2) {
        String str = "";
        int i=0;
        int j=0;
        int count = 0;
        while(i<word1.length() && j<word2.length()){
            char ch = ' ';
            if(count%2==0){
                ch = word1.charAt(i++);
            }
            else{
                ch = word2.charAt(j++);
            }

            if(ch != ' '){
                str +=ch;
            }
            count = count+1;
        }

        while(i<word1.length()){
            str+=word1.charAt(i++);
        }
        while(j<word2.length()){
            str+=word2.charAt(j++);
        }
        return str;
    }

    public static void main(String[] args) {
        StringProblem obj = new StringProblem();
        String res = obj.mergeAlternately("abc","pqr" );
        System.out.println(res);
    }
}