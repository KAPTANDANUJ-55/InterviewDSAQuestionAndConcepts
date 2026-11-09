package LL;


public class ListNode {
    public int val;
    public ListNode next;

    // Default constructor
    public ListNode() {}

    // Constructor to initialize value
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    // Constructor to initialize value and next pointer link
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
