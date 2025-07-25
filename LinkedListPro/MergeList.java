package LinkedListPro;

public class MergeList {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Function to merge two sorted lists
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(-1); // Dummy node
        ListNode current = temp;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach remaining nodes
        current.next = (list1 != null) ? list1 : list2;

        return temp.next;
    }

    // Display function
    public void display(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    // Main function for testing
    public static void main(String[] args) {
        MergeList ml = new MergeList();

        // First sorted list: 1 -> 2 -> 4
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        // Second sorted list: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        // Merge them
        ListNode result = ml.mergeTwoLists(l1, l2);

        // Display result
        System.out.println("Merged Sorted List:");
        ml.display(result);
    }
}
