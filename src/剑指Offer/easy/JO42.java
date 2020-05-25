package 剑指Offer.easy;

/**
 * @ClassName: JO42
 * @Description:连续子数组的最大和-动态规划
 * @Author: lhp
 * @Date: 2020/5/25 11:34
 * @Version: V1.0
 **/
public class JO42 {
    public int maxSubArray(int[] nums) {
        //定义初始值
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}
