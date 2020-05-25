package 剑指Offer.easy;

import Common.ListNode;

/**
 * @ClassName: JO22
 * @Description:链表中的倒数第K个数 双指针
 * @Author: lhp
 * @Date: 2020/5/22 11:30
 * @Version: V1.0
 **/
public class JO22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode pre = head, knode = head;
        int n = 0;
        while (pre != null) {
            if (n >= k) {
                knode = knode.next;
            }
            pre = pre.next;
            n++;
        }
        return knode;
    }
}
