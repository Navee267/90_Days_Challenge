public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        int count = 0;
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ' && count <= k - 1) {
                str += ' ';
                count++;
            } else {
                if (count <= k - 1) {
                    str += ch;
                }
            }
        }
        return str.trim();
    }

    public static void main(String[] args) {
        TruncateSentence obj = new TruncateSentence();
        String str = "How Are You Naveen";
        int k = 3;
        String result = obj.truncateSentence(str, k);
        System.out.println(result);
    }
}