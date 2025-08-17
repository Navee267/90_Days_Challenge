public class DoublyLinkedList {
    Node head;
    Node tail;

    class Node{
        int data;
        Node prev;
        Node next;

        Node(int val){
            data = val;
            prev = null;
            next = null;
        }
    }
    DoublyLinkedList(){
        head = null;
        tail = null;
    }

    public void insertAtBeginning(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        if(head==null){
            tail = newNode;
        }
        else{
            head.prev = newNode;
        }
        head = newNode;
    }

    public void display(){
        Node temp = head;

        while(temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void displayRev(){
        Node temp = tail;

        while(temp !=null){
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    public void insertAtPos(int val,int pos){
        if(pos==0){
            insertAtBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for(int i=1;i<pos;i++){
            temp = temp.next;
            if(temp == null){
                throw new IndexOutOfBoundsException("Invalid Position");
            }
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(40);
        list.insertAtBeginning(50);
        list.display();
        System.out.println(" ");
        list.displayRev();
        System.out.println(" ");
        list.insertAtPos(25, 3);
        list.display();
        System.out.println(" ");
    }
}
