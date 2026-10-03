package listaExecicio_3;


import javax.swing.*;

public class Execicio_3 {
    public static void main(String[] args) {
        int jogador1 = 0;
        int jogador2 = 0;
        int loop = 1;
        int limite = 10;
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        String texte = JOptionPane.showInputDialog(frame,"digite o numero de partidas");
        limite = Integer.parseInt(texte);
        while (loop <= limite) {
            int aleatorio = (int) (Math.random()*12);
            if (aleatorio < 6) {
                jogador1++;
            }else{
                jogador2++;
            }

            loop++;
        }
        int valorVitoria1 = jogador1*10;
        int valorVitoria2 = jogador2*5;



        javax.swing.JOptionPane.showMessageDialog(frame,
                "Numero de vitorias do jogador1 :"+jogador1+"\n quantidade de pontos do jogador1 :"+valorVitoria1+"\n numero de vitorias do jogador2 :"+jogador2+"\nquantidade de pontos do jogador2 :"+valorVitoria2,
                "resultado do execicio",
                JOptionPane.QUESTION_MESSAGE);
System.exit(1);
    }
}
