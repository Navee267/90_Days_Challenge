import java.util.ArrayList;
import java.util.List;

public class ArrayProblem {
    public String replaceWords(String[] dictionary, String sentence) {
        String[] arr = sentence.split(" ");

        for(int i=0;i< arr.length;i++){
            for(String x : dictionary){
                if(arr[i].startsWith(x)){
                    arr[i] = x;
                }
            }
        }

        return String.join(" ",arr);
    }
    public static void main(String[] args) {
        ArrayProblem obj = new ArrayProblem();
        String[] dictionary = {"cat","rat","bat"};
        String sentence = "the cattle was rattled by the battery";
        String str = obj.replaceWords(dictionary, sentence);
        System.out.println(str);
    }
}
