import java.util.Arrays;

public class Stack {
    final static int MAX_SIZE = 30;
    int[] arr = new int[MAX_SIZE];
    int top;

    Stack() {
        top = -1;
    }

    void push(int val) {
        if (top == MAX_SIZE - 1) {
            throw new IndexOutOfBoundsException("Stack OverFlow");
        }
        arr[++top] = val;
    }

    int pop() {
        if (top == -1) {
            throw new IndexOutOfBoundsException("Stack UnderFlow");
        }
        return arr[top--];
    }

    int peek() {
        if (top == -1) {
            throw new IndexOutOfBoundsException("Stack UnderFlow");
        }
        return arr[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.pop();
        System.out.println("Top Value Is " + stack.peek());
        System.out.println(Arrays.toString(stack.arr));
        System.out.println(Arrays.toString(Arrays.copyOfRange(stack.arr, 0, stack.top + 1)));
    }
}