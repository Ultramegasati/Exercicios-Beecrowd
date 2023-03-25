package urionline;
/*
Escreva um programa que leia três valores com 
ponto flutuante de dupla precisão: A, B e C.
Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por
base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e
C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com
um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados.
Cada linha corresponde a uma das áreas descritas
acima, sempre com mensagem correspondente e um
espaço entre os dois pontos e o valor. O valor
calculado deve ser apresentado com 3 dígitos após
o ponto decimal.
 */

import java.util.Scanner;


public class Area_1012 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();
        
        double triangulo = (A * C)/2;
        System.out.printf("A �rea do tri�ngulo retangulo � : %.3f\n", triangulo);
        
        double circulo = (C * C) * 3.14159;
        System.out.printf("A �rea do c�rculo � : %.3f\n", circulo);
        
        double trapezio = ((A + B) /2) * C;
        System.out.printf("a �rea do trap�zio � : %.3f\n", trapezio);
        
        double quadrado = (B * B);
        System.out.printf("a �rea do quadrado � : %.3f\n" , quadrado);
        
        double retangulo = (A * B);
        System.out.printf("a �rea do ret�ngulo � : %.3f\n" , retangulo);
      
    
    
    }
}
/*
Exemplos de Entrada	Exemplos de Saída
3.0 4.0 5.2

TRIANGULO: 7.800
CIRCULO: 84.949
TRAPEZIO: 18.200
QUADRADO: 16.000
RETANGULO: 12.000

12.7 10.4 15.2

TRIANGULO: 96.520
CIRCULO: 725.833
TRAPEZIO: 175.560
QUADRADO: 108.160
RETANGULO: 132.080
 */
