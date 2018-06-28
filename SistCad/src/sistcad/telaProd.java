package sistcad;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.table.DefaultTableModel;

public class telaProd extends JFrame {

    JButton limpar = new JButton("Limpar");
    JButton cadastrar = new JButton("Cadastrar");
    JButton fechar = new JButton("Fechar");
    JLabel tituloProd = new JLabel("CADASTRO DE PRODUTOS");
    JLabel nomeProd = new JLabel("Nome:");
    JLabel codProd = new JLabel("Código de barras:");
    JLabel precoProd = new JLabel("Preço (unidade):");
    JLabel descProd = new JLabel("Descrição:");
    JLabel loteProd = new JLabel("Lote:");
    JLabel valProd = new JLabel("Validade:");
    JLabel quantProd = new JLabel("Quantidade:");
    JTextField cnomeProd = new JTextField();
    JTextField ccodProd = new JTextField();
    JTextField cprecoProd = new JTextField();
    JTextField cdescProd = new JTextField();
    JTextField cloteProd = new JTextField();
    JTextField cquantProd = new JTextField();
    MaskFormatter mascval;
    JTable tabela;
    Object[][][][] coluna = {};
    String[] linha = {"Produto", "Quantidade", "Preço", "Total"};
    JScrollPane painel;
    
    Color cor = new Color(238, 232, 170);

    public telaProd() {
        super("Cadastro de produtos");
        Container tela4 = getContentPane();
        setLayout(null);

        try {
            mascval = new MaskFormatter("##/##/####");
            mascval.setPlaceholderCharacter('_');
        } catch (ParseException excp) {
        }

        JFormattedTextField cvalProd = new JFormattedTextField(mascval);

        tabela = new JTable();
        tabela.setModel(new DefaultTableModel(coluna, linha));
        painel = new JScrollPane(tabela);

        limpar.setBounds(210, 310, 100, 20);
        cadastrar.setBounds(90, 310, 100, 20);
        fechar.setBounds(330, 310, 100, 20);
        tituloProd.setBounds(200, 20, 200, 20);
        nomeProd.setBounds(30, 60, 100, 20);
        codProd.setBounds(30, 90, 100, 20);
        precoProd.setBounds(30, 120, 100, 20);
        descProd.setBounds(30, 150, 100, 20);
        loteProd.setBounds(30, 230, 100, 20);
        valProd.setBounds(30, 200, 100, 20);
        quantProd.setBounds(30, 260, 100, 20);
        cnomeProd.setBounds(135, 60, 200, 20);
        cdescProd.setBounds(135, 150, 200, 20);
        cloteProd.setBounds(135, 230, 100, 20);
        cprecoProd.setBounds(135, 120, 100, 20);
        ccodProd.setBounds(135, 90, 100, 20);
        cvalProd.setBounds(135, 200, 70, 20);
        cquantProd.setBounds(135, 260, 100, 20);
        painel.setBounds(10, 350, 500, 100);
        cadastrar.setBackground(new Color(238, 232, 170));
        fechar.setBackground(new Color(238, 232, 170));
        limpar.setBackground(new Color(238, 232, 170));
        
        painel.getViewport().setBackground(new Color(0xFFFFFF));
        
        tela4.setBackground(new Color(176, 196, 222));
        tela4.add(limpar);
        tela4.add(cadastrar);
        tela4.add(fechar);
        tela4.add(tituloProd);
        tela4.add(nomeProd);
        tela4.add(codProd);
        tela4.add(precoProd);
        tela4.add(descProd);
        tela4.add(loteProd);
        tela4.add(valProd);
        tela4.add(quantProd);
        tela4.add(cnomeProd);
        tela4.add(cdescProd);
        tela4.add(cloteProd);
        tela4.add(cprecoProd);
        tela4.add(ccodProd);
        tela4.add(cvalProd);
        tela4.add(cquantProd);
        tela4.add(painel);

        cadastrar.addActionListener((ActionEvent e) -> {
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();

            String nProd = cnomeProd.getText();

            int nQuant = Integer.parseInt(cquantProd.getText());

            double nPrec = Double.parseDouble(cprecoProd.getText());
            double nTotal = nQuant * nPrec;

            Object[] inse = new String[]{nProd, Integer.toString(nQuant), Double.toString(nPrec), Double.toString(nTotal)};

            model.addRow(inse);

            cnomeProd.setText(null);
            ccodProd.setText(null);
            cprecoProd.setText(null);
            cdescProd.setText(null);
            cloteProd.setText(null);
            cquantProd.setText(null);
            cvalProd.setText(null);
        });

        fechar.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                telaProd.this.dispose();
            }
        }
        );

        limpar.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cnomeProd.setText(null);
                ccodProd.setText(null);
                cprecoProd.setText(null);
                cdescProd.setText(null);
                cloteProd.setText(null);
                cquantProd.setText(null);
                cvalProd.setText(null);
            }
        }
        );

        setVisible(true);
        setSize(550, 550);
        setLocationRelativeTo(null);

    }
}
