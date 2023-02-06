import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
public class ConvertidorUnidades {
    JPanel conversorPanel;
    private JMenu archivo;
    private JMenuItem guardar;
    private JMenuItem cerrar;
    private JMenu editar;
    private JMenuItem obscuro;
    private JTextField txt_dato1;
    private JComboBox TipoU;
    private JComboBox comboBoxUnidad1;
    private JComboBox comboBoxUnidad2;

    private JButton conversorButton;
    private JLabel resultadoUnid;
    private String Tipo;


    public ConvertidorUnidades() {

        TipoU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBoxUnidad1 = (JComboBox) e.getSource();
                comboBoxUnidad2 = (JComboBox) e.getSource();
                String selectedOption = (String) comboBoxUnidad1.getSelectedItem();
                String selectedOption1 = (String) comboBoxUnidad2.getSelectedItem();
                if (selectedOption.equals(1) && selectedOption1.equals(1)) {
                    String[] SubOpciones = {"Metro", "Decimetro", "Kilometro",
                            "Centimetro", "Milimetro", "Milla", "Yarda", "Pie"};
                    TipoU.removeAllItems();
                    for (String SubOpcion : SubOpciones) {
                        TipoU.addItem(SubOpcion);
                    }
                } else if (selectedOption.equals(2) && selectedOption1.equals(2)) {
                    String[] SubOpciones = {"Tonelada", "Kilogramo", "Gramo",
                            "Miligramo", "Stone", "Libra", "Onza"};
                    TipoU.removeAllItems();
                    for (String SubOpcion : SubOpciones) {
                        TipoU.addItem(SubOpcion);
                    }
                } else if (selectedOption.equals(3) && selectedOption1.equals(3)) {
                    String[] SubOpciones = {"Grado Celsius", "Kelvin", "Grado Fahrenheit"};
                    TipoU.removeAllItems();
                    for (String SubOpcion : SubOpciones) {
                        TipoU.addItem(SubOpcion);
                    }
                } else if (selectedOption.equals(4) && selectedOption1.equals(4)) {
                    String[] SubOpciones = {"Hercio", "Kilohercio", "Megahercio", "Gigahercio"};
                    TipoU.removeAllItems();
                    for (String SubOpcion : SubOpciones) {
                        TipoU.addItem(SubOpcion);
                    }
                } else {
                    String[] SubOpciones = {" "};
                    TipoU.removeAllItems();
                    for (String SubOpcion : SubOpciones) {
                        TipoU.addItem(SubOpcion);
                    }
                }
            }
        });
        conversorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                double valor = Double.parseDouble(txt_dato1.getText());
                int unidad_Ini = comboBoxUnidad1.getSelectedIndex();
                int Unidad_Fin = comboBoxUnidad2.getSelectedIndex();

                Operaciones_de_Conversion OP = new Operaciones_de_Conversion();

                OP.setValor(valor);
                OP.setUnidad_Ini(unidad_Ini);
                OP.setUnidad_Fin(Unidad_Fin);

                double convertido = OP.covertir_Unid();

                resultadoUnid.setText(String.valueOf(convertido));
            }
        });
    }

}
