class DistanceValue {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int x = 0;
        for(int i=0;i<arr1.length;i++){
            int count = 0;
            for(int j=0;j<arr2.length;j++){
                int val = Math.abs(arr1[i]-arr2[j]);
                if(val >d){
                    count = count +1;
                }
            }
            if(count == arr2.length){
                x++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        DistanceValue obj = new DistanceValue();
        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        int res = obj.findTheDistanceValue(arr1, arr2, 2);
        System.out.println(res);
    }
}