package 剑指Offer;

import java.util.Stack;

/**
 * @ClassName: JO09
 * @Description:两个栈实现队列
 * @Author: lhp
 * @Date: 2020/5/18 10:24
 * @Version: V1.0
 **/
public class JO09 {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public JO09() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        if (!s2.empty()) {
            return s2.pop();
        } else {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        return s2.empty()?-1:s2.pop();

    }
}
