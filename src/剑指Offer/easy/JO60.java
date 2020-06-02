package 剑指Offer.easy;

/**
 * @ClassName: JO60
 * @Description:n个骰子的点数
 * @Author: lhp
 * @Date: 2020/6/1 10:45
 * @Version: V1.0
 **/
public class JO60 {
    public double[] twoSum(int n) {
        double pre[] = {1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d};
        for (int i = 2; i <= n; i++) {
            double tmp[] = new double[5 * i + 1];
            for (int j = 0; j < pre.length; j++) {
                for (int x = 0; x < 6; x++) {
                    tmp[j + x] += pre[j] / 6;
                }
            }
            pre = tmp;
        }
        return pre;
    }
}
