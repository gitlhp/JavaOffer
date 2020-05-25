package 剑指Offer.easy;

import Common.ListNode;

import java.util.Stack;

/**
 * @ClassName: JO06
 * @Description：从尾到头打印链表
 * @Author: lhp
 * @Date: 2020/5/17 23:22
 * @Version: V1.0
 **/
public class JO06 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            res[i++] = stack.pop();
        }
        return res;
    }
}
