import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class calculadoraIMC_ES extends JFrame{
    private JLabel peso;
    public JPanel p1;
    private JTextField textField2;
    private JButton calcularButton;
    private JLabel Altura;
    private JTextField textField1;
    private JMenu archivo;
    private JMenuItem guardar;
    private JMenuItem cerrar;
    private JMenu editar;
    private JMenuItem obscuro;
    private JLabel r1;


    public calculadoraIMC_ES() {
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String altura = textField2.getText(), peso1 = textField1.getText();
                double p = Double.parseDouble(peso1);
                double h = Double.parseDouble(altura);
                double respuesta = p/(h*h);
                JOptionPane.showMessageDialog(null,"Su IMC es: "+respuesta);
            }
        });
    }

}
