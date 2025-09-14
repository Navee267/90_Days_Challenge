
//   Definition for a binary tree node.
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

public class Tree {
    private int total = 0;

    public int countNodes(TreeNode root) {
        count(root);
        return total;
    }

    public void count(TreeNode root) {
        if (root != null) {
            count(root.left);
            total++;
            count(root.right);
        }
    }
}