
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

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        addTwoNumbers(l1, l2, 0);
        return l1;
    }

    private void addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        int res = l1.val + l2.val + carry;
        carry = 0;

        if (res >= 10) {
            res-=10;
            carry = 1;
        }

        l1.val = res;

        if (l1.next == null && l2.next == null) {
            if (carry > 0) l1.next = new ListNode(carry);
            return;
        }

        if (l1.next == null) l1.next = new ListNode(0);
        if (l2.next == null) l2.next = new ListNode(0);

        addTwoNumbers(l1.next, l2.next, carry);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        var l1 = new ListNode(0, new ListNode(9, new ListNode(9, new ListNode(0))));
//        var l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0))));

//        var l2 = new ListNode(5);
//        var l1 = new ListNode(5);

        var l1 = new ListNode(9, new ListNode(8));
        var l2 = new ListNode(1);

        var res = solution.addTwoNumbers(l1, l2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}