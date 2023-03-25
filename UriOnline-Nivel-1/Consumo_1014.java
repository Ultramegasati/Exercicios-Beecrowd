package urionline;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Consumo_1014 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double km = teclado.nextDouble();
		double litro = teclado.nextDouble();
		double total = km / litro;
		DecimalFormat DF = new DecimalFormat("0.###");
		String S = DF.format(total);
		
		
		System.out.printf(S + " km/l%n");
	}

}


/*Calcule o consumo m�dio de um autom�vel sendo fornecidos 
 * a dist�ncia total percorrida (em Km) e o total de
 *  combust�vel gasto (em litros).
 

Entrada
O arquivo de entrada cont�m dois valores: um valor inteiro X
representando a dist�ncia total percorrida (em Km), 
e um valor real Y representando o total de combust�vel gasto, 
com um d�gito ap�s o ponto decimal.

Sa�da
Apresente o valor que representa o consumo m�dio do 
autom�vel com 3 casas ap�s a v�rgula, seguido da mensagem "km/l".

Exemplo de Entrada	Exemplo de Sa�da
500
35.0

14.286 km/l

2254
124.4

18.119 km/l

4554
464.6

9.802 km/l
*/