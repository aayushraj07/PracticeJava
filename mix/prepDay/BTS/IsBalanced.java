package prepDay.BTS;

public class IsBalanced {

    public static class TreeNode {
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
    public static boolean isBalanced(TreeNode root) {

        if(root == null){
            return true;
        }

        // Calculate the height of the left and right subtrees.
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        // Check if the left and right subtrees are height-balanced, and their height difference is at most 1.
        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }

        return false;
    }


    private static int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args){
        // Create a sample balanced binary tree.
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        boolean balanced = isBalanced(root);
        System.out.println("Is the binary tree balanced? " + balanced); // Output: true
    }
}
