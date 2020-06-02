package 剑指Offer.easy;

import Common.TreeNode;

/**
 * @ClassName: JO68_1
 * @Description:二叉搜索树的最近公共祖先
 * @Author: lhp
 * @Date: 2020/6/2 11:11
 * @Version: V1.0
 **/
public class JO68_1 {
    //迭代 O(N) O(1)
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            //都在右子树
            if (root.val < p.val && root.val < q.val) {
                root = root.right;
                //都在左子树
            } else if (root.val > p.val && root.val > q.val) {
                root = root.left;
            } else {
                break;//只要是在两侧、或者root等于其中之一 就返回该节点即可
            }
        }
        return root;
    }

    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }


}
