package exemplos;

import javax.swing.*;

public class TelefoniaProbleme {
    public static void main(String[] args) {
        double planoBase , minTelefone ;
        planoBase = 50.0;
        minTelefone = 100.0;

        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        String texto ="";
        texto = JOptionPane.showInputDialog(frame,"Digite os minutos de uso do telefone");
        int tempoTele =Integer.parseInt(texto);
        String saida = "";
        double  pagar = 0;
        double r1 = tempoTele - minTelefone;
        if ((minTelefone - tempoTele) >= 0) {
            saida = "Voce paga o valor base de \n R$:";
            pagar = planoBase;
        } else if ((minTelefone - tempoTele) < 0) {
            saida = "voce utrapaso o limite do plano basico \n R$:";
            // trasforma o numero negativo em positivo
            // usa ! pode fazera troca de um numero negativo para positivo
            double positivo = (r1*2)-r1;
            pagar = (positivo*2)+planoBase;        }
        javax.swing.JOptionPane.showMessageDialog(frame,
                ""+saida+pagar,
                    "Resultado do execicio",
                JOptionPane.QUESTION_MESSAGE);
        System.exit(1);

    }
}
