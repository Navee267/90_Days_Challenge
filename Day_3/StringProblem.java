class StringProblem {
    public String reverseWords(String s) {
        String res = "";
        String word = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                word = ch + word;
            } else {
                res += word + " ";
                word = "";
            }
        }

        res += word;

        return res;
    }
    public static void main(String[] args){
        StringProblem obj = new StringProblem();
        String res = obj.reverseWords("Naveen is a good boy");
        System.out.println(res);
    }
}