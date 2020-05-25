package 剑指Offer.easy;

/**
 * @ClassName: JO04
 * @Description:二维数组中的查找
 * @Author: lhp
 * @Date: 2020/5/17 22:53
 * @Version: V1.0
 **/
public class JO04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i = rows-1, j = 0;
        while (i >= 0 && j < cols) {
            if (matrix[i][j] == target) {
                return true;
            }
            //减少循环次数
            if (matrix[i][j] > target) {
                --i;
            } else {
                ++j;
            }
        }
        return false;
    }
}
