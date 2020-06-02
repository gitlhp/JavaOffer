package 剑指Offer.easy;

/**
 * @ClassName: JO66
 * @Description:构建乘积数组
 * @Author: lhp
 * @Date: 2020/6/2 10:44
 * @Version: V1.0
 **/
public class JO66 {
    public int[] constructArr(int[] a) {
        if (a.length == 0) {
            return new int[0];
        }
        int[] b = new int[a.length];
        b[0] = 1;
        int temp = 1;
        //计算下三角形
        for (int i = 1; i < a.length; i++) {
            b[i] = b[i - 1] * a[i - 1];
        }
        //下三角形 坐标从a.length-2开始 上一次下三角形已经解决b[a.length-1];
        for (int i = a.length - 2; i >= 0; i--) {
            temp *= a[i + 1];
            b[i]*=temp;
        }
        return b;
    }
}
