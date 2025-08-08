class SubarraySliding {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowSum = 0;
        int count = 0;
        for(int i=0;i<k;i++){
            windowSum +=arr[i];
        }
        int avg = windowSum /k;
        if(avg >= threshold){
            count = count +1;
        }
        for(int i=k;i<arr.length;i++){
            windowSum += arr[i] - arr[i-k];
            avg = windowSum /k;
            if(avg >=threshold){
                count = count +1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SubarraySliding obj = new SubarraySliding();
        int[] arr = {2,2,2,2,5,5,5,8};
        int res = obj.numOfSubarrays(arr, 3, 4);
        System.out.println(res);
    }
}