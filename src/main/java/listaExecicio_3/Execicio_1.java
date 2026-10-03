package listaExecicio_3;

import javax.swing.*;

//Algoritmo Gestão Escolar
public class Execicio_1 {
    public static void main(String[] args) {
        double media =0;
        double calculo = 0;
        String texto = "";
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        texto = JOptionPane.showInputDialog(frame,"Digite a nota da prova do aluno");
       int notaProva = Integer.parseInt(texto);

        texto = JOptionPane.showInputDialog(frame,"Digite a nota da atividade do aluno");
       int  notaAtividade = Integer.parseInt(texto);

       double r1 = notaAtividade*0.3 ;
        System.out.println(r1);
       double r2= notaProva*0.7 ;
        System.out.println(r2);
       double v1 =(notaAtividade+r1)+(notaProva+r2);
        System.out.println(v1);



       double saida = v1/2;
        String saidaTexto = "";
       if (saida >= 6) {
           saidaTexto ="Aprovado";
       }else{
          saidaTexto ="deaprovado";
        }
       javax.swing.JOptionPane.showMessageDialog(frame,
               "\n Nota da prova:"+notaProva+"\n "+"nota da atividade"+notaAtividade+"\n"+" media do aluno:"+saida+"\n"+"O aluno foi ("+saidaTexto+")",
              "resutado" ,
               JOptionPane.QUESTION_MESSAGE);
        System.exit(1);
    }
}
