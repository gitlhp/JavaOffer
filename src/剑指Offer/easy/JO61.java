package 剑指Offer.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: JO61
 * @Description:扑克牌中的额顺子
 * @Author: lhp
 * @Date: 2020/6/1 11:39
 * @Version: V1.0
 **/
public class JO61 {
    //set+数学
    public boolean isStraight(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0, min = 14;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            max = nums[i] > max ? nums[i] : max;
            min = nums[i] < min ? nums[i] : min;
            if (set.contains(nums[i])) {
                return false;//重复牌
            }
            set.add(nums[i]);
        }
        return max - min < 5;
    }

    //排序
    public boolean isStraight1(int[] nums) {
        int n = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                n++;
                continue;
            } else if (nums[i] == nums[i + 1]) {
                return false;
            }
        }
        return nums[4] - nums[n] > 5;
    }

}
