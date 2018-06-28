package sistcad;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class telaForn extends JFrame{
    
    JButton limpar = new JButton("Limpar");
    JButton cadastrar = new JButton("Cadastrar");
    JButton fechar = new JButton("Fechar");
    JLabel tituloForn = new JLabel("CADASTRO DE FORNECEDOR");
    JLabel nomeForn  = new JLabel("Empresa:");
    JLabel fantasiaForn = new JLabel("Nome fantasia:");
    JLabel cnpjForn  = new JLabel("CNPJ:");
    JLabel emailForn  = new JLabel("E-mail:");
    JLabel endForn  = new JLabel("Endereço:");
    JLabel numForn  = new JLabel("Nº");
    JLabel teleForn  = new JLabel("Telefone:");
    JLabel cepForn  = new JLabel("CEP:");
    JTextField cnomeForn  = new JTextField();
    JTextField cfantasiaForn  = new JTextField();
    JTextField cemailForn  = new JTextField();  
    JTextField cendForn = new JTextField();  
    JTextField cnumForn = new JTextField();  
    MaskFormatter mascCNPJForn,mascTeleForn,mascCEPForn;
    
    public telaForn(){
    super("Cadastro de fornecedor");
    Container tela3 = getContentPane();
    setLayout(null);
    
    try{
    mascCNPJForn = new MaskFormatter("##.###.###/####-##");
    mascTeleForn = new MaskFormatter("(##)#####-####");
    mascCEPForn = new MaskFormatter("#####-###");
    
    mascCNPJForn.setPlaceholderCharacter('_');
    mascTeleForn.setPlaceholderCharacter('_');
    mascCEPForn.setPlaceholderCharacter('_');
    }    
    catch(ParseException excp){}
    
    JFormattedTextField cCnpjForn = new JFormattedTextField(mascCNPJForn);
    JFormattedTextField cTeleForn = new JFormattedTextField(mascTeleForn);
    JFormattedTextField cCEPForn = new JFormattedTextField(mascCEPForn);
    
    
    
    
    cadastrar.setBounds(30,340,100,20);
    fechar.setBounds(250,340,100,20);
    tituloForn.setBounds(110,20,200,20);
    nomeForn.setBounds(25,60,100,20);
    fantasiaForn.setBounds(25,90,100,20);
    cnpjForn.setBounds(25,120,100,20);
    cCnpjForn.setBounds(115,120,120,20);
    emailForn.setBounds(25,170,100,20);
    endForn.setBounds(25,250,100,20);
    numForn.setBounds(270,250,40,20);
    teleForn.setBounds(25,200,100,20);
    cepForn.setBounds(25,280,100,20);
    cnomeForn.setBounds(115,60,250,20);
    cemailForn.setBounds(115,170,250,20);
    cendForn.setBounds(115,250,150,20);
    cnumForn.setBounds(285,250,40,20);
    cfantasiaForn.setBounds(115,90,150,20);
    cTeleForn.setBounds(115,200,100,20);
    cCEPForn.setBounds(115,280,70,20);
    limpar.setBounds(140,340,100,20);
    cadastrar.setBackground(new Color(238,232,170));
    fechar.setBackground(new Color(238,232,170));
    limpar.setBackground(new Color(238,232,170));
    
    tela3.setBackground(new Color(176,196,222));
    tela3.add(limpar);
    tela3.add(cadastrar);
    tela3.add(fechar);
    tela3.add(tituloForn);
    tela3.add(nomeForn);
    tela3.add(fantasiaForn);
    tela3.add(cnpjForn);
    tela3.add(emailForn);
    tela3.add(endForn);
    tela3.add(numForn);
    tela3.add(teleForn);
    tela3.add(cepForn);
    tela3.add(cnomeForn);
    tela3.add(cemailForn);
    tela3.add(cendForn);
    tela3.add(cnumForn);
    tela3.add(cCEPForn);
    tela3.add(cfantasiaForn);
    tela3.add(cTeleForn);
    tela3.add(cCEPForn);
    tela3.add(cCnpjForn);
    
    
    fechar.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
            telaForn.this.dispose();
            }
        }
    );   
    
    limpar.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
            cnomeForn.setText(null);
            cemailForn.setText(null);
            cendForn.setText(null);
            cnumForn.setText(null);
            cfantasiaForn.setText(null);
            cTeleForn.setText(null);
            cCEPForn.setText(null);
            cCnpjForn.setText(null);
            }
        }
    );
    
    cadastrar.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
            String a = cnomeForn.getText();
            String b = cemailForn.getText();
            String c = cendForn.getText();
            String d = cnumForn.getText();
            String f = cCEPForn.getText();
            String g = cfantasiaForn.getText();
            String h = cTeleForn.getText();
            String i = cCEPForn.getText();
            String j = cCnpjForn.getText();
            
            JOptionPane.showMessageDialog(null,"Fornecedor cadastrado com sucesso! \n\n"+"Empresa: "+a+"\n Nome fantasia: "+g+"\n CNPJ: "+b+"\n E-mail: "+f+"\n Tefone: "+h+"\n Endereço: "+c+"\n Nº "+d+"\n CEP: "+i+"\n","Confirmação",1);
                        
            }
        }
    );
    
    setVisible(true);
    setSize(400,420);
    setLocationRelativeTo(null);

        
    }
}