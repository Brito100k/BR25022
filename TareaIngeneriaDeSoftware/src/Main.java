import javax.swing.*;

public class Main extends JFrame {

    public Main() {
        setTitle("Ingeniería de Software");
        setLayout(null);

        JLabel texto0 = new JLabel("Nombre: Elmer Brito");
        texto0.setBounds(10, 10, 200, 25);
        add(texto0);

        JLabel texto1 = new JLabel("Carnet: BR25022");
        texto1.setBounds(10, 40, 200, 25);
        add(texto1);

        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
