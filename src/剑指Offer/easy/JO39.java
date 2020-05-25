package 剑指Offer.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: JO39
 * @Description:数组中出现次数超过一半的数字
 * @Author: lhp
 * @Date: 2020/5/24 11:41
 * @Version: V1.0
 **/
public class JO39 {
    //哈希表统计法
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) > nums.length / 2) {
                return key;
            }
        }
        return -1;
    }

    //摩尔投票法 双100% O(N) O(1)
    public int majorityElement1(int[] nums) {
        int x = 0, votes = 0;
        for (int num : nums) {
            if (votes == 0) {
                x = num;
                votes += 1;
                continue;
            }
            votes += (num == x ? 1 : -1);
        }
        return x;
    }
}
