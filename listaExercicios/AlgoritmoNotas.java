package listaExercicios;
import java.util.Scanner;

public abstract class AlgoritmoNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a nota 1: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Digite a nota 2: ");
		float nota2 = entrada.nextFloat();
		System.out.print("Digite nota 3: ");
		float nota3 = entrada.nextFloat();
		System.out.print("Digite nota 4: ");
		float nota4 = entrada.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.printf("A média final é: %.2f", media);
		entrada.close();
	}

}
