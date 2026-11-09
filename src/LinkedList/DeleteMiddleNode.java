package LinkedList;

import LL.ListNode;

public class DeleteMiddleNode {
    public static ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;

        }
        prev.next = slow.next;
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 7, 1, 2, 6};

        ListNode head = new ListNode(nums[0]);


        ListNode curr = head;
        for (int i = 1; i < nums.length; i++) {
            curr.next = new ListNode(nums[i]);
            curr = curr.next;

        }

        head = deleteMiddle(head);

        ListNode temp = head;


        while (temp!=null){
            System.out.print(temp.val + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
    }
}
