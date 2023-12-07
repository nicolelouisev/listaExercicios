package listaExercicios;
import java.util.Scanner;

public class AlgoritmoSalario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o salário: ");
		float salario = entrada.nextFloat();
		System.out.print("Digite o abono: ");
		float abono = entrada.nextFloat();
		
		float novoSalario = salario + abono;
		System.out.print("Novo salário é: " + novoSalario);
		entrada.close();
	}
}
