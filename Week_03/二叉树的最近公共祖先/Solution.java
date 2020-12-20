class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {

    private TreeNode ans;

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        boolean lson = dfs(root.left, p, q);
        boolean rson = dfs(root.right, p, q);
        if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
            ans = root;
        }
        return lson || rson || (root.val == p.val || root.val == q.val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return this.ans;
    }

    private static TreeNode createNode(int index, Integer[] nums) {
        if (index >= nums.length || nums[index] == null) {
            return null;
        }
        TreeNode root = new TreeNode(nums[index]);
        root.left = createNode(2 * index + 1, nums);
        root.right = createNode(2 * index + 2, nums);
        return root;
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};
        TreeNode treeNode = createNode(0, nums);
        System.out.println(new Solution().lowestCommonAncestor(treeNode, new TreeNode(5), new TreeNode(1)).val);
    }
}