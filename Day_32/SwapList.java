
//  Definition for singly-linked list.
  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class SwapList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count = count + 1;
            temp = temp.next;
        }
        int[] arr = new int[count];
        int i = 0;
        temp = head;
        while (temp != null) {
            arr[i++] = temp.val;
            temp = temp.next;
        }
        int x = arr[k - 1];
        arr[k - 1] = arr[arr.length - k];
        arr[arr.length - k] = x;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int num : arr) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }
}