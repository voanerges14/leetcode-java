class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public boolean isPalindrome(ListNode head) {

        int val = recursionNode(head).val;
        return false;
    }

    private ListNode recursionNode(ListNode node) {
        ListNode tail = null;
        if (node.next != null) {
            tail = recursionNode(node.next);
            return tail;
        }
        if (tail.val != node.val) {
            return node;
        }
        return node;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(new ListNode(1, new ListNode(2, new ListNode(3)))));
    }
}