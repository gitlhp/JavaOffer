package 剑指Offer;

/**
 * @ClassName: JO12
 * @Description：矩阵中的路径
 * @Author: lhp
 * @Date: 2020/5/19 10:18
 * @Version: V1.0
 **/
public class JO12 {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        //因为可以从矩阵的任意一格开始,需要从任意节点开始进行dfs
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, words, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }


    boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        //边界和终止条件
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) {
            return false;
        }
        //说明前边都已经匹配成功
        if (k == word.length) {
            return true;
        }
        char temp = board[i][j];
        //做标记，防止重复访问
        board[i][j] = '/';
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i, j - 1, k + 1);
        board[i][j] = temp;
        return res;
    }

}
