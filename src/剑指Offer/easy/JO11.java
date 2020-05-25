package 剑指Offer.easy;

/**
 * @ClassName: JO11
 * @Description:旋转数组的最小数字-二分查找
 * @Author: lhp
 * @Date: 2020/5/18 11:04
 * @Version: V1.0
 **/
public class JO11 {
    public int minArray(int[] numbers) {
        int len = numbers.length;
        //边界特殊情况只有一个或。。
        if (len==1||numbers[0]<numbers[len-1]){
            return numbers[0];
        }
        //二分查找
        int left = 0,right = len-1;
        while (right-left>1){
            int mid = left+((right-left)>>1);//右移一位
            if (numbers[left]==numbers[mid]&&numbers[mid]==numbers[right]){
                //也是遍历查找的过程，二分查找降低时间复杂度
                return finMin(numbers,left,right);
            }
            //找右边
            if (numbers[mid]>=numbers[left]){
                left = mid;
            }else if (numbers[mid]<=numbers[right]){
                right = mid;
            }
        }
        return numbers[right];
    }
    public int finMin(int[] numbers,int left,int right){
        int min = numbers[left];
        for (int i = left+1; i <right ; i++) {
            if (min>numbers[i]){
                min = numbers[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        JO11 jo11 = new JO11();
        int[] arr = {2,2,2,2,2,2,1,2,2,2,2,2};
        System.out.println(jo11.minArray(arr));
    }
}
