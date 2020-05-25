package 剑指Offer.easy;

import Common.ListNode;

/**
 * @ClassName: JO52
 * @Description:两个链表的第一个公共节点-双指针
 * @Author: lhp
 * @Date: 2020/5/25 14:47
 * @Version: V1.0
 **/
public class JO52 {
    /**
     * 执行用时 :
     * 1 ms
     * , 在所有 Java 提交中击败了
     * 100.00%
     * 的用户
     * 内存消耗 :
     * 42.8 MB
     * , 在所有 Java 提交中击败了
     * 100.00%
     * 的用户
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA;
        ListNode pb = headB;
        while (pa != pb) {
            pa = (pa == null ? headB : pa.next);
            pb = (pb == null ? headA : pb.next);
        }
        return pa;
    }
}
