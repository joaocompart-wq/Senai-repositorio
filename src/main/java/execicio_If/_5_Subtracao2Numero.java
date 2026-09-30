package execicio_If;

import java.util.Scanner;

public class _5_Subtracao2Numero {
    public static void main(String[] args) {
        int num1, num2, subtrair;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        num2 = sc.nextInt();
        sc.close();
        subtrair = num1 - num2;
        System.out.printf("O resultado da subtracã e: %d%n", subtrair);

    }
}
