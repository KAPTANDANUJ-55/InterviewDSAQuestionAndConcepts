package BinarySearchTree;

import LL.TreeNode;

public class MinimumAbsoluteDifference {
    static Integer prev = null;
    static int  minDiff= Integer.MAX_VALUE;
    public static int getMinimumDifference(TreeNode root) {
        min(root);
        return minDiff;
    }
    private static void min(TreeNode root){
        if(root==null) return;


        min(root.left);

        if(prev!=null){
            minDiff =Math.min(minDiff,root.val-prev);
        }

        prev = root.val;

        min(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        System.out.println(getMinimumDifference(root));
    }
}
