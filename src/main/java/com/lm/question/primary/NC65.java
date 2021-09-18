package com.lm.question.primary;

/**
 * 斐波那契数列
 */
public class NC65 {
    /**
     * 数组实现
     * @param n
     * @return
     */
    public int Fibonacci(int n) {
        int[] ans = new int[40];
        ans[0] = 0;
        ans[1] = 1;
        for (int i = 0; i < n i++) {
            ans[i] = ans[i-1] + ans[i-2];
        }
        return ans[n];
    }

    /**
     * 递归实现
     * @param n
     * @return
     */
    public int Fibonacci1(int n) {
        if(n<=1){
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
