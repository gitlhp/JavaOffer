package 剑指Offer.easy;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: JO57_2
 * @Description:和为s的连续正数序列
 * @Author: lhp
 * @Date: 2020/5/28 16:35
 * @Version: V1.0
 **/
public class JO57_2 {

    public int[][] findContinuousSequence(int target) {
        int i = 1;//滑动窗口的左边界 自然数从1开始
        int j = 1;//滑动窗口的右边界
        int sum = 0;//滑动窗口的数字的和
        List<int[]> res = new ArrayList<>();
        //5/6必须满足i<=target/2
        while (i <= target / 2) {
            if (sum < target) {
                sum += j;
                j++;
            } else if (sum > target) {
                sum -= i;
                i--;
            } else {
                //记录结果
                int[] arr = new int[j - i];
                for (int k = i; k < j; k++) {
                    arr[k - i] = k;
                }
                res.add(arr);
                //左边界向右移动 右边界不用动  因为以当前i为左边界的数列再加一个数 只会更大   所以是左边界向右移动
                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
