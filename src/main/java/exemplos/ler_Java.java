package exemplos;

import java.util.Scanner;

public class ler_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        sc.nextLine = string
        sc.nextInt = numero interio
        sc.nextDouble = numero decimais
        sc.close =
         */
        String y;
        System.out.print("entrada de dados:");
        y = sc.nextLine();
        System.out.println("saida de dados:"+y);
        sc.close();
    }
}
