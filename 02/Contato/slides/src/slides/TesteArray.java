package slides;

//declara uma classe p�blica chamada TesteArray 
public class TesteArray {
	//declara pacote de extens�o do n�cleo de Java
	public static void main (String args[]) {
		//
		int[] idades = new int[10];
		//
		for (int i = 0; i< 10; i++) {
			//
			idades[i] = i*10;
		}
		//
		for (int i = 0; i <10; i++) {
			//
			System.out.println(idades[i]);
		}
	}
}