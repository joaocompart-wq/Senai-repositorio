package execicio_If;

import java.util.Scanner;

public class _1_Soma4Divide5 {
    public static void main(String[] args) {
        int num1,loop,divisor;
        int calculo;
        loop = 1;
        num1 = 0;
        divisor = 0;
        calculo = 0;
        Scanner sc =  new Scanner(System.in);
        // Esse while e usado para somar os 4 primiros numeros e salvar o 5 numero
       while (loop <= 5) {
           System.out.print("""
                Digite 5 valores para somar 4
                e dividir pelo 5 valor
                Digite seu valor aqui:
                """);
           int ent = sc.nextInt();
           if (loop <= 4) {
               num1=num1+ent;
           } else {
               divisor = ent ;
           }
           loop++;
       }

        sc.close();
       // esse calculo e usado para calcular a divisao do 4 primeiro pelo 5 numero
        calculo = (num1 / divisor);

        System.out.printf("""
                A soma do 4 primeiros numero e
                :%d
                o resutado da divisao do 4 somados pelo 5 
                :%d
                Calculo exemplo:
               (%d÷%d=%d)
                
                """,num1,calculo,num1,divisor,calculo);



    }
}
