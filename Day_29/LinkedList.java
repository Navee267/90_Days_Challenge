public class LinkedList{
    Node head;
    class Node {
        int data ;
        Node next;
        Node(int val){
            this.data = val;
            next = null;
        }
    }

    LinkedList(){
        head = null;
    }

    public void insertAtBeginning(int val){
        Node newNode = new Node(val);

        if(head == null)
            head = newNode;
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insertAtPos(int val,int pos){
        Node newNode = new Node(val);
        Node temp = head;
        if(pos==0){
            insertAtBeginning(val);
            return;
        }
        for(int i=1;i<pos;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(40);
        list.insertAtBeginning(50);
        list.display();
        list.insertAtPos(25, 3);
        System.out.println( " ");
        list.display();
    }
}