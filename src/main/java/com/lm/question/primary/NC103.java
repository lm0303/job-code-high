package com.lm.question.primary;

/**
 * 字符串反转
 */
public class NC103 {

    /**
     *
     * @param str
     * @return
     * @deprecated 双指针，头尾交换
     */
    public String solve(String str){
        char[] chars = str.toCharArray();
        int left = 0,right = str.length()-1;
        while (left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    /**
     * @deprecated 单指针
     * @param str
     * @return
     */
    public String solve1(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(str.length()-i-1);
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(new NC103().solve("abcd"));
        System.out.println(new NC103().solve1("abcd"));
    }
}
