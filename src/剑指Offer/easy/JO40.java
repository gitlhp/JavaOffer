package 剑指Offer.easy;

/**
 * @ClassName: JO40
 * @Description:最小的K个数
 * @Author: lhp
 * @Date: 2020/5/24 15:43
 * @Version: V1.0
 **/
public class JO40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] res = new int[k];
        if (arr == null || k == 0) {
            return res;
        }
        int len = arr.length;

        if (len < k) {
            return res;
        }
        // 快排思想，mid前面的数小于input[mid]
        int start = 0;
        int end = len-1;
        //返回下次分割的分界线
        int mid = getIndex(arr, 0, len-1);

        // 目标索引,此处不能以k为目标索引，因为k可能等于数组的长度，以k为索引，数组越界
        int targetIdx = k - 1;

        while (mid != targetIdx) {
            // 目标值在mid左侧
            if (mid > targetIdx) {
                end = mid-1;
                // 目标值在mid右侧
            } else {
                start = mid+1;
            }
            mid = getIndex(arr, start, end);
        }

        for (int i=0; i<=targetIdx; i++) {
            res[i] = arr[i];
        }

        return res;
    }

    //快速排序
    public void QuickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) {
            return;
        }
        if (low > high) {
            return;
        }
        int index = getIndex(arr, low, high);
        QuickSort(arr, 0, index - 1);
        QuickSort(arr, index + 1, high);
    }

    //返回每次确定的元素的位置，为下次递归划分边界
    public static int getIndex(int[] arr, int low, int high) {
        //记录基准数据
        int val = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= val) {
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= val) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = val;
        return low;
    }

    public static void main(String[] args) {
        JO40 jo40 = new JO40();
        int[] arr={0,1,1,1,4,5,3,7,7,8,10,2,7,8,0,5,2,16,12,1,19,15,5,18,2,2,22,15,8,22,17,6,22,6,22,26,32,8,10,11,2,26,9,12,9,7,28,33,20,7,2,17,44,3,52,27,2,23,19,56,56,58,36,31,1,19,19,6,65,49,27,63,29,1,69,47,56,61,40,43,10,71,60,66,42,44,10,12,83,69,73,2,65,93,92,47,35,39,13,75};
        int[] res = jo40.getLeastNumbers(arr,75);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
