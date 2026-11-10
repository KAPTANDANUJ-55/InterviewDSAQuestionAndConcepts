    package LinkedList;

    import LL.ListNode;

    import java.util.List;


    public class MergeInBetweenLinkedList {
        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

            ListNode dummy = new ListNode(0);
            dummy.next =list1;
            ListNode curr = dummy;
            int index = 0;
            while(curr.next!=null && curr.next.next!=null){
                if (index == a) {
                    ListNode runner = curr.next;

                    for (int i = a; i <= b && runner != null; i++) {
                        runner = runner.next;
                    }

                    curr.next = list2;


                    ListNode tail = list2;

                    while(tail.next!=null){

                        tail = tail.next;
                    }

                    tail.next = runner;

                    break;
                }

                curr = curr.next;
                index++;
            }

            return dummy.next;
        }

        public static void main(String[] args) {
            int[] arr1 = {10, 1, 13, 6, 9, 5};
            int a = 3;
            int b = 4;
            int[] arr2 = {1000000, 1000001, 1000002};


            ListNode list1 = new ListNode(arr1[0]);
            ListNode curr1 = list1;
            ListNode list2 = new ListNode(arr2[0]);
            ListNode curr2 = list2;
            for (int i = 1; i < arr1.length; i++) {
                curr1.next = new ListNode(arr1[i]);
                curr1 = curr1.next;
            }

            for (int i = 1; i < arr2.length; i++) {
                curr2.next = new ListNode(arr2[i]);
                curr2 = curr2.next;
            }

            ListNode result = new MergeInBetweenLinkedList().mergeInBetween(list1, a, b, list2);


            ListNode printNode = result;
            while (printNode != null) {
                System.out.print(printNode.val + (printNode.next != null ? " -> " : ""));
                printNode = printNode.next;
            }
            System.out.println();


        }
    }
