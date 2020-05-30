package 剑指Offer.easy;

import java.util.Stack;

/**
 * @ClassName: JO58_2
 * @Description
 * @Author: lhp
 * @Date: 2020/5/30 15:31
 * @Version: V1.0
 **/
public class JO58_2 {
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        StringBuilder str = new StringBuilder();
        String s1 = s.substring(0,n);
        String s2 = s.substring(n,s.length());
        str.append(s2).append(s1);
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "qwerty";
        System.out.println(s.substring(3,s.length()));
    }
}
