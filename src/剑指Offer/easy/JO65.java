package 剑指Offer.easy;

/**
 * @ClassName: JO65
 * @Description：不用加减乘除做加法
 * @Author: lhp
 * @Date: 2020/6/1 14:46
 * @Version: V1.0
 **/
public class JO65 {
    //位运算
    public int add(int a, int b) {
        while (b != 0) {
            int temp = a ^ b;//异或
            b = ((a & b) << 1);
            a = temp;
        }
        return a;
    }
}
