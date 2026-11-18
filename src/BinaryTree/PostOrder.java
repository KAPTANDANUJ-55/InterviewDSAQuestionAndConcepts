package BinaryTree;
import LL.TreeNode;

import java.util.*;
public class PostOrder {
    static List<Integer> result;
    public static List<Integer> postorderTraversal(TreeNode root) {
        result = new ArrayList<Integer>();
        posOrder(root);
        return result;
    }

   static void posOrder(TreeNode root){
        if(root==null)return;

        posOrder(root.left);
        posOrder(root.right);
        result.add(root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);


        System.out.println(postorderTraversal(root));
    }
}
