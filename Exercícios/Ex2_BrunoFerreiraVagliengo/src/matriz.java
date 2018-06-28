//Criar e carregar uma matriz (5,5) inteiro. Calcular e exibir:
//- A soma dos nºs pares e positivos.
//- Quantidade de nºs impares (positivos e negativos).
import javax.swing.JOptionPane;
public class matriz {
    public static void main(String[] args) {
        int matriz[][] = new int [2][2];
        int i=0,j=0,somap=0,qtdim=0;
        for (i = 0; i < 2; i++)
        {
        for (j = 0; j < 2; j++)
        {
            matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número!"));
            if(matriz[i][j] % 2 == 0 && matriz[i][j] >=0){
            somap += matriz[i][j];
            }
            else{
                if(matriz[i][j] % 2 ==1){
                qtdim +=1;
                }
            }
        } 
        }
        JOptionPane.showMessageDialog(null,"A quantidade de números ímpares é " + qtdim + "!");
        JOptionPane.showMessageDialog(null,"A soma dos números pares positivos é " + somap + "!");
        }
}
