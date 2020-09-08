public class Solution {
    private int min = Integer.MAX_VALUE;
    private int prev = Integer.MIN_VALUE;
    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        return min;
    }

    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        if (prev != Integer.MIN_VALUE) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minDiffInBST(new TreeNode(90, new TreeNode(69, new TreeNode(49,  null, new TreeNode(52)), new TreeNode(89)), null)));
    }
}
