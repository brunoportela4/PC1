package slides;

import javax.swing.JOptionPane;

public class exerc2 {
	public static void main (String[]args){
		double vnum[]=new double [5];
		double md=0,acum=0;
		int qntd=0,i=0,l=0;
		for(i=0;i<=4;i++){
			l=i+1;vnum[1]=Double.parseDouble(JOptionPane.showInputDialog("digite o "+ 1 +"º número"));
		acum+=vnum[1];
		}
	md=acum/5;
	for(i=0;i<=4;i++){
		if(vnum[i]>md){
			qntd++;
		}
	}
	JOptionPane.showMessageDialog(null,"A medida é: "+md+"\nA quantidade de valores acima da média é: "+qntd);
	
	}
}