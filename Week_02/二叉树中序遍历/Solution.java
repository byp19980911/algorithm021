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

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        iter(root, result);
        return result;
    }

    public void iter(TreeNode root, List<Integer> result) {
        if (root.left != null) {
            iter(root.left, result);
        }
        result.add(root.val);
        if (root.right != null) {
            iter(root.right, result);
        }
    }


    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(3);

        List<Integer> integers = new Solution().inorderTraversal(node);

        System.out.println(integers);
    }
}