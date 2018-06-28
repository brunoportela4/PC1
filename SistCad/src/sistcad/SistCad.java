package sistcad;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class SistCad extends JFrame{
    
    JButton cadCli = new JButton("Cliente");
    JButton cadForne = new JButton("Fornecedor");
    JButton cadProd = new JButton("Produto");
    JButton cadUser = new JButton("Usuário");
    JButton sair = new JButton("Sair");
    JLabel titulo,assinatura,recebeSimbolo;
    ImageIcon simbolo;
    
    
    public SistCad(){
    super("SistCad");
    Container tela = getContentPane();
    setLayout(null);
    
    titulo = new JLabel("SISTEMA DE CADASTRO");
    assinatura = new JLabel("Bruno Ferreira Vagliengo, 18811 - 2º Inf A");
    simbolo = new ImageIcon("simbolo.png");
    recebeSimbolo = new JLabel(simbolo);
    
    titulo.setBounds(100,20,300,30);
    cadCli.setBounds(30,80,100,30);
    cadForne.setBounds(140,80,100,30);
    cadProd.setBounds(30,125,100,30);
    cadUser.setBounds(140,125,100,30);
    sair.setBounds(320,190,80,30);
    assinatura.setBounds(30,210,300,20);
    recebeSimbolo.setBounds(280,65,100,100);
            
    tela.add(titulo);
    tela.add(cadCli);
    tela.add(cadForne);
    tela.add(cadProd);
    tela.add(cadUser);
    tela.add(sair);
    tela.add(assinatura);
    tela.add(recebeSimbolo);
    
        
    tela.setBackground(new Color(238,232,170));
    //sair.setBorder(null);
    sair.setBackground(new Color(176,196,222));
    cadCli  .setBackground(new Color(176,196,222));
    cadForne.setBackground(new Color(176,196,222));
    cadUser .setBackground(new Color(176,196,222));
    cadProd .setBackground(new Color(176,196,222));
    titulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
    assinatura.setFont(new Font("Segoe UI", Font.BOLD, 10));
        
    cadCli.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
            telaCli app2 = new telaCli();
            }
        }
    );
    cadForne.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
            telaForn app3 = new telaForn();
            }
        }
    );
        
    cadProd.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
            telaProd app4 = new telaProd();
            }
        }
    );
    cadUser.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
            telaUser app5 = new telaUser();
            }
        }
    );
    sair.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
            SistCad.this.dispose();
            }
        }
    );    
    
    setVisible(true);
    setSize(450,290);
    setLocationRelativeTo(null);
    
    }
    public static void main(String[] args) {
    SistCad app = new SistCad();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
