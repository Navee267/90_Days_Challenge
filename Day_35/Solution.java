import java.math.BigInteger;

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

public class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode temp = head;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        String str = "";
        while (temp != null) {
            str += temp.val;
            temp = temp.next;
        }
        BigInteger num = new BigInteger(str);
        num = num.multiply(BigInteger.valueOf(2));

        char[] arr = num.toString().toCharArray();
        System.out.println(arr);
        for (char x : arr) {
            curr.next = new ListNode(x - '0');
            curr = curr.next;
        }
        return dummy.next;
    }
}