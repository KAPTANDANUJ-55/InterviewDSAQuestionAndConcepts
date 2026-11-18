package BinaryTree;

import LL.TreeNode;

import java.util.*;

public class ZigZagLevelOrder {
  static   boolean isRev=false;


    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        tra(root,result);
        return result;
    }

    static void tra(TreeNode root, List<List<Integer>> result){
        if(root == null) return;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);


        while(!q.isEmpty()){
            List<Integer> currentLevel = new LinkedList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                currentLevel.add(temp.val);


                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }

            if(isRev){
                Collections.reverse(currentLevel);
            }

            result.add(currentLevel);
            isRev = !isRev;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(zigzagLevelOrder(root));
    }
}
