import java.util.Stack;

public class Stack_Problem {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                stack.pop();
            } else if (operations[i].equals("D")) {
                int num = stack.peek();
                stack.push(num * 2);
            } else if (operations[i].equals("+")) {
                int poped = stack.pop();
                int peek = stack.peek();
                stack.push(poped);
                stack.push(poped + peek);
            } else {
                int num = Integer.parseInt(operations[i]);
                stack.push(num);
            }
        }
        int sum = 0;
        for (int num : stack) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Stack_Problem stack = new Stack_Problem();
        String[] arr = { "5", "2", "C", "D", "+" };
        int val = stack.calPoints(arr);
        System.out.println(val);
    }
}