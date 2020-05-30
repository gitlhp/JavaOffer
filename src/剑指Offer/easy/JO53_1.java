package 剑指Offer.easy;

/**
 * @ClassName: JO53_1
 * @Description: 在排序数组中查找数字 I统计一个数字在排序数组中出现的次数。
 * @Author: lhp
 * @Date: 2020/5/25 15:01
 * @Version: V1.0
 **/
public class JO53_1 {
    //二分查找
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] <= target) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        int right = i;

        i = 0;
        j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            //左边界
            if (nums[m] < target) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        int left = j;

        return right - left - 1;
    }
}
