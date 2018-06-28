import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class ex4 extends JFrame{
    JLabel nome,cpf,endereco,fone;
    JTextField cnome,cendereco;
    JButton cadastrar,fechar;
    MaskFormatter mascaracpf,mascarafone;
    JFormattedTextField ccpf,cfone;
    public ex4(){
    super("Cadastro de Clientes");
    Container tela = getContentPane();
    setLayout(null);
    
    nome = new JLabel("Nome:");
    cpf = new JLabel("CPF:");
    endereco = new JLabel("Endereço:");
    fone = new JLabel("Fone:");
    cnome = new JTextField();
    cendereco = new JTextField();
    cadastrar  = new JButton ("Cadastrar");
    fechar  = new JButton ("Fechar");
    
    try{
    mascaracpf = new MaskFormatter("###.###.###-##");
    mascarafone = new MaskFormatter("(##)#####-####");
    mascaracpf.setPlaceholderCharacter('_');
    mascarafone.setPlaceholderCharacter('_');
    }
    catch(ParseException excp){}
    
        
    ccpf = new JFormattedTextField(mascaracpf);
    cfone = new JFormattedTextField(mascarafone);

    
    nome.setBounds(20,80,100,20);
    endereco.setBounds(20,120,100,20);
    fone.setBounds(20,160,100,20);
    cpf.setBounds(20,40,100,20);
    ccpf.setBounds(145,40,100,20);
    cnome.setBounds(145,80,230,20);
    cendereco.setBounds(145,120,230,20);
    cfone.setBounds(145,160,100,20);
    cadastrar.setBounds(20,240,100,20);
    fechar.setBounds(145,240,100,20);
    
    cadastrar.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                ;
            }
        }
    );
    fechar.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
                ;
            }
        }
    );
    
    tela.add(nome);
    tela.add(cpf);
    tela.add(ccpf);
    tela.add(endereco);
    tela.add(fone);
    tela.add(cnome);
    tela.add(cendereco);
    tela.add(cfone);
    tela.add(cadastrar);
    tela.add(fechar);
        
    setVisible(true);
    setSize(400,350);
    setLocationRelativeTo(null);
    
    }
       
    public static void main(String[] args) {
    ex4 app = new ex4();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
