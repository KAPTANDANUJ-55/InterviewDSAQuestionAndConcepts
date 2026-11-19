package BinaryTree;

import LL.TreeNode;

public class BinaryMinimumPathSum {
    private static int maxPathSumValue = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {
        maxu(root);
        return maxPathSumValue;
    }

    private static int maxu(TreeNode root){

        if(root == null){
            return 0;
        }
        int leftGain = Math.max(0, maxu(root.left));
        int rightGain = Math.max(0, maxu(root.right));

        int currentPathSum = root.val + leftGain + rightGain;
        maxPathSumValue = Math.max(currentPathSum,maxPathSumValue);

        return  root.val + Math.max(leftGain, rightGain);
    }
}
