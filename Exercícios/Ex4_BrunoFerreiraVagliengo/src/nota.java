//Ler 4 notas de um aluno. Calcule e exiba a média aritmética e a  descrição: 
//MD >= 6 -> "Aprovado";
//MD < 3 -> "Retido"; 
//MD >= 3 e < 6 ->  * "Exame" 
import javax.swing.JOptionPane;
public class nota {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4,MD;
        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota!"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota!"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a terceira nota!!"));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quarta nota!"));
        MD = (nota1 + nota2 + nota3 + nota4)/4;
        if (MD <3){
            JOptionPane.showMessageDialog(null,"Retido!");
        }
        if (MD >=3 && MD<6){
            JOptionPane.showMessageDialog(null,"Exame!");
        }
        if (MD >=6){
            JOptionPane.showMessageDialog(null,"Aprovado!");
        }
    }
    
}
