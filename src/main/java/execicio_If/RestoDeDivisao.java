package execicio_If;

import javax.swing.*;
import java.util.Scanner;

public class RestoDeDivisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero que vai ser divitido");
        int divitido = sc.nextInt();
        System.out.println("digite o numero divisor");
        int divior = sc.nextInt();
        sc.close();
        int resto = (divitido % divior);
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Esse e o resto :"+resto,
                "saida do progarama",
                JOptionPane.QUESTION_MESSAGE);
    }
}
