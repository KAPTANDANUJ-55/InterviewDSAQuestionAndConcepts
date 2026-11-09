    package LinkedList;

    import LL.TreeNode;
    import LL.ListNode;

    import java.util.ArrayList;
    import java.util.List;

    public class ConverLLToBT {
        public TreeNode sortedListToBST(ListNode head) {
            List<Integer> values = new ArrayList<>();
            while (head != null) {
                values.add(head.val);
                head = head.next;
            }

            return recur(values, 0, values.size() - 1);
        }
        public static TreeNode recur(List<Integer> values, int left , int right){
            if (left > right) {
                return null;
            }

            int mid = (left+right) >> 1;

            TreeNode root = new TreeNode(values.get(mid));


            root.left = recur(values,left,mid-1);
            root.right = recur(values,mid+1,right);

            return root;
        }

        public static void main(String[] args) {
            int[] nums = {-10,-3,0,5,9};

            ListNode head = new ListNode(nums[0]);

            ListNode cur = head;

            for (int i = 1; i < nums.length; i++) {
                cur.next = new ListNode(nums[i]);
                cur = cur.next;
            }

            ConverLLToBT obj = new ConverLLToBT();
            TreeNode root = obj.sortedListToBST(head);

            System.out.print("In-order of BST: ");
            printInOrder(root);
            System.out.println();
        }

        private static void printInOrder(TreeNode root) {
            if (root == null) return;
            printInOrder(root.left);
            System.out.print(root.val + " ");
            printInOrder(root.right);
        }
    }
