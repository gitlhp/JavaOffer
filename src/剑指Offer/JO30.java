package 剑指Offer;

import java.util.Stack;

/**
 * @ClassName: JO30
 * @Description:包含min函数的栈
 * @Author: lhp
 * @Date: 2020/5/23 11:11
 * @Version: V1.0
 **/
public class JO30 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    /**
     * initialize your data structure here.
     */
    public JO30() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        if (stack2.empty() || stack2.peek() >= x) {
            stack2.push(x);
        }
        stack1.push(x);
    }

    public void pop() {
        if (stack1.pop().equals(stack2.peek())) {
            stack2.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}
