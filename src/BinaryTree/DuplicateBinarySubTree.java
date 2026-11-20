package BinaryTree;

import LL.TreeNode;

public class DuplicateBinarySubTree {

    static int  totalSum = 0;
    public static int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return totalSum;
    }



    private static void dfs(TreeNode node,int currentSum) {
        if (node == null) return;


        currentSum = currentSum*10+node.val;


        if (node.left == null && node.right == null) {
            totalSum += currentSum;
        } else {

            dfs(node.left, currentSum);
            dfs(node.right, currentSum);
        }



    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(sumNumbers(root));
    }
}
