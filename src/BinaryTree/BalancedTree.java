package BinaryTree;

import LL.TreeNode;

public class BalancedTree {

    public static boolean isBalanced(TreeNode root) {
        return isB(root)!=-1;
    }
    private static int isB(TreeNode root){


        if (root == null) {
            return 0;
        }



        int leftHeight = isB(root.left);

        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = isB(root.right);


        if (rightHeight == -1) {
            return -1;
        }


        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }


        return Math.max(leftHeight, rightHeight) + 1;
    }


    private static boolean isBalanced2(TreeNode root) {
        if (root == null) {
            return true;
        }
           int leftH = height(root.left);
           int rightH = height(root.right);

           if (leftH == -1 || rightH == -1 || Math.abs(leftH - rightH) > 1) {
               return false;
           }

       return isBalanced2(root.left) && isBalanced2(root.right);


    }

    private static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
     root.left = new TreeNode(9);
     root.right = new TreeNode(20);
     root.left.left = new TreeNode(15);
     root.left.right = new TreeNode(7);
     System.out.println(isBalanced(root));
     System.out.println(isBalanced2(root));
    }
}
