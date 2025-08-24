public class LinkedStack {
    Node top;
    class Node{
        int data;
        Node next;

        Node(int val){
            data = val;
            next = null;
        }
    }
    LinkedStack(){
        top = null;
    }

    public void push(int val){
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        if(top == null){
            throw new IndexOutOfBoundsException("Stack UnderFlow");
        }
        int temp = top.data;
        top = top.next;
        return temp;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        return top.data;
    }

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Popped Value is " + stack.pop());
        System.out.println("Popped Value is " + stack.pop());
        System.out.println("Top Value Is " + stack.peek());
    }
}
