package exemplos;

import javax.annotation.processing.Messager;
import javax.swing.*;
import java.awt.*;

public class JOptinioPane {
    public static void main(String[] args) {
        //j_OptionPane
        javax.swing.JOptionPane.showMessageDialog(null,
                """
                        hi
                        ola
                        hello
                        """ ,
                "Ois em ingles",
                JOptionPane.QUESTION_MESSAGE);


    }
}
