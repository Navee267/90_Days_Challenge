import java.util.*;

class MedianArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums1){
            list.add(num);
        }
        for(int num : nums2){
            list.add(num);
        }
        int n = list.size();
        Collections.sort(list);
        System.out.println(list);
        if(n==0) return 0.0;
        if(n %2 ==0){
            int mid1 = list.get(n/2 -1);
            int mid2 = list.get(n/2);
            return (mid1 + mid2 )/2.0;
        }
        else{
            return list.get(n/2);
        }
    }
    public static void main(String[] args) {
        MedianArray obj = new MedianArray();
        int[] arr = {1,4};
        int[] arr2 = {2,3};
        double res = obj.findMedianSortedArrays(arr, arr2);
        System.out.println(res);
    }
}