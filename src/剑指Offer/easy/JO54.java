package 剑指Offer.easy;

import Common.TreeNode;

import java.util.Stack;

/**
 * @ClassName: JO54
 * @Description:二叉搜索树的第 k 大节点
 * @Author: lhp
 * @Date: 2020/5/28 11:10
 * @Version: V1.0
 **/
public class JO54 {
    int res = 0;
    int k;

    /**
     * 中序遍历倒序为递减序列-递归
     *
     * @param root
     * @param k
     * @return
     */
    public int kthLargest1(TreeNode root, int k) {
        this.k = k;
        int res = 0;
        dfs(root);
        return res;
    }

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.right);
        if (k == 0) {
            return;
        }
        if (--k == 0) {
            res = node.val;
        }

        dfs(node.left);
    }

    /**
     * 非递归版本
     *
     * @param root
     * @param k
     * @return
     */
    public int kthLargest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        int res = 0;
        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                stack.push(p);
                p = p.right;
            } else {
                p = stack.pop();
                if (--k == 0) {
                    res = p.val;
                }
                p = p.left;
            }
        }
        return res;
    }
}
