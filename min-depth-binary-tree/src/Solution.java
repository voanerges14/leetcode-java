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

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depthCount = 1;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.remove();
                if (currentNode.left == null && currentNode.right == null) { return depthCount; }
                if (currentNode.left != null) { queue.add(currentNode.left); }
                if (currentNode.right != null) { queue.add(currentNode.right); }
            }
            depthCount++;
        }
        return depthCount;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.minDepth(new TreeNode(3, new TreeNode(2), null)));
//        System.out.println(solution.minDepth(new TreeNode(3, new TreeNode(9),
//                new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
        System.out.println(solution.minDepth(
                new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                        new TreeNode(3))));

    }

}