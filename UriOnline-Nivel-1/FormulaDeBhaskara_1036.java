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
/*Leia 3 valores de ponto flutuante e efetue o cálculo das
 *  raízes da equação de Bhaskara. Se não for possível calcular 
 *  as raízes, mostre a mensagem correspondente 
 *  “Impossivel calcular”, caso haja uma divisão por 
 *  0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, 
apresente a mensagem "Impossivel calcular". Caso contrário, 
imprima o resultado das raízes com 5 dígitos após o ponto,
com uma mensagem correspondente conforme exemplo abaixo. 
Imprima sempre o final de linha após cada mensagem.

Exemplos de Entrada	Exemplos de Saída
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
