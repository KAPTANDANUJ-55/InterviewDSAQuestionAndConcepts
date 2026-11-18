package BinaryTree;

import LL.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreOrder {
static List<Integer> result;

 public static List<Integer> preOrder(TreeNode root){
     result = new ArrayList<Integer>();

     preOr(root);
     return result;
 }
    static void preOr(TreeNode root){
        if(root==null) return;
        result.add(root.val);
        preOr(root.left);
        preOr(root.right);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(preOrder(root));
    }
}
