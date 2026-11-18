package BinaryTree;

import LL.TreeNode;

public class SameTree {
       public static boolean isSameTree(TreeNode p, TreeNode q) {
        return isValid(p,q);
    }
    private static boolean isValid(TreeNode n1,TreeNode n2){
        if(n1==null && n2==null){
            return true;
        }
        if(n1==null || n2==null) return false;
        if(n1.val!=n2.val){
            return false;
        }

        return isValid(n1.left,n2.left)&& isValid(n1.right,n2.right);
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        System.out.println(isSameTree(p,q));
    }
}
