package 剑指Offer;

import Common.ListNode;

/**
 * @ClassName: JO24
 * @Description:反转链表
 * @Author: lhp
 * @Date: 2020/5/22 14:07
 * @Version: V1.0
 **/
public class JO24 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            //记录下一个节点
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
