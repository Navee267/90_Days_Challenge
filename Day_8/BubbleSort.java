import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {2,3,4,1,0,9,8,6,7,5,20,11,23,12,21};
        boolean swapped ;
        for(int i=0;i<arr.length-1;i++){
            swapped = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
