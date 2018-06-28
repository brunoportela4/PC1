//Efetuar o cálculo e apresentar o valor de uma prestação em atraso; 
//Utilizando a formula: Prestação = valor + (valor * taxa / 100)
import javax.swing.JOptionPane;
public class prestacao {
    public static void main(String[] args) {
      double valor=0, taxa=0, prestacao=0;
      valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da prestação!"));
      taxa = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da taxa!"));
    prestacao=valor+(valor*taxa/100);
    JOptionPane.showMessageDialog(null,"O valor da prestação com a taxa será: "+prestacao);
    }
}
