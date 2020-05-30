package 剑指Offer.easy;

/**
 * @ClassName: JO58_1
 * @Description:反转单词顺序
 * @Author: lhp
 * @Date: 2020/5/30 15:09
 * @Version: V1.0
 **/
public class JO58_1 {
    /**
     * 双指针
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        //去除收尾空格
        s =s.trim();
        int j = s.length()-1,i=j;
        StringBuilder res  = new StringBuilder();
        while (i>=0){
            while (i>=0&&s.charAt(i)!=' '){
                i--;
            }
            res.append(s.substring(i+1,j+1)+' ');
            //跳过单词见空格
            while (i>=0&&s.charAt(i)==' '){
                i--;
            }
            j=i;
        }
        return res.toString().trim();
    }
    /**
     * 库函数
     * @param s
     * @return
     */

}
