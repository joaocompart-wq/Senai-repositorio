package execicio_If;

import java.util.Scanner;

/*
Um programa que calcule a média aritmética simples, entre 4 notas
 */
public class _3_Divisao2Nome1 {
    public static void main(String[] args) {
    String nome;
    int divisao,num1,num2;
    divisao=0;
    num1=0;
    num2=0;
    Scanner sc = new Scanner(System.in);
        System.out.println("digite um nome");
        nome = sc.next();
        System.out.println("digite um numero");
        num1 = sc.nextInt();
        System.out.println("digite outro numero");
        num2 = sc.nextInt();

        divisao = num1 / num2;

        System.out.printf("""
                O seu nome e: %s
                Os dois numero digitado são %d e %d
                O resultado da divião:%d
                """,nome,num1,num2,divisao);



    }
}
