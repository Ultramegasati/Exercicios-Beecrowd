package urionline;
import java.util.Scanner;

public class GastoCombustivel_1017 {
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		int tempo = teclado.nextInt();
		int velocidade = teclado.nextInt();
		double km = tempo * velocidade;
		double total = km /12;
		
	System.out.printf("%.3f\n", total);	
	}
}
/*Joaozinho quer calcular e mostrar a quantidade de 
 * litros de combust�vel gastos em uma viagem, ao utilizar um 
 * autom�vel que faz 12 KM/L. Para isso, ele gostaria que voc� 
 * o auxiliasse atrav�s de um simples programa. Para efetuar o 
 * c�lculo, deve-se fornecer o tempo gasto na viagem (em horas) 
 * e a velocidade m�dia durante a mesma (em km/h). Assim, pode-se 
 * obter dist�ncia percorrida e, em seguida, calcular quantos
 *  litros seriam necess�rios. Mostre o valor com 3 casas 
 *  decimais ap�s o ponto.


Entrada
O arquivo de entrada cont�m dois inteiros. 
O primeiro � o tempo gasto na viagem (em horas) e o segundo 
� a velocidade m�dia durante a mesma (em km/h).

Sa�da
Imprima a quantidade de litros necess�ria para realizar a 
viagem, com tr�s d�gitos ap�s o ponto decimal

Exemplo de Entrada	Exemplo de Sa�da
10
85

70.833

2
92

15.333

22
67

122.833
*/