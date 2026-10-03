package listaExecicio_3;

import javax.swing.*;


public class Execicio_2Ternaria {
    public static void main(String[] args) {
        /*
        Localdate: puxa o horario e data do pc para a aplicacao
         */
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
       String dia,mes,ano;
        dia = JOptionPane.showInputDialog(frame,"insira seu dia de nacimento");
        mes = JOptionPane.showInputDialog(frame,"insira seu Mes de nacimento");
        ano = JOptionPane.showInputDialog(frame,"insira seu ano de nacimento");

        int diaN,mesN,anoN;
        diaN = Integer.parseInt(dia);
        mesN = Integer.parseInt(mes);
        anoN = Integer.parseInt(ano);

int difereçaAno = (anoN-2026);

difereçaAno -= (mesN<10) ? -1 : +0 ;

String texto = (difereçaAno < 18) ? "Voce tem idade para festa":"voce nao tem idade para festa" ;

javax.swing.JOptionPane.showMessageDialog(frame,""+texto,"Guarda da festa",JOptionPane.QUESTION_MESSAGE);
System.exit(1);

    }
}
