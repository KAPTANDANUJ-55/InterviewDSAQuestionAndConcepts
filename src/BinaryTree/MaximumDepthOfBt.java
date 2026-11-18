package BinaryTree;

import LL.TreeNode;

public class MaximumDepthOfBt {
    public static int maxDepth(TreeNode root) {

        return deepDive(root);
    }

    private static int deepDive(TreeNode root){

        if(root==null){
            return 0;
        }

        int leftD = deepDive(root.left);
        int rightD = deepDive(root.right);

        return Math.max(leftD,rightD)+1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(maxDepth(root));
    }
}
