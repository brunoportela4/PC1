import javax.swing.JOptionPane;
	public class ex3_2 {
		public static void main(String[]args){
		double b=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da base:"));
		double a=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da altura:"));
		double area=0;
		area=(b*a)/2;
	JOptionPane.showMessageDialog(null,"O valor da áre do triângulo equilátero é: "+area);			
		}
	}
