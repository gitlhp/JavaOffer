package 剑指Offer.easy;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @ClassName: JO53_2
 * @Description:0～n-1 中缺失的数字 二分查找
 * @Author: lhp
 * @Date: 2020/5/28 9:55
 * @Version: V1.0
 **/
public class JO53_2 {
    public int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] == m) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        JO53_2 jo53_2 = new JO53_2();
        int[] arr = {0,1,2,3,4,5,7,8,9};
        System.out.println(jo53_2.missingNumber(arr));
    }
}
