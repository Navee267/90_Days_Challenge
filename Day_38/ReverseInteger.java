public class ReverseInteger {
    public int reverse(int x) {
        String res = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (int i = res.length() - 1; i >= 0; i--) {
            char ch = res.charAt(i);
            if (Character.isDigit(ch)) {
                sb.append(ch);
            } else {
                if (ch == '-') {
                    sb.insert(0, ch);
                }
            }
        }
        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        ReverseInteger obj = new ReverseInteger();
        int res = obj.reverse(-123);
        System.out.println(res);
    }
}
