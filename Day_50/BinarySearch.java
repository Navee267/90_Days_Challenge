
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

public class BinarySearch {
    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) {
            return root;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            }
            root.val = min(root.right);
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    public int min(TreeNode r) {
        int min = r.val;
        while (r.left != null) {
            min = r.left.val;
            r = r.left;
        }
        return min;
    }
}