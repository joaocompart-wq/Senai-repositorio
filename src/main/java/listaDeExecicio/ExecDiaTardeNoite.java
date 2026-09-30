package listaDeExecicio;

import java.util.Locale;
import java.util.Scanner;

public class ExecDiaTardeNoite{
    public static void main(String[] args) {
        double ent;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("digite as horas em 24H");
        System.out.print("que horas sao agora?:");
        ent= sc.nextDouble();
        sc.close();
        if (ent >= 6.00 && ent <= 11.59) {
            System.out.println("bom dia");
        } else if (ent >= 12.0 && ent <= 17.59) {
            System.out.println("boa tarde");
        } else if (ent >= 23.59) {
            ent = 0.0;
        } else if (ent >= 18.0 || ent >= 0.0 && ent <= 5.59) {
            System.out.println("boa noite");}



    }
}
