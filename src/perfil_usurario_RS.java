import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class perfil_usurario_RS extends JFrame{
    public JPanel perfil1;
    private JButton calculadoraDeDivisasButton;
    private JButton calculadoraIMCButton;
    public JLabel UsuarioCorreo_RS;
    private JTextField textField1;
    private String Dato;

    public perfil_usurario_RS() {
    calculadoraIMCButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame frame1 = new JFrame("Calculadora IMC");
            calculadoraIMC_ES f1 = new calculadoraIMC_ES();

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
            ConversorDivisas_RS f1 = new ConversorDivisas_RS();

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
        UsuarioCorreo_RS.setText(Dato);
    }

}
