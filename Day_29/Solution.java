
//  * Definition for singly-linked list.

import java.util.*;

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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode temp = head;
        while (temp != null) {
            map.put(temp.val, map.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }

        System.out.println(map);
        List<Integer> list = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                list.add(key);
            }
        }
        Collections.sort(list);
        ListNode newNode = new ListNode(0);
        ListNode curr = newNode;
        for (int num : list) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return newNode.next;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {1,2,3,3,4,4,5};
        ListNode List = buildList(arr);
        List = obj.deleteDuplicates(List);
        printList(List);
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

    public static void printList(ListNode head){
        while (head !=null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println("null");
    }
}