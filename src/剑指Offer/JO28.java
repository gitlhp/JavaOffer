package 剑指Offer;

import Common.TreeNode;

/**
 * @ClassName: JO28
 * @Description:对称的二叉树
 * @Author: lhp
 * @Date: 2020/5/22 15:25
 * @Version: V1.0
 **/
public class JO28 {
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
            return true;
        }
        if (l == null || r == null || l.val != r.val) {
            return false;
        }
        return isMirror(l.left, r.right) && isMirror(l.right, r.left);
    }
}
