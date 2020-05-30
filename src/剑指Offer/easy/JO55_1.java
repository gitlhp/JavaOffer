package 剑指Offer.easy;

import Common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName: JO55_1
 * @Description:二叉树的深度
 * @Author: lhp
 * @Date: 2020/5/28 14:06
 * @Version: V1.0
 **/
public class JO55_1 {
    //递归 深度优先n 双100%
    public int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return Math.max(l,r)+1;
    }


    //层序遍历  广度优先 时间空间更高
    public int maxDepth(TreeNode root) {
        int res = 0;
        if (root==null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        res++;
        while (!queue.isEmpty()){
            int size = queue.size();
            res++;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        return res;
    }
}
