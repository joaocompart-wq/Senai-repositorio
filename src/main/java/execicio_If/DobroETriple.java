package execicio_If;

import javax.swing.*;


public class DobroETriple {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        String numero = JOptionPane.showInputDialog(frame,"digite um  numero"
        );
        int numero1 = Integer.parseInt(numero);
        double dobro = Math.pow(numero1,2);
        double triplo = Math.pow(numero1,3);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Esse e seu numero"+numero1+"\n"+"Esse e o dobro do seu numero "+dobro+"\n"+" Esse e o dobro do seu numero "+triplo,
                "resultado" ,
                JOptionPane.QUESTION_MESSAGE);
    }
}
