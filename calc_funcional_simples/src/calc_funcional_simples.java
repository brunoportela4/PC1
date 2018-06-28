import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calc_funcional_simples extends JFrame{
    JLabel rotulo1,rotulo2,exibir;
    JTextField texto1,texto2;
    JButton somar, multiplicar, subtrair;
    
    public calc_funcional_simples(){
    super("Calculadora funcional simples");
    Container tela = getContentPane();
    setLayout(null);
    
    rotulo1 = new JLabel("Primeiro número: ");
    rotulo2 = new JLabel("Segundo número: ");
    
    texto1 = new JTextField(5);
    texto2 = new JTextField(5);
    
    exibir = new JLabel();
    
    somar = new JButton ("Somar");
    multiplicar = new JButton ("Multiplicar");
    subtrair = new JButton ("Subtrair");   
    
    rotulo1.setBounds(40,20,200,20);
    rotulo2.setBounds(40,60,200,20);
    texto1.setBounds(150,20,100,20);
    texto2.setBounds(150,60,100,20);
    exibir.setBounds(100,160,200,20);
    somar.setBounds(20,100,100,20);
    multiplicar.setBounds(150,100,100,20);
    subtrair.setBounds(280,100,100,20);  
    
    somar.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
            int numero1, numero2, soma;
            soma = 0;
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            soma = numero1 + numero2;
            exibir.setVisible(true);
            exibir.setText("A soma é: " + soma);
            }
        }
    );
    
    subtrair.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
            int numero1, numero2, subtra;
            subtra = 0;
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            subtra = numero1 - numero2;
            exibir.setVisible(true);
            exibir.setText("A subtração é: " + subtra);
            }
        }
    );
        
    multiplicar.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
            int numero1, numero2, multi;
            multi = 0;
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            multi = numero1 * numero2;
            exibir.setVisible(true);
            exibir.setText("A multiplicação é: " + multi);
            }
        }
    );
    
    exibir.setVisible(false);
    
    tela.add(rotulo1);
    tela.add(rotulo2);
    tela.add(texto1);
    tela.add(texto2);
    tela.add(exibir);
    tela.add(somar);
    tela.add(multiplicar);
    tela.add(subtrair);
    
    setSize(420,220);
    setVisible(true);
    setLocationRelativeTo(null);
    
    }
    public static void main(String[] args) {
        calc_funcional_simples app = new calc_funcional_simples();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
