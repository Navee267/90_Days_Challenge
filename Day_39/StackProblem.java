import java.util.Stack;

public class StackProblem {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        int[] lastIndex = new int[26];
        boolean[] visited = new boolean[26];
        for(int i=0;i<s.length();i++){
            lastIndex[s.charAt(i)-'a'] = i;
        }

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int idx = c - 'a';

            if(visited[idx]) continue;

            while(!stack.isEmpty() && stack.peek() > c && lastIndex[stack.peek()-'a'] > i){
                visited[stack.pop()-'a'] = false;
            }
            stack.push(c);
            visited[idx] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stack){
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StackProblem stack = new StackProblem();
        String res  = stack.removeDuplicateLetters("bcabc");
        System.out.println(res);

    }
}