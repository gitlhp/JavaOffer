package 剑指Offer;

/**
 * @ClassName: JO17
 * @Description:打印从1到最大的n位数
 * @Author: lhp
 * @Date: 2020/5/20 15:23
 * @Version: V1.0
 **/
public class JO17 {
    public int[] printNumbers(int n) {
        int nums = (int)Math.pow(10,n);
        int[] res = new int[nums-1];
        for (int i = 0; i < nums-1; i++) {
            res[i] = i+1;
        }
        return res;
    }
}
