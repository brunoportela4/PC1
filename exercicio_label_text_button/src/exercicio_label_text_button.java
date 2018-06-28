import javax.swing.*;
import java.awt.*;
public class exercicio_label_text_button extends JFrame{
    JLabel rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6,rotulo7,rotulo8;
    JTextField texto1,texto2,texto3,texto4,texto5,texto6,texto7;
    //JButton botao1,botao2;
    public exercicio_label_text_button(){
        super("Rótulos, campos de texto e botões");
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel ("Cadastro de Cliente");
        rotulo2 = new JLabel ("Nome");
        rotulo3 = new JLabel ("CPF");
        rotulo4 = new JLabel ("RG");
        rotulo5 = new JLabel ("Endereço");
        rotulo6 = new JLabel ("Cidade");
        rotulo7 = new JLabel ("Estado");
        rotulo8 = new JLabel ("CEP:");
        texto1 = new JTextField(100);
        texto2 = new JTextField(40);
        texto3 = new JTextField(30);
        texto4 = new JTextField(100);
        texto5 = new JTextField(80);
        texto6 = new JTextField(70);
        texto7 = new JTextField(30);
        
        //botao1 = new JButton("Nada 1");
        //botao2 = new JButton("Nada 2");
            
        rotulo1.setBounds(150,20,200,20);
        rotulo2.setBounds(50,60,80,20);
        rotulo3.setBounds(50,100,80,20);
        rotulo4.setBounds(50,140,80,20);
        rotulo5.setBounds(50,180,80,20);
        rotulo6.setBounds(50,220,80,20);
        rotulo7.setBounds(50,260,80,20);
        rotulo8.setBounds(50,300,80,20);
        texto1.setBounds(50,80,200,20);
        texto2.setBounds(50,120,140,20);
        texto3.setBounds(50,160,130,20);
        texto4.setBounds(50,200,200,20);
        texto5.setBounds(50,240,180,20);
        texto6.setBounds(50,280,170,20);
        texto7.setBounds(50,320,130,20);
        rotulo1.setForeground(Color.red);
        //botao1.setBounds(50,180,80,20);
        //botao2.setBounds(150,180,80,20);
        
        tela.setBackground(new Color(212,208,200));

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        tela.add(rotulo8);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
        //tela.add(botao1);
        //tela.add(botao2);
                 
        setSize(450,450);
        setVisible(true);
        setLocationRelativeTo(null);
        
        texto1.requestFocus();
    }
    public static void main(String[] args) {
        exercicio_label_text_button app = new exercicio_label_text_button();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
