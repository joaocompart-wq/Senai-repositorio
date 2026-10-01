package execicio_If;

import javax.swing.*;
import java.util.Scanner;

public class _6_ElevadoAoQuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para ser elevado ao quadrado");
         double numero = sc.nextDouble();
       double calculo = Math.pow(numero,2);
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Resultado"+calculo,
                "Resultado do execicio 6" ,
                JOptionPane.QUESTION_MESSAGE);
    }
}
