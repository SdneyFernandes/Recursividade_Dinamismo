package Fibonacci;


/**
 * @author fsdney
 */

public class TopDown {
    static int[] memo;

   
    public static int fibonacci(int n) {
        if (memo[n] != -1) {
            return memo[n];
        }
        
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        int numero = 10;
        
        memo = new int[numero + 1];
        for (int i = 0; i <= numero; i++) {
            memo[i] = -1;
        }
        System.out.println("Fibonacci de " + numero + " é: " + fibonacci(numero));
    }
}
