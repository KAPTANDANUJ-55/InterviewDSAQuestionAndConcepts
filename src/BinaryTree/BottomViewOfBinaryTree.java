package BinaryTree;

import LL.TreeNode;

import java.util.*;

public class BottomViewOfBinaryTree {

    static class Pair{
        int hd;
        TreeNode node;
        Pair(int T,TreeNode node){
            this.hd = T;
            this.node = node;
        }
    }

    public static ArrayList<Integer> bottomViewOfBinaryTree(TreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<Pair> queue = new LinkedList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        queue.offer(new Pair(0,root));
        while(!queue.isEmpty()){
            Pair curr = queue.poll();
//            if(!map.containsKey(curr.hd)){
//                map.put(curr.hd,curr.node.val);
//            }
          map.put(curr.hd,curr.node.val);
            if(curr.node.right!=null){
                queue.offer(new Pair(curr.hd+1,curr.node.right));
            }
            if(curr.node.left!=null){
                queue.offer(new Pair(curr.hd-1,curr.node.left));
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            res.add(entry.getValue());
        }
        return res;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println(bottomViewOfBinaryTree(root));
    }

}
