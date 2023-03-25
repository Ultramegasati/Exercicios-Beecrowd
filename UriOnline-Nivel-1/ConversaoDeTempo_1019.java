package urionline;
import java.util.Scanner;

public class ConversaoDeTempo_1019 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int total = teclado.nextInt();
		int horas = total / 3600;
		int minutos = (total - (horas * 3600)) / 60;
		int segundos = total % 60;
		
		System.out.println(horas + " : " + minutos + " : " + segundos);
		
	}
	
}
/*Leia um valor inteiro, que é o tempo de duração em 
 * segundos de um determinado evento em uma fábrica, e 
 * informe-o expresso no formato horas:minutos:segundos.
 

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), 
convertido para horas:minutos:segundos, conforme exemplo fornecido.

Exemplo de Entrada	Exemplo de Saída
556

0:9:16

1

0:0:1

140153

38:55:53
Scanner leitor = new Scanner(System.in);
        int duracaoSegundos = leitor.nextInt();
        int horas = duracaoSegundos / 3600;
        duracaoSegundos -= horas * 3600;
        int minutos = duracaoSegundos / 60;
        duracaoSegundos -= minutos * 60;
        int segundos = duracaoSegundos;
        System.out.println(horas + ":" + minutos + ":" + segundos);		
    
*/