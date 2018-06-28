import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex3 extends JFrame {

    JLabel rotulo, formula, instrucao, veloini, velofini, aceleracao, tempo;
    JButton calcular;
    JTextField inivelo, finivelo, acelerec, temp;

    public ex3() {
        super("MUV");
        Container tela = getContentPane();
        setLayout(null);

        rotulo = new JLabel("Movimento Uniformemente Variado");
        formula = new JLabel("V = V0 + A * T");
        instrucao = new JLabel ("Para encontrar a velocidade final, insira os valores:");
        veloini= new JLabel("Velocidade Inicial:");
        aceleracao = new JLabel("Acelaração:");
        tempo = new JLabel("Tempo:");
        velofini = new JLabel("Velocidade Final:");
        calcular = new JButton("Calcular");
        inivelo = new JTextField();        
        finivelo = new JTextField();        
        acelerec = new JTextField();        
        temp = new JTextField();        


        rotulo.setBounds(70, 20, 200, 20);
        formula.setBounds(85, 40, 200, 20);
        instrucao.setBounds(20, 80, 300, 20);
        veloini.setBounds(20, 120, 150, 20);
        aceleracao.setBounds(20, 160, 100, 20);
        tempo.setBounds(20, 200, 200, 20);
        velofini.setBounds(20, 280, 100, 20);
        calcular.setBounds(20, 240, 300, 20);
        inivelo.setBounds(140, 120, 100, 20);      
        finivelo.setBounds(140, 280, 100, 20);       
        acelerec.setBounds(140, 160, 100, 20);        
        temp.setBounds(140, 200, 100, 20); 

        calcular.addActionListener(
           new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               double valor1, valor2, valor3, valor4;
               valor1 = Double.parseDouble(inivelo.getText());
               valor2 = Double.parseDouble(acelerec.getText());
               valor3 = Double.parseDouble(temp.getText());             
               valor4 = valor1+(valor2*valor3);
               finivelo.setText(""+valor4);
            }             
            }
        );
        tela.add(rotulo);
        tela.add(formula);
        tela.add(instrucao);
        tela.add(veloini);
        tela.add(aceleracao);
        tela.add(tempo);
        tela.add(velofini);
        tela.add(calcular);
        tela.add(inivelo);
        tela.add(finivelo);
        tela.add(acelerec);
        tela.add(temp);

        setSize(350, 400);
        setVisible(true);
        setLocationRelativeTo(null);
    
    }
    
    public static void main(String[] args) {
    ex3 app = new ex3();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}