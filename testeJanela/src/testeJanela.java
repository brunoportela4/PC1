import javax.swing.*;
public class testeJanela extends JFrame{
public testeJanela(){
    super("Maximizada");
    //super("Minimizada");
    //super("Não redimensionável");
    //super("Centralizada");
    //super("Normal");
    setSize(300,150);
    setVisible(true);
    setResizable(false);
    setLocationRelativeTo(null);
    //setExtendedState(MAXIMIZED_BOTH);
    //setExtendedState(ICONIFIED);
}
    public static void main(String[] args) {
        testeJanela janela1 = new testeJanela();
        janela1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
