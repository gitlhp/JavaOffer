package 剑指Offer.easy;

import Common.ListNode;

/**
 * @ClassName: JO25
 * @Description:合并两个有序的链表
 * @Author: lhp
 * @Date: 2020/5/22 14:13
 * @Version: V1.0
 **/
public class JO25 {
    //递归
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2==null){
            return l1;
        }
       if (l1.val>l2.val){
           l2.next = mergeTwoLists(l1,l2.next);
           return l2;
       }else {
           l1.next =mergeTwoLists(l1.next,l2);
           return l1;
       }
    }
    //非递归
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                curr.next = l1;
                l1 = l1.next;
            } else{
                curr.next = l2;
                l2 = l2.next;
            }
            //有可能有一方不为null都为null随意
            curr.next = l1!=null?l1:l2;
        }
        return head.next;
    }
}
