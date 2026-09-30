package execicio_If;

import java.util.Scanner;

/*
-Faça um programa que leia dois números inteiros, realize a soma de deste e exiba o resultado final.
 */
public class _4_SomaDeDoisNumeros {
    public static void main(String[] args) {
        int num,ent,limite,loop;
        num = 0;
        ent = 0;
        limite = 0;
        loop = 1;
        Scanner sc = new Scanner(System.in);
        System.out.printf("digite um limite de numero a serem somado %n");
        limite = sc.nextInt();
        while (loop <= limite) {
            loop++;
            System.out.printf("digite %d numeros %n",limite);
            ent = sc.nextInt();
            num=num+ent;
        }
        sc.close();
        System.out.printf("""
                total de vezes que os numero forma somados: %d
                total da soma: %d
                """,limite,num);
    }
}
