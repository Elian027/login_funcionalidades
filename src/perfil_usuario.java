import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class perfil_usuario extends JFrame {
    public JPanel perfil1;
    private JButton calculadoraDeDivisasButton;
    private JButton calculadoraIMCButton;
    public JLabel UsuarioIng;
    public JLabel Jlabel_Nombre;
    private JLabel Jlabelfoto;
    private String Dato;

    public perfil_usuario() {
        calculadoraIMCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame1 = new JFrame("Calculadora IMC");
                calculadoraIMC f1 = new calculadoraIMC();
                frame1.setContentPane(f1.p1);
                frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frame1.pack();
                frame1.setSize(400, 400);
                frame1.setLocationRelativeTo(null);
                frame1.setVisible(true);
            }
        });
        calculadoraDeDivisasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame1 = new JFrame("Calculadora Divisas");
                ConversorDivisas f1 = new ConversorDivisas();
                frame1.setContentPane(f1.divisasPanel);
                frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frame1.pack();
                frame1.setSize(400, 400);
                frame1.setLocationRelativeTo(null);
                frame1.setVisible(true);
            }
        });
    }
    public void setDato(String Dato){
        this.Dato = Dato;
        UsuarioIng.setText(Dato);
    }

}
