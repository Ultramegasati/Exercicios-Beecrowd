package urionline;
import java.util.Scanner;

public class Intervalo_1037 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numero = teclado.nextDouble();
		
		if(numero >= 0 && numero <= 25) {
			System.out.println("Intervalo [0,25]");			
		}else if(numero > 25 && numero <= 50) {
			System.out.println("Intervalo (25,50]");			
		}else if(numero > 50 && numero <= 75) {
			System.out.println("Intervalo (50,75]");
		}else if(numero > 75 && numero <=100) {
			System.out.println("Intervalo (75,100]");
		}else {
			System.out.println("Fora de intervalo");
		}
			
		
		
	}
	
	
	
	
}
/*Voc� deve fazer um programa que leia um valor qualquer
e apresente uma mensagem dizendo em qual dos seguintes 
intervalos ([0,25], (25,50], (50,75], (75,100]) 
este valor se encontra. Obviamente se o valor n�o estiver 
em nenhum destes intervalos, dever� ser impressa a mensagem 
�Fora de intervalo�.

O s�mbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 at� o 
valor 50.0000000

Entrada
O arquivo de entrada cont�m um n�mero com ponto flutuante qualquer.

Sa�da
A sa�da deve ser uma mensagem conforme exemplo abaixo.

Exemplo de Entrada	Exemplo de Sa�da
25.01

Intervalo (25,50]

25.00

Intervalo [0,25]

100.00

Intervalo (75,100]

-25.02

Fora de intervalo
*/
