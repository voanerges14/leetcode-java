import java.util.LinkedList;
import java.util.Queue;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left) + 1;
        int right = maxDepth(root.right) + 1;
        return Math.max(left, right);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.minDepth(new TreeNode(3, new TreeNode(2), null)));
//        System.out.println(solution.minDepth(new TreeNode(3, new TreeNode(9),
//                new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
        System.out.println(solution.maxDepth(
                new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                        new TreeNode(3))));

    }

}