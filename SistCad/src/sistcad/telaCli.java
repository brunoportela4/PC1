package sistcad;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class telaCli extends JFrame{
   
    
    JButton cadastrar = new JButton("Cadastrar");
    JButton fechar = new JButton("Fechar");
    JButton limpar = new JButton("Limpar");
    JLabel tituloCli = new JLabel("CADASTRO DE CLIENTE");
    JLabel nomeCli = new JLabel("Nome:");
    JLabel rgCli = new JLabel("RG:");
    JLabel cpfCli = new JLabel("CPF:");
    JLabel emailCli = new JLabel("E-mail:");
    JLabel endCli = new JLabel("Endereço:");
    JLabel numCli = new JLabel("Nº");
    JLabel teleCli = new JLabel("Telefone:");
    JLabel cepCli = new JLabel("CEP:");
    JTextField cnomeCli = new JTextField();
    JTextField cemailCli = new JTextField();  
    JTextField cendCli = new JTextField();  
    JTextField cnumCli = new JTextField();  
    MaskFormatter mascCPF,mascRG,mascTele,mascCEP;
    
        
    public telaCli(){
    super("Cadastro de cliente");
    Container tela2 = getContentPane();
    setLayout(null);

    
    try{
    mascRG = new MaskFormatter("##.###.###-#");
    mascTele = new MaskFormatter("(##)#####-####");
    mascCEP = new MaskFormatter("#####-###");
    mascCPF = new MaskFormatter("###.###.###-##");
    
    mascCPF.setPlaceholderCharacter('_');
    mascRG.setPlaceholderCharacter('_');
    mascTele.setPlaceholderCharacter('_');
    mascCEP.setPlaceholderCharacter('_');
    }    
    catch(ParseException excp){}

       
    JFormattedTextField cCPF = new JFormattedTextField(mascCPF);
    JFormattedTextField cRG = new JFormattedTextField(mascRG);
    JFormattedTextField cTele = new JFormattedTextField(mascTele);
    JFormattedTextField cCEP = new JFormattedTextField(mascCEP);
     
    

    
    cadastrar.setBounds(30,340,100,20);
    fechar.setBounds(250,340,100,20);
    tituloCli.setBounds(130,20,200,20);
    nomeCli.setBounds(30,60,100,20);
    rgCli.setBounds(30,90,100,20);
    cpfCli.setBounds(30,120,100,20);
    emailCli.setBounds(30,170,100,20);
    endCli.setBounds(30,250,100,20);
    numCli.setBounds(260,250,40,20);
    teleCli.setBounds(30,200,100,20);
    cepCli.setBounds(30,280,100,20);
    cnomeCli.setBounds(95,60,250,20);
    cemailCli.setBounds(95,170,250,20);
    cendCli.setBounds(95,250,150,20);
    cnumCli.setBounds(280,250,40,20);
    cCPF.setBounds(95,120,100,20);
    cRG.setBounds(95,90,100,20);
    cTele.setBounds(95,200,100,20);
    cCEP.setBounds(95,280,100,20);
    limpar.setBounds(140,340,100,20);
    cadastrar.setBackground(new Color(238,232,170));
    fechar.setBackground(new Color(238,232,170));
    limpar.setBackground(new Color(238,232,170));
    
    
    tela2.setBackground(new Color(176,196,222));
    tela2.add(limpar);
    tela2.add(cadastrar);
    tela2.add(fechar);
    tela2.add(tituloCli);
    tela2.add(nomeCli);
    tela2.add(rgCli);
    tela2.add(cpfCli);
    tela2.add(emailCli);
    tela2.add(endCli);
    tela2.add(numCli);
    tela2.add(teleCli);
    tela2.add(cepCli);
    tela2.add(cnomeCli);
    tela2.add(cemailCli);
    tela2.add(cendCli);
    tela2.add(cnumCli);
    tela2.add(cCPF);
    tela2.add(cRG);
    tela2.add(cTele);
    tela2.add(cCEP);
    
    fechar.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
            telaCli.this.dispose();
            }
        }
    );
    limpar.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
            cnomeCli.setText(null);
            cemailCli.setText(null);
            cendCli.setText(null);
            cnumCli.setText(null);
            cCPF.setText(null);
            cRG.setText(null);
            cTele.setText(null);
            cCEP.setText(null);
            }
        }
    );
    cadastrar.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
            String a = cnomeCli.getText();
            String b = cRG.getText();
            String c = cCPF.getText();
            String d = cTele.getText();
            String i = cCEP.getText();
            String f = cemailCli.getText();
            String g = cendCli.getText();
            String h = cnumCli.getText();
            
            JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso! \n\n"+"Nome: "+a+"\n RG: "+b+"\n CPF: "+c+"\n E-mail: "+f+"\n Tefone: "+d+"\n Endereço: "+g+"\n Nº "+h+"\n CEP: "+i+"\n","Confirmação",1);
                        
            }
        }
    );
    
    setVisible(true);
    setSize(400,420);
    setLocationRelativeTo(null);

        
    }
}