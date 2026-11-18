import java.util.Scanner;

public class BT {

    // Root of the tree
    private Node root;

    // Node structure
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    // Public method to start taking input
    public void populate(Scanner sc) {
        System.out.print("Enter root value: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }
    public Node getRoot() {
        return this.root;
    }
    // Recursive population of tree
    private void populate(Scanner sc, Node node) {

        System.out.print("Do you want to enter LEFT of " + node.value + "? (true/false): ");
        boolean left = sc.nextBoolean();

        if (left) {
            System.out.print("Enter LEFT value of " + node.value + ": ");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.print("Do you want to enter RIGHT of " + node.value + "? (true/false): ");
        boolean right = sc.nextBoolean();

        if (right) {
            System.out.print("Enter RIGHT value of " + node.value + ": ");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    // Display tree (Inorder Traversal)
    public void display() {
        System.out.print("Inorder Traversal: ");
        display(root);
        System.out.println();
    }

    private void display(Node node) {
        if (node == null) return;
        display(node.left);
        System.out.print(node.value + " -> ");
        display(node.right);
    }



    // in order

    /*

    We have seen this abv Left Root Right
    */

    // post order
//------------|----------
    /*
    Left Right Root
    */
// -----------|--------


    // pre order

    /*
    Root Left Right
    */
}
