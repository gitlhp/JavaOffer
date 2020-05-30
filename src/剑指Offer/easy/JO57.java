package 剑指Offer.easy;

import org.omg.CORBA.INITIALIZE;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: JO57
 * @Description:和为s的两个数字
 * @Author: lhp
 * @Date: 2020/5/28 14:34
 * @Version: V1.0
 **/
public class JO57 {
    //hash表
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = nums[i];
                res[1] = target - nums[i];
            } else {
                map.put(nums[i], i);
            }
        }
        return res;
    }

    //双指针
    public int[] twoSum1(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while (i<j){
            int sum = nums[i]+nums[j];
            if (sum>target){
                j--;
            }else if (sum<target){
                i++;
            }else {
                return new int[]{nums[i],nums[j]};
            }
        }
        return new int[0];
    }

}
