package urionline;

import java.util.Scanner;

/*
Leia quatro valores inteiros A, B, C e D.
A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula:
 DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras
maiúsculas, conforme exemplo abaixo, com um espaço
em branco antes e depois da igualdade.
 */
public class Diferenca_1007 {
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();
        int diferenca = (A * B - C *D);
        System.out.print("Diferença " + diferenca);
    }
}
/*
Exemplos de Entrada	Exemplos de Saída
5
6
7
8

DIFERENCA = -26

0
0
7
8

DIFERENCA = -56

5
6
-7
8

DIFERENCA = 86
 */
