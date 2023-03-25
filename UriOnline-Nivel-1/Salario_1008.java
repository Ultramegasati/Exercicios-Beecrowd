package urionline;
/*
Escreva um programa que leia o número de um
funcionário, seu número de horas trabalhadas, o
valor que recebe por hora e calcula o salário desse
funcionário. A seguir, mostre o número e o salário
do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e
1 número com duas casas decimais, representando o
número, quantidade de horas trabalhadas e o valor
que o funcionário recebe por hora trabalhada,
respectivamente.

Saída
Imprima o número e o salário do funcionário,
conforme exemplo fornecido, com um espaço em
branco antes e depois da igualdade. No caso do
salário, também deve haver um espaço em branco após o $.

 */

import java.util.Scanner;

public class Salario_1008 {
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        int horas = entrada.nextInt();
        double quantidade = entrada.nextDouble();
        double salario = (horas * quantidade);
        System.out.printf("NUMBER = %d\n", numero);
        System.out.printf("SALARY = U$ %.2f\n",salario);
    }
}
/*
Exemplos de Entrada	Exemplos de Saída
25
100
5.50

NUMBER = 25
SALARY = U$ 550.00

1
200
20.50

NUMBER = 1
SALARY = U$ 4100.00

6
145
15.55

NUMBER = 6
SALARY = U$ 2254.75
 */
