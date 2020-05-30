package 剑指Offer.easy;

import Common.TreeNode;

/**
 * @ClassName: JO55_2
 * @Description:判断是否为平衡二叉树
 * @Author: lhp
 * @Date: 2020/5/28 14:17
 * @Version: V1.0
 **/
public class JO55_2 {
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root)!=-1;

    }
    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left);
        //剪枝
        if (l==-1){
            return -1;
        }
        int r = maxDepth(root.right);
        if (r==-1){
            return -1;
        }
        return Math.abs(l-r)<2?Math.max(l,r)+1:-1;
    }
}
