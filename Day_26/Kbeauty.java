class Kbeauty {
    public int divisorSubstrings(int num, int k) {
        String val = String.valueOf(num);
        System.out.println(val);
        int count = 0;
        for (int i = 0; i <= val.length() -k ; i++) {
            String str = val.substring(i,i+k);
            int x = Integer.parseInt(str);
            if (x!=0 && num % x == 0) {
                count = count + 1;
            }
            System.out.println(str);
        }
        return count;
    }

    public static void main(String[] args) {
        Kbeauty obj = new Kbeauty();
        int res = obj.divisorSubstrings(240, 2);
        System.out.println(res);
    }
}