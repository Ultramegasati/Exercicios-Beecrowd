package urionline;

import java.util.Scanner;

public class Lanche_1038 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int codigo = teclado.nextInt();
		int quantidade = teclado.nextInt();
		// double codigo = (double)entradacodigo;
		double cachorroQuente = 4.00;
		double xSalada = 4.50;
		double xBacon = 5.00;
		double torradaSimples = 2.00;
		double refrigerante = 1.5;
		if (codigo == 1) {
			double total = cachorroQuente * quantidade;
			System.out.printf("Total: R$ %.2f\n", total);
		} else if (codigo == 2) {
			double total = xSalada * quantidade;
			System.out.printf("Total: R$ %.2f\n", total);
		} else if (codigo == 3) {
			double total = xBacon * quantidade;
			System.out.printf("Total: R$ %.2f\n", total);
		} else if (codigo == 4) {
			double total = torradaSimples * quantidade;
			System.out.printf("Total: R$ %.2f\n", total);
		} else if (codigo == 5) {
			double total = refrigerante * quantidade;
			System.out.printf("Total: R$ %.2f\n", total);

		}
	}

}
/*
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 * 
 * 
 * 
 * 
 * Entrada O arquivo de entrada contém dois valores inteiros correspondentes ao
 * código e à quantidade de um item conforme tabela acima.
 * 
 * Saída O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo
 * valor a ser pago, com 2 casas após o ponto decimal.
 * 
 * Exemplo de Entrada Exemplo de Saída 3 2
 * 
 * Total: R$ 10.00
 * 
 * 4 3
 * 
 * Total: R$ 6.00
 * 
 * 2 3
 * 
 * Total: R$ 13.50
 */
