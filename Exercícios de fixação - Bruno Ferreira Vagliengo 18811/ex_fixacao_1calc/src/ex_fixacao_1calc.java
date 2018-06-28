import javax.swing.*;
import java.awt.*;

public class ex_fixacao_1calc extends JFrame{
    JTextField telinha;
    JButton botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9, botaozero, botaomenos, botaomais, botaovezes, botaodividir, botaoigual, botao1x, botaoce, botaoc, botaomaismenos, botaoponto;
        
    public ex_fixacao_1calc(){
        super ("Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        
        telinha = new JTextField(200);  
        
        botao1 = new JButton("1");
        botao2 = new JButton("2");
        botao3 = new JButton("3");
        botao4 = new JButton("4");
        botao5 = new JButton("5");
        botao6 = new JButton("6");
        botao7 = new JButton("7");
        botao8 = new JButton("8");
        botao9 = new JButton("9");
        botaozero = new JButton("0");
        botaomenos = new JButton("-");
        botaomais = new JButton("+");
        botaovezes = new JButton("*");
        botaodividir = new JButton("/");
        botaoigual = new JButton("=");
        botao1x = new JButton("1/x");
        botaoce = new JButton("CE");
        botaoc = new JButton("C");
        botaoponto = new JButton(".");
        botaomaismenos = new JButton("+/-");

        telinha.setBounds(20,20,320,45);
        botao1.setBounds(20,80,55,55);
        botao2.setBounds(85,80,55,55);
        botao3.setBounds(150,80,55,55);
        botao4.setBounds(20,145,55,55);
        botao5.setBounds(85,145,55,55);
        botao6.setBounds(150,145,55,55);
        botao7.setBounds(20,210,55,55);
        botao8.setBounds(85,210,55,55);
        botao9.setBounds(150,210,55,55);
        botaozero.setBounds(20,275,55,55);
        botaomenos.setBounds(215,80,55,55);
        botaomais.setBounds(215,145,55,55);
        botaovezes.setBounds(215,210,55,55);
        botaodividir.setBounds(215,275,55,55);
        botaoigual.setBounds(280,275,55,55);
        botao1x.setBounds(280,210,55,55);
        botaoce.setBounds(280,145,55,55);
        botaoc.setBounds(280,80,55,55);
        botaoponto.setBounds(150,275,55,55);
        botaomaismenos.setBounds(85,275,55,55);
        
        botaomenos.setBackground(Color.gray);
        botaomaismenos.setBackground(Color.gray);
        botao1x.setBackground(Color.gray);
        botaoce.setBackground(Color.gray);
        botaoc.setBackground(Color.gray);
        botaodividir.setBackground(Color.gray);
        botaovezes.setBackground(Color.gray);
        botaomais.setBackground(Color.gray);
        botaoponto.setBackground(Color.gray);
        botaoigual.setBackground(Color.gray);
        
        tela.add(telinha);
        tela.add(botao1);
        tela.add(botao2);
        tela.add(botao3);
        tela.add(botao4);
        tela.add(botao5);
        tela.add(botao6);
        tela.add(botao7);
        tela.add(botao8);
        tela.add(botao9);
        tela.add(botaozero);
        tela.add(botaomenos);
        tela.add(botaomais);
        tela.add(botaovezes);
        tela.add(botaodividir);
        tela.add(botaoigual);
        tela.add(botao1x);
        tela.add(botaoce);
        tela.add(botaoc);
        tela.add(botaoponto);
        tela.add(botaomaismenos);
        
        setSize(380,400);
        setVisible(true);
        setLocationRelativeTo(null);
        
        getRootPane().setDefaultButton(botaoigual);

        }
    public static void main(String[] args) {
        ex_fixacao_1calc app = new ex_fixacao_1calc();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
