package urionline;
import java.util.Scanner;

public class Distancia_1016 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tempo = teclado.nextInt();
		int xVelocidade = 60;
		int yVelocidade = 90;
		int totalVelocidade = tempo * 2;
		System.out.println(totalVelocidade + " minutos");
		
	}
}
/*Dois carros (X e Y) partem em uma mesma direção.
O carro X sai com velocidade constante de 60 Km/h e 
o carro Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se 
distanciar 30 quilômetros do carro X, ou seja, 
consegue se afastar um quilômetro a cada 2 minutos.

Leia a distância (em Km) e calcule quanto tempo leva 
(em minutos) para o carro Y tomar essa distância do outro carro.

Entrada
O arquivo de entrada contém um número inteiro.

Saída
Imprima o tempo necessário seguido da mensagem "minutos".

Exemplo de Entrada	Exemplo de Saída
30

60 minutos

110

220 minutos

7

14 minutos
 * */
