package LinkedList;
import LL.ListNode;

public class TwinSumMAx {
    public static int pairSum(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null&& fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;

        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }


        int max=0;
        ListNode first = head;
        ListNode second = prev;

        while(second.next!=null){
            max = Math.max(max, first.val + second.val);
            first = first.next;
            second = second.next;

        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,2,1};

        ListNode head =  new ListNode(nums[0]);
        ListNode curr =head;
        for (int i = 1; i < nums.length; i++) {
            curr.next = new ListNode(nums[i]);
            curr = curr.next;
        }
      int res= pairSum(head);
        System.out.println(res);
    }
}
