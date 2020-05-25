package 剑指Offer.easy;

/**
 * @ClassName: JO10_1
 * @Description:斐波那契数列
 * @Author: lhp
 * @Date: 2020/5/18 10:38
 * @Version: V1.0
 **/
public class JO10_1 {
    public int fib(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            int s = (a + b) % 1000000007;
            a = b;
            b = s;
        }
        return a;
    }

    public int fib1(int n) {
        if (n==0){
            return 0;
        }
        int[] res = new int[n+1];
        for (int i = 2; i <=n ; i++) {
            res[i] = (res[i-1]+res[i-2])%1000000007;
        }
        return res[n];
    }
}
