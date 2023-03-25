package urionline;
import java.util.Scanner;

public class DistanciaEntreDoisPontos_1015 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double X1 = teclado.nextDouble();
		double Y1 = teclado.nextDouble();
		double X2 = teclado.nextDouble();
		double Y2 = teclado.nextDouble();
		
		double distancia = ((X2 - X1)* (X2 - X1)) + ((Y2 - Y1) * (Y2 - Y1));
		double total = Math.sqrt(distancia);
		System.out.printf("%.4f\n", total);
	}
}

/*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia =

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
1.0 7.0
5.0 9.0

4.4721

-2.5 0.4
12.1 7.3

16.1484

2.5 -0.4
-12.2 7.0

16.4575*/
