package listaExercicios;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o salário bruto: ");
		float salarioBruto = entrada.nextFloat();
		System.out.print("Digite o adicional noturno: ");
		float adicionalNoturno = entrada.nextFloat();
		System.out.print("Digite as horas extras: ");
		float horasExtras = entrada.nextFloat();
		System.out.print("Digite o valor de descontos: ");
		float descontos = entrada.nextFloat();
		
		float salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras*5)) - descontos;
		System.out.printf("O salário líquido é: %.2f", salarioLiquido);
		entrada.close();

	}

}
