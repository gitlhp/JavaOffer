package 剑指Offer.easy;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName: JO32_3
 * @Description: 从上到下打印二叉树 III
 * @Author: lhp
 * @Date: 2020/5/24 10:42
 * @Version: V1.0
 **/
public class JO32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return lists;
        }
        queue.offer(root);
        int n = 1;
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (n % 2 == 0) {
                lists.add(reverse(list));
            } else {
                lists.add(list);
            }
            n++;
        }
        return lists;
    }

    private List<Integer> reverse(List<Integer> list) {
        List<Integer> list1 = new ArrayList<>();
        int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
            list1.add(list.get(i));
        }
        return list1;
    }
}
