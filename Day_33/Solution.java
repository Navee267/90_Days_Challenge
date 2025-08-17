
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        String str1 = "";
        String str2 = "";
        while (temp1 != null) {
            str1 = temp1.val + str1;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            str2 = temp2.val + str2;
            temp2 = temp2.next;
        }
        System.out.println(str1 + " " + str2);
        java.math.BigInteger n1 = new java.math.BigInteger(str1);
        java.math.BigInteger n2 = new java.math.BigInteger(str2);
        java.math.BigInteger sum = n1.add(n2);

        char[] arr = sum.toString().toCharArray();
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int i = arr.length - 1; i >= 0; i--) {
            curr.next = new ListNode(arr[i] - '0');
            curr = curr.next;
        }
        System.out.println(sum);
        return dummy.next;
    }
}