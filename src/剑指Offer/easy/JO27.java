package 剑指Offer.easy;

import Common.TreeNode;

/**
 * @ClassName: JO27
 * @Description:二叉树的镜像
 * @Author: lhp
 * @Date: 2020/5/22 15:05
 * @Version: V1.0
 **/
public class JO27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            mirrorTree(root.left);
            mirrorTree(root.right);
        }
        return root;
    }
}
