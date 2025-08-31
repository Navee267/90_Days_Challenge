public class BinarySearchTree {
    Node root;

    class Node {
        int key;
        Node left;
        Node right;

        Node(int val) {
            key = val;
            left = null;
            right = null;
        }
    }

    BinarySearchTree(int val) {
        root = new Node(val);
    }

    BinarySearchTree() {
        root = null;
    }

    public Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.key) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.key);
            inOrder(root.right);
        }
    }

    public Node search(Node root, int val) {
        if (root == null || root.key == val) {
            return root;
        }

        if (val < root.key) {
            return search(root.left, val);
        }

        return search(root.right, val);
    }

    public Node deleteNode(Node root, int val) {
        if (root == null) {
            return root;
        }

        if (val > root.key) {
            root.right = deleteNode(root.right, val);
        } else if (val < root.key) {
            root.left = deleteNode(root.left, val);
        } else {
            if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            }
            root.key = min(root.right);
            root.right = deleteNode(root.right, root.key);
        }
        return root;
    }

    public int min(Node root) {
        int minKey = root.key;

        while (root.left != null) {
            minKey = root.left.key;
            root = root.left;
        }
        return minKey;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(10);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 50);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 70);
        tree.inOrder(tree.root);
        if (tree.search(tree.root, 10) == null) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found");
        }
        System.out.println("--------------------- || ---------------------");
        tree.root = tree.deleteNode(tree.root, 10);
        tree.inOrder(tree.root);
    }
}