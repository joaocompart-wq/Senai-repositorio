package listaExecicio_3;



import javax.swing.*;

public class Execicio_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        double salario = 0;
        double imposto = 0.1;

        String texto = JOptionPane.showInputDialog(frame,"digite seu salario");
        salario = Integer.parseInt(texto);

        double v1 = salario*imposto;

        javax.swing.JOptionPane.showMessageDialog(frame,
                "porcetagem de imposto"+

                JOptionPane.QUESTION_MESSAGE);
    }
}
