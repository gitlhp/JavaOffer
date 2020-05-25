package 剑指Offer.easy;

/**
 * @ClassName: JO21
 * @Description:调整数组顺序使奇数位于偶数前面-双指针
 * @Author: lhp
 * @Date: 2020/5/21 8:00
 * @Version: V1.0
 **/
public class JO21 {
    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            while (i < j && (nums[i] & 1) == 1) {
                i++;
            }
            while (i < j && (nums[j] & 1) == 0) {
                j--;
            }
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}
