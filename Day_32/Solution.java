public class Solution {
    public int maximum69Number (int num) {
        int max = num;
        String val = String.valueOf(num);
        System.out.println(val);
        for(int i=0;i<val.length();i++){
            char[] arr = val.toCharArray();
            if(arr[i] == '6'){
                arr[i] = '9';
            }
            else{
                arr[i] = '6';
            }
            String str = new String(arr);
            int x = Integer.parseInt(str);
            max = Math.max(max,x);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int res = obj.maximum69Number(9969);
        System.out.println(res);
    }
}