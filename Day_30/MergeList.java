
//  Definition for singly-linked list.

import java.util.*;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
public class MergeList {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode head = lists[i];
            while(head !=null){
                list.add(head.val);
                head = head.next;
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        Collections.sort(list);
        for(int num:list){
            curr.next = new ListNode(num);
            curr = curr.next;
        }

        System.out.print(list);
        return dummy.next;
    }
}