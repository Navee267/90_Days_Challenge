package Day_10;

public class Sorting2 {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] result = new String[arr.length];

        for (String word : arr) {
            int len = word.length();
            int pos = word.charAt(len - 1) - '0';
            result[pos - 1] = word.substring(0, len - 1);
        }

        return String.join(" ", result);
    }

    public static void main(String[] args) {
        Sorting2 obj = new Sorting2();
        String sentence = "is2 sentence4 This1 a3";
        String res = obj.sortSentence(sentence);
        System.out.println(res);
    }
}