public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 4;

        int low = 0;
        int high = arr.length-1;
        int result = -1;
        while(low <=high){
            int mid = (low + high)/2;

            if(arr[mid] == target){
                result = mid;
                break;
            }
            else if(arr[mid] < target){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        System.out.println(result);
        System.out.println(result == -1 ? "not found" : "target index " + result );
    }
}