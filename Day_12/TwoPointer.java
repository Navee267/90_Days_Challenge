class TwoPointer {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        String str = "";
        for (char val : arr) {
            str += val;
        }
        return str;
    }

    public static void main(String[] args) {
        TwoPointer obj = new TwoPointer();
        String res = obj.reverseStr("Naveen", 2);
        System.out.println(res);
    }
}