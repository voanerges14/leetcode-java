class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) { return l2; }
        if (l2 == null) { return l1; }

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        ListNode listNode = solution.mergeTwoLists(null, new ListNode(1));
//        ListNode listNode = solution.mergeTwoLists(null, new ListNode(1));
        ListNode listNode = solution
                .mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))),
                        new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))));
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}