package LinkedList;

import LL.ListNode;

public class MiddleOfLL {

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ListNode head = new ListNode(nums[0]);
        ListNode curr =  head;
        for (int i = 1; i < nums.length; i++) {
            curr.next = new ListNode(nums[i]);
            curr = curr.next;
        }

        head = middleNode(head);

      ListNode temp = head;

      while(temp!=null){
          System.out.print(temp.val + (temp.next != null ? " -> " : ""));
          temp = temp.next;
      }
    }
}
