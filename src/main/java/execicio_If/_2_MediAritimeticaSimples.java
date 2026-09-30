package execicio_If;

import java.util.Scanner;

public class _2_MediAritimeticaSimples {
    public static void main(String[] args) {
        int vezes,loop1,n;
        double soma,ent,media;
        //inicializacao das variavel
        ///por precaução
        soma = 0;
        ent=0;
        loop1=0;
        vezes=0;
        media=0;
                Scanner cs = new Scanner (System.in);
        System.out.println("Digite um quatidade de notas ");
        vezes = cs.nextInt();
        n = vezes;
        // Esse laco for e para somar e contar o numero de notadas
        for (int loop = 1; loop <= vezes; loop++) {
            System.out.println("digite o valor da nota:");
            System.out.println("numero de notas para receber um valor :"+(n--));
            ent = cs.nextDouble();
            soma = soma+ent;
            loop1++;
        }
        media = soma/loop1;
        System.out.printf("""
                A media das %d notas e de: %.1f
                Valor Somado:%.2f
                Quatidade notas: %d
                """,vezes,media,soma,vezes);


    }
}
