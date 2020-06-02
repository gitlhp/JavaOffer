package 剑指Offer.easy;

import Common.TreeNode;

/**
 * @ClassName: JO68_2
 * @Description:二叉树的最近公共祖先-dfs/递归
 * @Author: lhp
 * @Date: 2020/6/2 14:46
 * @Version: V1.0
 **/
public class JO68_2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }
}
