public class QueueLinkedList {
    Node front;
    Node rear;

    class Node{
        int data;
        Node next;

        Node(int val){
            data = val;
            next = null;
        }
    }
    QueueLinkedList(){
        front = null;
        rear = null;
    }

    public void enqueue(int val){
        Node newNode = new Node(val);
        if(front == null){
            front = newNode;
        }
        else{
            rear.next = newNode;
        }
        rear = newNode;
    }

    public int dequeue(){
        int temp = front.data;
        if(front == null){
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        front = front.next;
        return temp;
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
