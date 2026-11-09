package LL;

public class MakeLL {
    public int val;
    public MakeLL next;

    // Default constructor
    public MakeLL() {}

    // Constructor to initialize value
    public MakeLL(int val) {
        this.val = val;
        this.next = null;
    }

    // Constructor to initialize value and next pointer link
    public MakeLL(int val, MakeLL next) {
        this.val = val;
        this.next = next;
    }
}
