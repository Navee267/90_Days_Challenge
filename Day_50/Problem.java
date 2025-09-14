import java.util.TreeSet;


//   Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class Problem {
    public TreeNode increasingBST(TreeNode root) {
        TreeSet<Integer> set = new TreeSet<>();
        inOrder(set,root);
        TreeNode dummy = new TreeNode(0);
        TreeNode curr = dummy;
        for(int num : set){
            curr.right = new TreeNode(num);
            curr = curr.right;
        }
        return dummy.right;
    }

    public void inOrder(TreeSet set,TreeNode node){
        if(node !=null){
            inOrder(set,node.left);
            set.add(node.val);
            inOrder(set,node.right);
        }
    }
}