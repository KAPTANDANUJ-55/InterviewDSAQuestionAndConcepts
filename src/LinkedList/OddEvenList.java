package LinkedList;
import LL.ListNode;

import java.util.List;

public class OddEvenList {
    public static ListNode oddEvenList(ListNode head) {
        ListNode curr = head;
        if (head == null || head.next == null) {
            return head;
        }
        ListNode oddP = head;
        ListNode eveP = head.next;
        ListNode ans = eveP;


        while(eveP!=null && eveP.next!=null){
            oddP.next = eveP.next;
            oddP = oddP.next;

            eveP.next = oddP.next;
            eveP = eveP.next;
        }

        oddP.next = ans;

        return head;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        ListNode head = new ListNode(nums[0]);
        ListNode curr = head;
        for (int i = 1; i < nums.length; i++) {
            curr.next = new ListNode(nums[i]);
            curr = curr.next;
        }

        head = oddEvenList(head);

        ListNode ans = head;

        while (ans != null) {
            System.out.print(ans.val + (ans.next != null ? " -> " : ""));
            ans = ans.next;
        }

    }
}


