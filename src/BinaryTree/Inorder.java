package BinaryTree;

import LL.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Inorder {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();

        inorder(root,l);
        return l;
    }
   static void  inorder(TreeNode node,List<Integer> result){
        if(node==null) return;
        inorder(node.left,result);
        result.add(node.val);
        inorder(node.right,result);
    }

    public static void main(String[] args) {
       TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);


        List<Integer> result = inorderTraversal(root);
        System.out.println(result);
    }
}
