import javax.swing.*;
import java.awt.*;
public class botao_icone extends JFrame{
JButton botao1,botao2,botao3;
ImageIcon icone1,icone2;
public botao_icone(){
    super("Tela com botões e ícones");
    Container tela = getContentPane();
    setLayout(null);
    botao1 = new JButton ("Abrir");
    icone1 = new ImageIcon("pesquisar.gif");
    botao2 = new JButton ("Procurar",icone1);
    icone2 = new ImageIcon("salvar.gif");
    botao3 = new JButton (icone2);
        
    botao1.setBounds(70,30,150,30);
    botao2.setBounds(70,80,150,30);
    botao3.setBounds(110,130,50,50);
    
    tela.add(botao1);
    tela.add(botao2);
    tela.add(botao3);
    
    setSize(300,270);
    setVisible(true);
    setLocationRelativeTo(null);
}
    public static void main(String[] args) {
        botao_icone app = new botao_icone();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
