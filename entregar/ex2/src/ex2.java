import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex2 extends JFrame {

    JLabel rotulo, formula, valorA, valorB, valorC;
    JButton calcular;
    JTextField va, vb, vc;

    public ex2() {
        super("Teorema de Pitágoras");
        Container tela = getContentPane();
        setLayout(null);

        rotulo = new JLabel("Teorema de Pitágoras");
        formula = new JLabel("C² = A² + B²");
        valorA = new JLabel("Insira o valor do cateto A:");
        valorB = new JLabel("Insira o valor do cateto B:");
        valorC = new JLabel("O valor da hipotenusa é:");
        calcular = new JButton("Calcular");
        va = new JTextField();
        vb = new JTextField();
        vc = new JTextField();

        rotulo.setBounds(70, 20, 200, 20);
        formula.setBounds(85, 40, 200, 20);
        valorA.setBounds(20, 80, 200, 20);
        valorB.setBounds(20, 120, 200, 20);
        valorC.setBounds(20, 200, 200, 20);
        calcular.setBounds(20, 160, 250, 20);
        va.setBounds(170, 80, 100, 20);
        vb.setBounds(170, 120, 100, 20);
        vc.setBounds(170, 200, 100, 20);

        calcular.addActionListener(
            new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double valor1, valor2, valor3, valorqA, valorqB;
                valor1 = Double.parseDouble(va.getText());
                valor2 = Double.parseDouble(vb.getText());
                valorqA = Math.pow(valor1,2);
                valorqB = Math.pow(valor2,2);
                valor3 = valorqA + valorqB;

                vc.setText(""+valor3);
            }             
        }
       );

        tela.add(rotulo);
        tela.add(formula);
        tela.add(valorA);
        tela.add(valorB);
        tela.add(valorC);
        tela.add(calcular);
        tela.add(va);
        tela.add(vb);
        tela.add(vc);

        setSize(320, 370);
        setVisible(true);
        setLocationRelativeTo(null);
    
    }
    
    public static void main(String[] args) {
    ex2 app = new ex2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}