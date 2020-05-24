package 剑指Offer;

/**
 * @ClassName: JO10_2
 * @Description
 * @Author: lhp
 * @Date: 2020/5/18 11:04
 * @Version: V1.0
 **/
public class JO10_2 {
    public int numWays(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; ++i) {
            int s = (a + b) % 1000000007;
            a = b;
            b = s;
        }
        return b;
    }
}
