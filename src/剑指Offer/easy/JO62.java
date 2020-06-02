package 剑指Offer.easy;

/**
 * @ClassName: JO62
 * @Description:约瑟夫问题
 * @Author: lhp
 * @Date: 2020/6/1 14:43
 * @Version: V1.0
 **/
public class JO62 {
    public int lastRemaining(int n, int m) {
        int ans = 0;
        // 最后一轮剩下2个人，所以从2开始反推
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }
}
