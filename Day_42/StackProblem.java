import java.util.Stack;

public class StackProblem {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    count = count +1;
                }
                else{
                    stack.pop();
                }
            }
        }
        
        return count + stack.size();
    }

    public static void main(String[] args) {
        StackProblem stack = new StackProblem();
        String str = "())";
        int res = stack.minAddToMakeValid(str);
        System.out.println(res);
    }
}