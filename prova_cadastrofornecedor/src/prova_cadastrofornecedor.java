import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class prova_cadastrofornecedor extends JFrame{
    JLabel top,tipo,razao,nome,cnpj,representante,endereco,bairro,cidade,cep,email,fone,fax,nit,emite,aliquota,percent,internacional;
    JTextField ctipo,crazao,cnome,crepresentante,cendereco,cbairro,ccidade,cnum,cemail,cemite,caliquota;
    JButton cadastrar,cancelar;
    MaskFormatter mascaracpf,mascaracep,mascarafone,mascarafax,mascaranit;
    JFormattedTextField ccnpj,ccep,cfone,cfax,cnit;
    public prova_cadastrofornecedor(){
    super("Cadastro de fornecedor");
    Container tela = getContentPane();
    setLayout(null);
    
    top = new JLabel("Cadastro de fornecerdor");
    tipo = new JLabel("Tipo do fornecedor: *");
    razao = new JLabel("Razão social: *");
    nome = new JLabel("Nome fantasia:");
    cnpj = new JLabel("CPF/CNPJ: *");
    representante = new JLabel("Representante:");
    endereco = new JLabel("Endereço: *");
    bairro = new JLabel("Bairro: *");
    cidade = new JLabel("Cidade: *");
    cep = new JLabel("CEP:");
    fone = new JLabel("Fone:");
    email = new JLabel("Email:");
    fax = new JLabel("Fax:");
    nit = new JLabel("NIT ou PIS/PASEP:");
    emite = new JLabel("Emite fatura?");
    aliquota = new JLabel("Alíquota de imposto:");
    percent = new JLabel("%");
    internacional = new JLabel("Internacional");
    
    ctipo = new JTextField();
    crazao = new JTextField();
    cnome = new JTextField();
    crepresentante = new JTextField();
    cendereco = new JTextField();
    cbairro = new JTextField();
    ccidade = new JTextField();
    cnum = new JTextField();
    cemail = new JTextField();
    cemite = new JTextField();
    caliquota = new JTextField();

    
    cadastrar  = new JButton ("Cadastrar");
    cancelar  = new JButton ("Cancelar");
    
    try{
    mascaracpf = new MaskFormatter("###.###.###-##");
    mascaracep = new MaskFormatter("#####-###");
    mascarafone = new MaskFormatter("(##)#####-####");
    mascarafax = new MaskFormatter("(##)####-####");
    mascaranit = new MaskFormatter("#########-#");
    
    mascaracpf.setPlaceholderCharacter('_');
    mascaracep.setPlaceholderCharacter('_');
    mascarafone.setPlaceholderCharacter('_');
    mascarafax.setPlaceholderCharacter('_');
    mascaranit.setPlaceholderCharacter('_');
    }
    catch(ParseException excp){}
    
        
    ccnpj = new JFormattedTextField(mascaracpf);
    ccep = new JFormattedTextField(mascaracep);
    cfone = new JFormattedTextField(mascarafone);
    cfax = new JFormattedTextField(mascarafax);
    cnit = new JFormattedTextField(mascaranit);
    
    top.setBounds(350,20,300,20);
    tipo.setBounds(70,60,200,20);
    razao.setBounds(100,90,200,20);
    nome.setBounds(95,120,200,20);
    cnpj.setBounds(110,150,200,20);
    representante.setBounds(90,180,200,20);
    endereco.setBounds(110,210,200,20);
    bairro.setBounds(130,240,200,20);
    cidade.setBounds(130,270,200,20);
    cep.setBounds(150,300,200,20);
    email.setBounds(140,330,200,20);
    fone.setBounds(145,360,200,20);
    fax.setBounds(155,390,200,20);
    nit.setBounds(80,420,200,20);
    emite.setBounds(100,450,200,20);
    aliquota.setBounds(470,450,200,20);
    percent.setBounds(660,450,100,20);
    internacional.setBounds(490,240,200,20);
    ctipo.setBounds(200,60,300,20);
    crazao.setBounds(200,90,500,20);
    cnome.setBounds(200,120,500,20);
    ccnpj.setBounds(200,150,200,20);
    crepresentante.setBounds(200,180,500,20);
    cendereco.setBounds(200,210,500,20);
    cbairro.setBounds(200,240,250,20);
    ccidade.setBounds(200,270,250,20);
    cnum.setBounds(460,270,50,20);
    ccep.setBounds(200,300,170,20);
    cemail.setBounds(200,330,200,20);
    cfone.setBounds(200,360,170,20);
    cfax.setBounds(200,390,170,20);
    cnit.setBounds(200,420,170,20);
    cemite.setBounds(200,450,130,20);
    caliquota.setBounds(600,450,50,20);
    cadastrar.setBounds(280,500,100,20);
    cancelar.setBounds(400,500,100,20);
    
    tela.add(top);
    tela.add(tipo);
    tela.add(razao);
    tela.add(nome);
    tela.add(cnpj);
    tela.add(representante);
    tela.add(endereco);
    tela.add(bairro);
    tela.add(cidade);
    tela.add(cep);
    tela.add(email);
    tela.add(fone);
    tela.add(fax);
    tela.add(nit);
    tela.add(emite);
    tela.add(aliquota);
    tela.add(percent);
    tela.add(internacional);
    tela.add(ctipo);
    tela.add(crazao);
    tela.add(cnome);
    tela.add(ccnpj);
    tela.add(crepresentante);
    tela.add(cendereco);
    tela.add(cbairro);
    tela.add(ccidade);
    tela.add(cnum);
    tela.add(ccep);
    tela.add(cemail);
    tela.add(cfone);
    tela.add(cfax);
    tela.add(cnit);
    tela.add(cemite);
    tela.add(caliquota);
    tela.add(cadastrar);
    tela.add(cancelar);
        
    setVisible(true);
    setSize(800,590);
    setLocationRelativeTo(null);
    
    }
       
    public static void main(String[] args) {
    prova_cadastrofornecedor app = new prova_cadastrofornecedor();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
