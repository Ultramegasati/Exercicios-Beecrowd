/*Fa�a um programa que leia tr�s valores e apresente o
 *  maior dos tr�s valores lidos seguido da mensagem �eh o maior�.
 *   Utilize a f�rmula:



Obs.: a f�rmula apenas calcula o maior entre os dois primeiros 
(a e b). Um segundo passo, portanto � necess�rio para 
chegar no resultado esperado.

Entrada
O arquivo de entrada cont�m tr�s valores inteiros.

Sa�da
Imprima o maior dos tr�s valores seguido por um espa�o 
e a mensagem "eh o maior".

Exemplos de Entrada	Exemplos de Sa�da
7 14 106

106 eh o maior

217 14 6

217 eh o maior
*/
package urionline;
import java.util.Scanner;

public class OMaior_1013 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		int C = teclado.nextInt();
		
		int maiorAB = (A + B + Math.abs(A - B))/2;
		int maiorBC = (maiorAB + C + Math.abs(maiorAB - C))/2;
		System.out.printf(maiorBC + " eh o maior\n");
	}

}
