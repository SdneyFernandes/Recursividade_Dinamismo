package Fibonacci;


/**
 * @author fsdney
 */

public class Recursivo {
    
    public static int fibonacci(int n) {
        
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int numero = 10;
        System.out.println("Fibonacci de " + numero + " é: " + fibonacci(numero));
    }
}

