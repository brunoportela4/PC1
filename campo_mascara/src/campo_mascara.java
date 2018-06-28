//importa os pacotes e classes para usar interface gráfica
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

//declara classe que recebe herança da classe JFrame
public class campo_mascara extends JFrame{

//delcara as variáveis de rótulos, campos de texto e máscara   
JLabel rotulocep,rotulotel,rotulocpf,rotulodata;
JFormattedTextField cep,tel,cpf,data;
MaskFormatter mascaracep,mascaratel,mascaracpf,mascaradata;

//método construtor 
public campo_mascara(){
    //faz chamada implícita a super-classe JFrame
    super("Janelas com campos formatados");
    //instancia o objeto tela
    Container tela = getContentPane();
    setLayout(null);
    
    //instancia rótulos e cria os objetos
    rotulocep = new JLabel("CEP: ");
    rotulotel = new JLabel("Telefone: ");
    rotulocpf = new JLabel("CPF: ");
    rotulodata = new JLabel("Data: ");
    
    //posiciona e coloca tamanho nos rótulos
    rotulocep.setBounds(50,40,100,20);
    rotulotel.setBounds(50,80,100,20);
    rotulocpf.setBounds(50,120,100,20);
    rotulodata.setBounds(50,160,100,20);
    
    //executa ação
    try{
        //instancia as máscaras,dá um padrão e cria os objetos
        mascaracep = new MaskFormatter("#####-###");
        mascaratel = new MaskFormatter("(##)#####-####");
        mascaracpf = new MaskFormatter("###.###.###-##");
        mascaradata = new MaskFormatter("##/##/####");
        
        //especifica caracter da máscara
        mascaracep.setPlaceholderCharacter('_');
        mascaratel.setPlaceholderCharacter('_');
        mascaracpf.setPlaceholderCharacter('_');
        mascaradata.setPlaceholderCharacter('_');
    }
    //retorna mensagem
    catch(ParseException excp){}
    
    //intancia campos de texto formatados que recebem as máscaras e cria os objetos
    cep = new JFormattedTextField(mascaracep);
    tel = new JFormattedTextField(mascaratel);
    cpf = new JFormattedTextField(mascaracpf);
    data = new JFormattedTextField(mascaradata);
    
    //posiciona e coloca tamanho nos campos de texto formatados
    cep.setBounds(150,40,100,20);
    tel.setBounds(150,80,100,20);
    cpf.setBounds(150,120,100,20);
    data.setBounds(150,160,100,20);
    
    //adiciona os rótulos e campos de texto formatados criados na tela
    tela.add(rotulocep);
    tela.add(rotulotel);
    tela.add(rotulocpf);
    tela.add(rotulodata);
    tela.add(cep);
    tela.add(tel);
    tela.add(cpf);
    tela.add(data);
    
    //posiciona, exibe e coloca tamanho na tela 
    setSize(350,320);
    setVisible(true);
    setLocationRelativeTo(null);
}
    //pacote de extensão do núcleo Java
    public static void main(String[] args) {
        //instancia um objeto da classe criada e cria o objeto app
        campo_mascara app = new campo_mascara();
        //método padrão para comportamento da tela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
