package urionline;
import java.util.Scanner;

public class FormulaDeBhaskara_1036 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double A = teclado.nextDouble();
		double B = teclado.nextDouble();
		double C = teclado.nextDouble();
		
		
		
		if(B * B - 4 * A * C < 0 || A == 0) {
			System.out.println("Impossivel calcular");
			return;
		} 
		
		double delta = Math.sqrt(B * B - 4 * A * C);
		double bhaskara = (- B + delta) / (2 * A);
		double bhaskara1 = (- B - delta) / (2 * A);
		
		System.out.printf("R1 = %.5f\n", bhaskara);
		System.out.printf("R2 = %.5f\n", bhaskara1);
				
		
	}
	
	
	
}
/*Leia 3 valores de ponto flutuante e efetue o c�lculo das
 *  ra�zes da equa��o de Bhaskara. Se n�o for poss�vel calcular 
 *  as ra�zes, mostre a mensagem correspondente 
 *  �Impossivel calcular�, caso haja uma divis�o por 
 *  0 ou raiz de numero negativo.

Entrada
Leia tr�s valores de ponto flutuante (double) A, B e C.

Sa�da
Se n�o houver possibilidade de calcular as ra�zes, 
apresente a mensagem "Impossivel calcular". Caso contr�rio, 
imprima o resultado das ra�zes com 5 d�gitos ap�s o ponto,
com uma mensagem correspondente conforme exemplo abaixo. 
Imprima sempre o final de linha ap�s cada mensagem.

Exemplos de Entrada	Exemplos de Sa�da
10.0 20.1 5.1

R1 = -0.29788
R2 = -1.71212

0.0 20.0 5.0

Impossivel calcular

10.3 203.0 5.0

R1 = -0.02466
R2 = -19.68408

10.0 3.0 5.0

Impossivel calcular
*/
