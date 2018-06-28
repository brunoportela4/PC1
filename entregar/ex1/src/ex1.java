
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex1 extends JFrame {

    JLabel rotulo, formula, valorA, valorB, valorC, x1, x2;
    JButton calcular;
    JTextField va, vb, vc, vx1, vx2;

    public ex1() {
        super("Fórmula de Bhaskara");
        Container tela = getContentPane();
        setLayout(null);

        rotulo = new JLabel("Fórmula de Bhaskara");
        formula = new JLabel("ax² + bx + c = 0");
        valorA = new JLabel("Valor de A");
        valorB = new JLabel("Valor de B");
        valorC = new JLabel("Valor de C");
        x1 = new JLabel("X1");
        x2 = new JLabel("X2");

        calcular = new JButton("Calcular");

        va = new JTextField();
        vb = new JTextField();
        vc = new JTextField();
        vx1 = new JTextField();
        vx2 = new JTextField();

        rotulo.setBounds(70, 20, 200, 20);
        formula.setBounds(85, 40, 200, 20);
        valorA.setBounds(20, 80, 100, 20);
        valorB.setBounds(20, 120, 100, 20);
        valorC.setBounds(20, 160, 100, 20);
        x1.setBounds(80, 240, 100, 20);
        x2.setBounds(80, 280, 100, 20);
        calcular.setBounds(20, 200, 210, 20);
        va.setBounds(130, 80, 100, 20);
        vb.setBounds(130, 120, 100, 20);
        vc.setBounds(130, 160, 100, 20);
        vx1.setBounds(130, 240, 100, 20);
        vx2.setBounds(130, 280, 100, 20);

        calcular.addActionListener(
            new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double valor1, valor2, valor3, xis1a, xis1b, xis1c, xis2a, xis2b, xis2c;
                valor1 = Double.parseDouble(va.getText());
                valor2 = Double.parseDouble(vb.getText());
                valor3 = Double.parseDouble(vc.getText());
                xis1a = Math.pow(valor2,2);
                xis1b = Math.sqrt(xis1a-4*valor1*valor3);
                xis1c = (-valor2 + xis1b)/2*valor1;
                
                xis2a = Math.pow(valor2,2);
                xis2b = Math.sqrt(xis1a-4*valor1*valor3);
                xis2c = (-valor2 - xis1b)/2*valor1;
                
                vx1.setText(""+xis1c);
                vx2.setText(""+xis2c);
            }             
        }
       );

        tela.add(rotulo);
        tela.add(formula);
        tela.add(valorA);
        tela.add(valorB);
        tela.add(valorC);
        tela.add(x1);
        tela.add(x2);
        tela.add(calcular);
        tela.add(va);
        tela.add(vb);
        tela.add(vc);
        tela.add(vx1);
        tela.add(vx2);

        setSize(280, 370);
        setVisible(true);
        setLocationRelativeTo(null);
    
    }
    
    public static void main(String[] args) {
    ex1 app = new ex1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


