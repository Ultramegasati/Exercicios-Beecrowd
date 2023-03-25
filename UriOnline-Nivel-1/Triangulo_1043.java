package urionline;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Triangulo_1043 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat decimal  = new DecimalFormat("0.0");
		
		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();
		
		if(a < b+c && b < a+c && c < b+a) {
			double perimetro = a + b + c;
			System.out.println("Perimetro = " + decimal.format(perimetro));
		}else {
			double trapezio = ((a + b) * c) / 2;
			System.out.println("Area = " + decimal.format(trapezio));
		}
		
		
		
	}
	
	
}
/*Leia 3 valores reais (A, B e C) e verifique se 
 eles formam ou n�o um tri�ngulo. Em caso positivo, 
 calcule o per�metro do tri�ngulo e apresente a mensagem:
 


Perimetro = XX.X


Em caso negativo, calcule a �rea do trap�zio que tem A e B 
como base e C como altura, mostrando a mensagem


Area = XX.X

Entrada
A entrada cont�m tr�s valores reais.

Sa�da
O resultado deve ser apresentado com uma casa decimal.

Exemplo de Entrada	Exemplo de Sa�da
6.0 4.0 2.0

Area = 10.0

6.0 4.0 2.1

Perimetro = 12.1
*/