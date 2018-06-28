import javax.swing.*;
import java.awt.*;
public class ex_fixacao_2cad extends JFrame{
    JLabel top,codigo,nome,cpf,tel,logradouro,bairro,cidade,num,estado;
    JTextField codigoc,nomec,cpfc,telc,logradouroc,bairroc,cidadec,numc,estadoc;
    JButton buscar,limpar,inserir;
    public ex_fixacao_2cad(){
    super("Cadastro Cliente");
    Container tela = getContentPane();
    setLayout(null);
    
    top = new JLabel("Cadastro Cliente");
    codigo = new JLabel("Código:");
    nome = new JLabel("Nome:");
    cpf = new JLabel("CPF:");
    tel = new JLabel("Telefone:");
    logradouro = new JLabel("Logradouro:");
    bairro = new JLabel("Bairro:");
    cidade = new JLabel("Cidade:");
    num = new JLabel("Nº:");
    estado=new JLabel("Estado:");

    
    codigoc=new JTextField();
    nomec=new JTextField();
    cpfc=new JTextField();
    telc=new JTextField();
    logradouroc=new JTextField();
    bairroc=new JTextField();
    cidadec=new JTextField();
    numc=new JTextField();
    estadoc=new JTextField();

    buscar = new JButton ("Buscar");
    limpar = new JButton ("Limpar");
    inserir = new JButton ("Inserir");
    
    top.setBounds(300,5,100,20);
    codigo.setBounds(10,40,100,20);
    nome.setBounds(10,75,100,20);
    cpf.setBounds(10,110,100,20);
    tel.setBounds(220,110,100,20);
    logradouro.setBounds(10,180,100,20);
    bairro.setBounds(10,215,100,20);
    cidade.setBounds(10,250,100,20);
    num.setBounds(545,180,90,20);
    estado.setBounds(440,250,100,20);
    codigoc.setBounds(60,40,150,20);
    nomec.setBounds(60,75,600,20);
    cpfc.setBounds(60,110,150,20);
    telc.setBounds(290,110,180,20);
    logradouroc.setBounds(90,180,425,20);
    bairroc.setBounds(60,215,455,20);
    cidadec.setBounds(60,250,350,20);
    numc.setBounds(570,180,90,20);
    estadoc.setBounds(490,250,170,20);
    buscar.setBounds(10,290,100,20);
    limpar.setBounds(450,290,100,20);
    inserir.setBounds(560,290,100,20);
    
    
    tela.add(top);
    tela.add(codigo);
    tela.add(nome);
    tela.add(cpf);
    tela.add(tel);
    tela.add(logradouro);
    tela.add(bairro);
    tela.add(cidade);
    tela.add(num);
    tela.add(estado);
    tela.add(cidadec);
    tela.add(codigoc);
    tela.add(nomec);
    tela.add(cpfc);
    tela.add(telc);
    tela.add(logradouroc);
    tela.add(bairroc);
    tela.add(numc);
    tela.add(estadoc);
    tela.add(buscar);
    tela.add(limpar);
    tela.add(inserir);
    
    
    setVisible(true);
    setSize(700,380);
    setLocationRelativeTo(null);
    
    }
       
    public static void main(String[] args) {
    ex_fixacao_2cad app=new ex_fixacao_2cad();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
