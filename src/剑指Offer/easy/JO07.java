package 剑指Offer.easy;

import Common.TreeNode;

/**
 * @ClassName: JO07
 * @Description:重建二叉树-前序和中序
 * @Author: lhp
 * @Date: 2020/5/18 9:21
 * @Version: V1.0
 **/
public class JO07 {
    //递归
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder == null || preorder.length == 0 || preorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }
      return buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    //避免数组复制的过程，减少空间复杂度
    public TreeNode buildTree(int[] preorder, int s1, int e1, int[] inorder, int s2, int e2) {
        if (s1 > e1 || s2 > e2) {
            return null;
        }
        int index = findIndex(inorder,s2,e2,preorder[s1]);
        //根节点
        TreeNode tree = new TreeNode(preorder[s1]);
        tree.left = buildTree(preorder,s1+1,index+s1-s2,inorder,s2,index-1);
        tree.right = buildTree(preorder,index+s1-s2+1,e1,inorder,index+1,e2);
        return tree;

    }

    public int findIndex(int[] order, int s, int e, int val) {
        for (int i = s; i <= e; i++) {
            if (order[i]==val){
                return i;
            }
        }
        return -1;
    }
}
