import java.util.LinkedList;
import java.util.Queue;

public class ImplementQueues {
    Queue<Integer> q1;
     Queue<Integer> q2;

   public ImplementQueues() {
       q1 = new LinkedList<>();
       q2 = new LinkedList<>();
   }
   
   public void push(int x) {
       q2.add(x);
       while(!q1.isEmpty()){
           q2.add(q1.remove());
       }
       Queue<Integer> temp = q1;
       q1 = q2;
       q2 = temp;
   }
   
   public int pop() {
       return q1.remove();
   }
   
   public int top() {
       return q1.peek();
   }
   
   public boolean empty() {
       return q1.isEmpty();
   }

   public static void main(String[] args) {
    ImplementQueues obj = new ImplementQueues();
    obj.push(10);
    obj.push(20);
    obj.push(30);
    obj.push(40);
    obj.push(50);
    obj.push(60);
    System.out.println(obj.pop());
    System.out.println(obj.pop());
    System.out.println(obj.top());
    System.out.println(obj.empty());
   }
}
