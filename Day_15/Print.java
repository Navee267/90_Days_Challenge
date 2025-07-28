public class Print {
    public int print(int n){
        if(n==0) return 0;
        System.out.print(n);
        return print(n-1);
    }

    public static void main(String[] args) {
        Print obj = new Print();
        int res = obj.print(5);
        System.out.println(res);
    }
}
