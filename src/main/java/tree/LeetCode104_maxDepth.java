package tree;

public class LeetCode104_maxDepth {

    /**
     *  计算数的最大高度
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 计算左子树的高度
        int leftDepth = maxDepth(root.left);
        // 计算又子树的高度
        int rightDepth = maxDepth(root.right);
        // 当前的高度加上 子树最大的高度（左子树或者右子树）
        return 1 + Math.max(leftDepth, rightDepth);
    }

}
