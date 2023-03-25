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
 eles formam ou não um triângulo. Em caso positivo, 
 calcule o perímetro do triângulo e apresente a mensagem:
 


Perimetro = XX.X


Em caso negativo, calcule a área do trapézio que tem A e B 
como base e C como altura, mostrando a mensagem


Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.

Exemplo de Entrada	Exemplo de Saída
6.0 4.0 2.0

Area = 10.0

6.0 4.0 2.1

Perimetro = 12.1
*/