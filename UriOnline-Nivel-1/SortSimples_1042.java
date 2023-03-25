package urionline;

import java.util.Scanner;

public class SortSimples_1042 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();

		if (a < b && a < c) {
			System.out.println(a);
			if (b < c) {
				System.out.println(b);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(b);
			}
		}else if (b < c) {
			System.out.println(b);

			if (a < c) {
				System.out.println(a);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(a);
			}
		}else {
			System.out.println(c);
			if(a < b) {
				System.out.println(a);
				System.out.println(b);
			}else {
				System.out.println(b);
				System.out.println(a);
			}
		}
		

		System.out.println("");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
/*
 * Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os
 * valores em ordem crescente, uma linha em branco e em seguida, os valores na
 * sequência como foram lidos.
 * 
 * Entrada A entrada contem três números inteiros.
 * 
 * Saída Imprima a saída conforme foi especificado.
 * 
 * Exemplo de Entrada Exemplo de Saída 7 21 -14
 * 
 * -14 7 21
 * 
 * 7 21 -14
 * 
 * -14 21 7
 * 
 * -14 7 21
 * 
 * -14 21 7
 */
