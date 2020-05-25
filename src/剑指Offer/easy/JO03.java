package 剑指Offer.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: JO03
 * @Description:数组中重复的数字
 * @Author: lhp
 * @Date: 2020/5/17 16:00
 * @Version: V1.0
 **/
public class JO03 {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0, len = nums.length; i < len; i++) {
            while (i != nums[i]) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                swap(nums, i, nums[i]);
                //0 1 2 3 4
                //0 1 4 3 4
            }
        }
        return -1;
    }
    public int findRepeatNumber1(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if (map.containsKey(nums[i])){
                return nums[i];
            }else {
                map.put(nums[i],1);
            }
        }
        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
