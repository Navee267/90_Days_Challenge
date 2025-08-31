
// Definition for a binary tree node.

import java.util.ArrayList;
import java.util.List;

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

public class TreeNodeProblem2 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrder(root, list);
        return list;
    }

    public void postOrder(TreeNode root, List<Integer> list) {
        if (root != null) {
            postOrder(root.left, list);
            postOrder(root.right, list);
            list.add(root.val);
        }
    }
}