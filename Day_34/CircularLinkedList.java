public class CircularLinkedList{

    Node last ;
    class Node{
        int data ;
        Node next;

        Node(int val){
            data = val;
            next = null;
        }
    }

    CircularLinkedList(){
        last = null;
    }

    public void insertAtBeginning(int val){
        Node newNode = new Node(val);
        if(last == null){
            newNode.next = newNode;
            last = newNode;
        }
        else{
            newNode.next = last.next;
            last.next = newNode;
        }
    }
    public void insertAtEnd(int val){
        Node newNode = new Node(val);
        if(last == null){
            newNode.next = newNode;
            last = newNode;
        }
        else{
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public void display(){
        Node temp = last.next;

        do{
            System.out.println(temp.data);
            temp = temp.next;
        }while(temp !=last.next);
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtEnd(40);
        list.display();

    }
}