package urionline;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Media3_1040 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatado = new DecimalFormat("0.0");
		
		double nota1 = teclado.nextDouble();
		double nota2 = teclado.nextDouble();
		double nota3 = teclado.nextDouble();
		double nota4 = teclado.nextDouble();
		
		double media = ((nota1 * 2)+(nota2 * 3)+(nota3 * 4)+
				(nota4 * 1)) /10;
		
		if(media >= 7.0) {
			System.out.println("Media: "+ formatado.format(media));
			System.out.println("Aluno aprovado.");
		}else if(media < 5) {
			System.out.println("Media: " + formatado.format(media));
			System.out.println("Aluno reprovado.");
		}
		if(media >= 5 && media <= 6.9) {
			System.out.println("Media: " + formatado.format(media));
			System.out.println("Aluno em exame.");
			double notaExame = teclado.nextDouble();
			double mediaFinal = (notaExame + media) / 2;
			
			if(mediaFinal >= 5) {
				System.out.println("Nota do exame: " + formatado.format(notaExame));
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: "+ formatado.format(mediaFinal));
			}else {
				System.out.println("Nota do exame: " + formatado.format(notaExame));
				System.out.println("Aluno reprovado.");
				System.out.println("Media final: " + formatado.format(mediaFinal));
			}
		}
		
	}
	
}

/*Leia quatro n�meros (N1, N2, N3, N4),
 cada um deles com uma casa decimal, correspondente �s
 quatro notas de um aluno. Calcule a m�dia com pesos 2, 3, 4 e 1,
 respectivamente, para cada uma destas notas e mostre esta m�dia
 acompanhada pela mensagem "Media: ". Se esta m�dia for maior ou 
 igual a 7.0, imprima a mensagem "Aluno aprovado.". 
 Se a m�dia calculada for inferior a 5.0, imprima a mensagem 
 "Aluno reprovado.". Se a m�dia calculada for um valor 
 entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a 
 mensagem "Aluno em exame.".
 

No caso do aluno estar em exame, leia um valor correspondente 
� nota do exame obtida pelo aluno. Imprima ent�o a mensagem 
"Nota do exame: " acompanhada pela nota digitada. Recalcule a 
m�dia (some a pontua��o do exame com a m�dia anteriormente 
calculada e divida por 2). e imprima a mensagem "Aluno aprovado.
" (caso a m�dia final seja 5.0 ou mais ) ou "Aluno reprovado.", 
(caso a m�dia tenha ficado 4.9 ou menos). Para estes dois casos 
(aprovado ou reprovado ap�s ter pego exame) apresente na �ltima 
linha uma mensagem "Media final: " seguido da m�dia final para 
esse aluno.

Entrada
A entrada cont�m quatro n�meros de ponto flutuante 
correspendentes as notas dos alunos.

Sa�da
Todas as respostas devem ser apresentadas com uma casa decimal.
As mensagens devem ser impressas conforme a descri��o do problema.
N�o esque�a de imprimir o enter ap�s o final de cada linha, 
caso contr�rio obter� "Presentation Error".

Exemplo de Entrada	Exemplo de Sa�da
2.0 4.0 7.5 8.0
6.4

Media: 5.4
Aluno em exame.
Nota do exame: 6.4
Aluno aprovado.
Media final: 5.9

2.0 6.5 4.0 9.0

Media: 4.8
Aluno reprovado.

9.0 4.0 8.5 9.0

Media: 7.3
Aluno aprovado.
*/