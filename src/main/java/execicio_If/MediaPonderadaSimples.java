package execicio_If;

import javax.swing.*;

public class MediaPonderadaSimples {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        int nota1 = 0;
        int nota2 = 0;
        int loop = 0;
        while (loop <= 2) {
            loop++;
            if (loop <= 1) {
                String nota1T = javax.swing.JOptionPane.showInputDialog("Digite um nota");
                nota1 = Integer.parseInt(nota1T);
            }else if (loop <= 2) {
                String nota2T = javax.swing.JOptionPane.showInputDialog("Digite outra nota");
                nota2 = Integer.parseInt(nota2T);
            }
        }
        int peso1 = 2;
        int peso2 = 3;
        int calculo1 = nota1*peso1;
        int calculo2 = nota2*peso2;
        int media = (calculo1+calculo2)/(peso1+peso2);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Nota 1 :"+nota1+"\n"+"nota 2 :"+nota2+"\n"+"A media e de:"+media,
                "resultado",
                JOptionPane.QUESTION_MESSAGE);
    }
}
