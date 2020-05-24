package 剑指Offer;

/**
 * @ClassName: JO29
 * @Description:顺时针打印矩阵
 * @Author: lhp
 * @Date: 2020/5/23 10:34
 * @Version: V1.0
 **/
public class JO29 {
    public int[] spiralOrder(int[][] matrix) {
        //边界。。
        if (matrix.length == 0 || matrix == null) {
            return new int[0];
        }
        //记录行数
        int r1 = 0, r2 = matrix.length - 1;
        //记录列数
        int c1 = 0, c2 = matrix[0].length-1;
        //记录结果下标
        int x = 0;
        int[] res = new int[(r2 + 1) * (c2 + 1)];
        while (r1 <= r2 && c1 <= c2) {
            //从左往右读到头
            for (int i = c1; i <= c2; i++) {
                res[x++] = matrix[r1][i];
            }
            //从当前读的下一行开始从上向下读到底部
            for (int i = r1 + 1; i <= r2; i++) {
                res[x++] = matrix[i][c2];
            }
            //避免重复判断,比如中间还剩一个的情形，没必要再往下走了
            if (r1 < r2 && c1 < c2) {
                //从当前读的左边一行读到正数第二列
                for (int i = c2 - 1; i > r1; i--) {
                    res[x++] = matrix[r2][i];
                }
                //从当前读的行最左边起向上读到第二行
                for (int i = r2; i > r1; i--) {
                    res[x++] = matrix[i][c1];
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return res;
    }

}
