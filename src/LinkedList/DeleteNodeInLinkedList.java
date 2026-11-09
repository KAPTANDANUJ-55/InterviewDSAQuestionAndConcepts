package LinkedList;


import LL.ListNode;

public class DeleteNodeInLinkedList {

    // Here Only Node Is Given And You Don't Have Access To Head So What You Have To DO Just
    // Do Node.val == Node.next.val

    public static void deleteNode(ListNode node) {
        //    ListNode temp = node.next;

        //     node.val = temp.val;
        //    node.next = temp.next;



         ListNode prev = node;
        while (node.next != null) {
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }


        if(prev!=null){
            prev.next=null;
        }
    }


    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 9};
        ListNode head = new ListNode(nums[0]);
        ListNode curr = head;
        ListNode targetNode = null;

        int targetVal =5;

        if(nums[0]==targetVal){
            targetNode=head;

        }

        for(int i=1;i<nums.length;i++){
            curr.next = new ListNode(nums[i]);

            curr = curr.next;
            if(nums[i]==targetVal){
                targetNode=curr;
            }
        }

        if(targetNode!=null){
            deleteNode(targetNode);
        }
        ListNode temp = head;

        while(temp!=null){
            System.out.print(temp.val + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }




    }
}