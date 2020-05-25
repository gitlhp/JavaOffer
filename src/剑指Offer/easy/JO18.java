package 剑指Offer.easy;

import Common.ListNode;

/**
 * @ClassName: JO18
 * @Description:删除链表的节点
 * @Author: lhp
 * @Date: 2020/5/20 15:28
 * @Version: V1.0
 **/
public class JO18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }
        ListNode pre = head, cur = head.next;
        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        pre.next = cur.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        JO18 jo18= new JO18();
        jo18.deleteNode(node1,3);
    }
}
