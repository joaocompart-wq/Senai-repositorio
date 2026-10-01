package execicio_If;

import javax.swing.*;
import java.util.Scanner;

public class SucessorAntecessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero para obter o sucessor e antecessor");
        int ent = sc.nextInt();
        sc.close();
        int sucessor = ent+1;
        int antecessor = ent-1;
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        javax.swing.JOptionPane.showMessageDialog(frame,
                "Seu numero e:"+ent+("\n")+"Seu sucessor e:"+sucessor+("\n")+"seu antecesor"+antecessor,
                "saida do execicio 7"
                ,JOptionPane.QUESTION_MESSAGE);
    }
}
