package LinkedList;

import LL.ListNode;

public class InsertGCDInLL {
    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;

        while(curr!=null && curr.next!=null){
            int gcdVal = gcd(curr.val,curr.next.val);

            ListNode gcdNode = new ListNode(gcdVal);

            gcdNode.next = curr.next;
            curr.next = gcdNode;

            curr = gcdNode.next;
        }

        return dummy.next;
    }

    private static int gcd(int a , int b){
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        int[] nums = {18,6,10,3};

        ListNode head = new ListNode(nums[0]);
        ListNode curr = head;
        for(int i=1;i<nums.length;i++){
            curr.next = new ListNode(nums[i]);
            curr = curr.next;
        }

        head =  insertGreatestCommonDivisors(head);

        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
    }
}
