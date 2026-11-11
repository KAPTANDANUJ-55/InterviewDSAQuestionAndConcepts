package LinkedList;

import LL.ListNode;

import java.util.HashSet;

public class RemoveArrayElementInLL {
    public static ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode curr = head;
        ListNode prev = dummy;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        while(curr!=null){
            boolean found = set.contains(curr.val);
            if(found){
                prev.next = curr.next;
            }
            else{
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] nums2 = {1,2,3,4,5};
        ListNode head = new ListNode(nums2[0]);
        ListNode curr = head;

        for (int i = 1; i < nums2.length; i++) {
            curr.next = new ListNode(nums2[i]);
            curr = curr.next;
        }
        head = RemoveArrayElementInLL.modifiedList(nums, head);

        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
    }
}
