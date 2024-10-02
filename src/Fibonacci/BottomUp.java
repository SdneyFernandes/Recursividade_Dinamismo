package Fibonacci;


/**
 * @author fsdney
 */

public class BottomUp {
    
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int numero = 10;
        System.out.println("Fibonacci de " + numero + " é: " + fibonacci(numero));
    }
}
