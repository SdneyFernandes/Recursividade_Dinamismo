package Factorial;


/**
 * @author fsdney
 */

public class FatorialRecursivo {

	public static int fatorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n * fatorial(n - 1);
	}
	
	public static void main(String[] args) {
		int numero = 3;
		int resultado = fatorial(numero);
		System.out.println("O factorial de " + numero + " é: " + resultado);
	}
}
