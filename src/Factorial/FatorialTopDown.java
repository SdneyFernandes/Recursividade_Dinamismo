package Factorial;


/**
 * @author fsdney
 */

public class FatorialTopDown {

	static int[] memo;
	
	public static int fatorial(int n) {
		if (memo[n] != -1) {
			return memo[n];
		}
		
		if (n == 0) {
			return 1;
		}
		memo[n] = n * fatorial(n - 1);
		return memo[n];
	}
	
	public static void main(String[] args) {
		int numero = 5;
		
		memo = new int[numero + 1];
		for (int i = 0; i <= numero; i++) {
			memo[i] = -1;
		}
		
		int resultado = fatorial(numero);
		System.out.println("O fatorial de " + numero + " é: " + resultado);
	}
}
