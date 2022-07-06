import java.util.ArrayList;
import java.util.List;

public class Inorder {
    List<Integer> result = new ArrayList<Integer>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        inorderTrav(root);
        return result;
    }

    public void inorderTrav(TreeNode n) {
        if (n != null) {
            inorderTrav(n.left);
            result.add(n.val);
            inorderTrav(n.right);
        }
    }
}

/**
 * InnerIn
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode() {
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}