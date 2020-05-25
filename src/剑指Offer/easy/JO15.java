package 剑指Offer.easy;

/**
 * @ClassName: JO15
 * @Description:二进制数中的1的个数
 * @Author: lhp
 * @Date: 2020/5/20 15:03
 * @Version: V1.0
 **/
public class JO15 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n!=0){
            res+=n&1;
            n>>>=1;
        }
        return res;
    }
}
