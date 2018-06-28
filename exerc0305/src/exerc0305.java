import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class exerc0305 extends JFrame{
    JLabel rotulo,rotulo1, rotulo2;
    JButton ocultar,exibir1,exibir2,habilitar,desabilitar;
    JList lista;
    String estados[]={"AC","AL","AP","AM","BA","CE","DF","ES","GO","MA","MT","MS","MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO"};

    public exerc0305(){
        super("Ocultar/exibir e habilitar/desabilitar componentes, lista e barra de rolagem");
        Container tela = getContentPane();
        setLayout(null);
        rotulo = new JLabel("Rótulo");
        rotulo1 = new JLabel("Rótulo 1");
        rotulo2 = new JLabel("Rótulo 2");
        ocultar = new JButton("Ocultar");
        exibir1 = new JButton("Exibir 1");
        exibir2 = new JButton("Exibir 2");
        habilitar = new JButton("Habilitar");
        desabilitar = new JButton("Desabilitar");
        lista = new JList(estados);
        
        lista.setVisibleRowCount(5);
        JScrollPane painelderolagem = new JScrollPane(lista);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        painelderolagem.setBounds(40,250,150,100);
        rotulo1.setBounds(50,40,100,20);
        rotulo2.setBounds(200,40,100,20);
        ocultar.setBounds(50,100,100,20);
        exibir1.setBounds(200,100,100,20);
        exibir2.setBounds(350,100,100,20);
        habilitar.setBounds(50,150,100,20);
        desabilitar.setBounds(200,150,100,20);
        rotulo.setBounds(20,20,200,20);
        
        ocultar.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
                rotulo1.setVisible(false);
                rotulo2.setVisible(false);
            }
        }
        );
        exibir1.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
                rotulo1.setVisible(true);
                rotulo2.setVisible(true);
            }
        }
        );
        
        desabilitar.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
                rotulo1.setEnabled(false);
                rotulo2.setEnabled(false);
            }
        }
        );
        habilitar.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
                rotulo1.setEnabled(true);
                rotulo2.setEnabled(true);
            }
        }
        );
        
        exibir2.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
                rotulo.setText("O estado selecionado é: "+lista.getSelectedValue().toString());
                
            }
        }
        );
        
        tela.add(painelderolagem);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(ocultar);
        tela.add(exibir1);
        tela.add(exibir2);
        tela.add(habilitar);
        tela.add(desabilitar);
        tela.add(rotulo);
        
        setSize(600,400);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }

    public static void main(String[] args) {
        exerc0305 app = new exerc0305();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
