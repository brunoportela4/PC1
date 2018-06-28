//Um armazém possui 100 mercadorias identificadas de 1 a 100. 
//A quantidade de  mercadorias vendidas está armazenada em um vetor (qtd[100]), assim como o  preço. 
//Durante 1 mês. Carregar a quantidade e o preço nos vetores. Calcular  o faturamento mensal segundo:
//Faturamento = Somatória (i de 1 até 100) de Preço[i] * qtd[i] )
import javax.swing.JOptionPane;
public class armazem {
    public static void main(String[] args) {
        int qtd[] = new int [5];
        double preco[] = new double [5];
        double fatu = 0;
        int l=0;
        for (int i = 0; i < 5; i++)
        {
            l = i + 1;
            qtd[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do " + l + "º produto!"));
            preco[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o preço do " + l + "º produto!"));
            fatu=fatu+(preco[i]*qtd[i]);
        }    
        JOptionPane.showMessageDialog(null,"O faturamento é R$" + fatu + "!");
        }
}
