package listaExercicios;

import java.util.Scanner;

public class operandoNumeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o número 1: ");
		float n1 = entrada.nextFloat();
		System.out.print("Digite o número 2: ");
		float n2 = entrada.nextFloat();
		System.out.print("Digite o número 3: ");
		float n3 = entrada.nextFloat();
		System.out.print("Digite o número 4: ");
		float n4 = entrada.nextFloat();
		
		float diferencaProduto = (n1 * n2) - (n3 * n4);
		System.out.print("O resultado é: " + diferencaProduto);
		
		entrada.close();
	}

}
