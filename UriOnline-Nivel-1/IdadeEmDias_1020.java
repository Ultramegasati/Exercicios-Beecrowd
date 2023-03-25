package urionline;
import java.util.Scanner;

public class IdadeEmDias_1020 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int entrada = teclado.nextInt(); 
		int anos = entrada / 365;
		entrada -= anos * 365; 
		int meses = entrada / 30;
		entrada -= meses * 30;
		int dias = entrada;
		System.out.print(anos + " ano(s)\n");
		System.out.print(meses + " mes(es)\n");
		System.out.print(dias + " dia(s)\n");
		
		
	}
}

/*
 * Scanner leitor = new Scanner(System.in);
        int duracaoSegundos = leitor.nextInt();
        int horas = duracaoSegundos / 3600;
        duracaoSegundos -= horas * 3600;
        int minutos = duracaoSegundos / 60;
        duracaoSegundos -= minutos * 60;
        int segundos = duracaoSegundos;
 */
/*Leia um valor inteiro correspondente à idade de uma pessoa 
 * em dias e informe-a em anos, meses e dias
 

Obs.: apenas para facilitar o cálculo, considere todo 
ano com 365 dias e todo mês com 30 dias. Nos casos de teste
nunca haverá uma situação que permite 12 meses e alguns dias,
como 360, 363 ou 364. Este é apenas um exercício com objetivo
de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.

Exemplo de Entrada	Exemplo de Saída
400

1 ano(s)
1 mes(es)
5 dia(s)

800

2 ano(s)
2 mes(es)
10 dia(s)

30

0 ano(s)
1 mes(es)
0 dia(s)
*/