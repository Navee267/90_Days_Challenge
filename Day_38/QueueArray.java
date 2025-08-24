public class QueueArray{
    final static int MAX_SIZE = 30;
    int[] arr ;
    int front,rear;

    QueueArray(){
        front = -1;
        rear = -1;
        arr = new int[MAX_SIZE];
    }
    public void enqueue(int val){
        if(arr.length == MAX_SIZE-1){
            throw new IndexOutOfBoundsException("Queue is full");
        }
        if(front == -1){
            front = front+1;
        }
        arr[++rear] = val;
    }
    public int dequeue(){
        if(front>rear || front==-1){
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return arr[front++];
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
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