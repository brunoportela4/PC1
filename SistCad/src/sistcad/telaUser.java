package sistcad;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class telaUser extends JFrame{
   
    JButton limpar = new JButton("Limpar");
    JButton cadastrar = new JButton("Cadastrar");
    JButton fechar = new JButton("Fechar");
    JLabel tituloUs = new JLabel("CADASTRO DE USUÁRIO");
    JLabel nomeUs = new JLabel("Nome:");
    JLabel rgUs = new JLabel("RG:");          
    JLabel cpfUs = new JLabel("CPF:");
    JLabel emailUs = new JLabel("E-mail:");
    JLabel endUs = new JLabel("Endereço:");
    JLabel numUs = new JLabel("Nº");
    JLabel teleUs = new JLabel("Telefone:");
    JLabel cepUs = new JLabel("CEP:");
    JLabel login = new JLabel("Login:");
    JLabel senha = new JLabel("Senha:");
    JTextField cnomeUs = new JTextField();
    JTextField cemailUs = new JTextField();  
    JTextField clogin = new JTextField();  
    JTextField csenha = new JTextField(); 
    MaskFormatter mascCPF,mascRG,mascTele;
    
        
    public telaUser(){
    super("Cadastro de usuário");
    Container tela1 = getContentPane();
    setLayout(null);

    
    try{
    mascRG = new MaskFormatter("##.###.###-#");
    mascTele = new MaskFormatter("(##)#####-####");
    mascCPF = new MaskFormatter("###.###.###-##");
    
    mascCPF.setPlaceholderCharacter('_');
    mascRG.setPlaceholderCharacter('_');
    mascTele.setPlaceholderCharacter('_');
    }    
    catch(ParseException excp){}

       
    JFormattedTextField cCPF = new JFormattedTextField(mascCPF);
    JFormattedTextField cRG = new JFormattedTextField(mascRG);
    JFormattedTextField cTele = new JFormattedTextField(mascTele);
        
    csenha = new JPasswordField();

    cadastrar.setBounds(30,330,100,20);
    fechar.setBounds(250,330,100,20);
    tituloUs.setBounds(130,20,200,20);
    nomeUs.setBounds(30,60,100,20);
    rgUs.setBounds(30,90,100,20);
    cpfUs.setBounds(30,120,100,20);
    emailUs.setBounds(30,170,100,20);
    teleUs.setBounds(30,200,100,20);
    cnomeUs.setBounds(95,60,250,20);
    cemailUs.setBounds(95,170,250,20);
    clogin.setBounds(95,250,150,20);
    csenha.setBounds(95,280,150,20);
    cCPF.setBounds(95,120,100,20);
    cRG.setBounds(95,90,100,20);
    cTele.setBounds(95,200,100,20);
    login.setBounds(30,250,100,20);
    senha.setBounds(30,280,100,20);
    limpar.setBounds(140,330,100,20);
    cadastrar.setBackground(new Color(238,232,170));
    fechar.setBackground(new Color(238,232,170));
    limpar.setBackground(new Color(238,232,170));

    
    tela1.setBackground(new Color(176,196,222));
    tela1.add(limpar);    
    tela1.add(cadastrar);
    tela1.add(fechar);
    tela1.add(tituloUs);
    tela1.add(nomeUs);
    tela1.add(rgUs);
    tela1.add(cpfUs);
    tela1.add(emailUs);
    tela1.add(teleUs);
    tela1.add(cepUs);
    tela1.add(cnomeUs);
    tela1.add(cemailUs);
    tela1.add(cCPF);
    tela1.add(cRG);
    tela1.add(cTele);
    tela1.add(login);
    tela1.add(senha);
    tela1.add(clogin);
    tela1.add(csenha);
    
    fechar.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
            telaUser.this.dispose();
            }
        }
    ); 
    
    limpar.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
            cnomeUs.setText(null);
            cemailUs.setText(null);
            clogin.setText(null);
            csenha.setText(null);
            cCPF.setText(null);
            cRG.setText(null);
            cTele.setText(null);
            }
        }
    );
    
    cadastrar.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
            String a = cnomeUs.getText();
            String b = cRG.getText();
            String c = cCPF.getText();
            String d = cTele.getText();
            String i = cemailUs.getText();
            String f = csenha.getText();
            String g = clogin.getText();
            
            JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso! \n\n"+"Nome: "+a+"\n RG: "+b+"\n CPF: "+c+"\n E-mail: "+i+"\n Tefone: "+d+"\n Login: "+g+"\n Senha: "+f+"\n","Confirmação",1);
                        
            }
        }
    );
    
    setVisible(true);
    setSize(400,420);
    setLocationRelativeTo(null);

        
    }
}