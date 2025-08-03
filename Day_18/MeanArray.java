import java.util.Arrays;

public class MeanArray {
    public double trimMean(int[] arr) {
        
        int count = 0;
        Arrays.sort(arr);
        int removable = arr.length / 20;
        for(int i=removable ; i< arr.length-removable ; i++){
            count +=arr[i];
        }

        return (double) count/(arr.length - 2*removable);
    }

    public static void main(String[] args) {
        MeanArray obj = new MeanArray();
        int[] arr = {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3};
        double result = obj.trimMean(arr);
        System.out.println(result);
    }
}
