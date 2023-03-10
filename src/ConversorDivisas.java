import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorDivisas {
    public JPanel divisasPanel;
    private JTextField txt_dato;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton convertirButton;
    private JLabel resultado;


    public ConversorDivisas() {
        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor = Double.parseDouble(txt_dato.getText());
                int divisa1 = comboBox1.getSelectedIndex();
                int divisaFinal = comboBox2.getSelectedIndex();

                operaciones_Divisas OP = new operaciones_Divisas();

                OP.setValor(valor);
                OP.setDivisa1(divisa1);
                OP.setDivisaFinal(divisaFinal);

                double convertido = OP.covertir();

                resultado.setText(String.valueOf(convertido));
            }
        });
    }

}
