package Factorial;


/**
 * @author fsdney
 */

public class FatorialBottomUp {
    
    public static int fatorial(int n) {
       
        int[] dp = new int[n + 1];
        
       
        dp[0] = 1;
        
        
        for (int i = 1; i <= n; i++) {
            dp[i] = i * dp[i - 1]; 
        }
        
        
        return dp[n];
    }

    public static void main(String[] args) {
        int numero = 5; 
        int resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}

