
//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class List1 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;

            prev.next = second;
            first.next = second.next;
            second.next = first;

            prev = first;
            head = first.next;

        }

        return dummy.next;
    }

    public static void main(String[] args) {
        List1 obj = new List1();
        int[] arr = {1,2,3,4};
        ListNode node = buildList(arr);
        node = obj.swapPairs(node);
        printnode(node);
    }

    public static ListNode buildList(int[] arr){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for(int num:arr){
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void printnode(ListNode head){
        while (head!=null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
