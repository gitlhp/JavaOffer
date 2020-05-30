package 剑指Offer.easy;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.nio.channels.Pipe;

/**
 * @ClassName: JO59_1
 * @Description:滑动窗口的最大值
 * @Author: lhp
 * @Date: 2020/5/30 21:03
 * @Version: V1.0
 **/
public class JO59_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums==null||nums.length==0){
            return new int[0];
        }
        int[] res = new int[nums.length - k+1];
        for (int i = 0, j = k; j <= nums.length; i++, j++) {
            res[i] = getMax(nums,i,j);
        }
        return res;
    }

    private int getMax(int[] arr, int l, int r) {
        if (arr.length==0){
            return 0;
        }
        int max = arr[l];
        for (int i = l; i < r; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        JO59_1 jo59_1=new JO59_1();
        int[] nums = {};
        int k =0;
        int[] res = jo59_1.maxSlidingWindow(nums,k);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
