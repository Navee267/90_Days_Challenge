public class BinarySearchProblem {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int mid = left + (right - left)/2;

            if(arr[mid] < arr[mid+1]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        BinarySearchProblem obj = new BinarySearchProblem();
        int[] arr ={0,1,0};
        int res = obj.peakIndexInMountainArray(arr);
        System.out.println(res);
    }
}