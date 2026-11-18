package BinaryTree;

import LL.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

    public static List<Integer> rightSideView(TreeNode root){
           List<Integer> list = new ArrayList<>();

           if(root==null){
               return list;
           }

           Queue<TreeNode> queue = new LinkedList<>();
           queue.offer(root);
           while(!queue.isEmpty()){
               int levelSize = queue.size();
               for(int i=0;i<levelSize;i++){
                   TreeNode temp = queue.poll();
                   if(i==levelSize-1){
                       list.add(temp.val);
                   }

                   if(temp.left!=null){
                       queue.offer(temp.left);
                   }
                   if(temp.right!=null){
                       queue.offer(temp.right);
                   }
               }
           }

           return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);


        System.out.println(rightSideView(root));
    }
}
