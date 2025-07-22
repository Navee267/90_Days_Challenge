import java.util.Arrays;

public class InsertionSort{
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,10,7,9,8,1,6};

        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int j=i-1;

            while (j>=0 && arr[j]>curr) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }

        System.out.println(Arrays.toString(arr));
    }
}