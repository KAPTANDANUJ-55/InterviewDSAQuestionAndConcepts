package BinaryTree;

import LL.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTree {

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();


        leaf(root1,leaves1);
        leaf(root2,leaves2);


        return leaves1.equals(leaves2);

    }

    private static void leaf(TreeNode root , List<Integer> leafVal){
        if(root==null) return;
        if(root.left==null && root.right==null){
            leafVal.add(root.val);
            return;
        }


        leaf(root.left,leafVal);
        leaf(root.right,leafVal);



    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.right.left = new TreeNode(9);
        root1.right.right = new TreeNode(8);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(1);
        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(7);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(2);
        root2.right.right.left = new TreeNode(9);
        root2.right.right.right = new TreeNode(8);


        System.out.println(leafSimilar(root1,root2));
    }


}
