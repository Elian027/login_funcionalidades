import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{


    private JPanel login;
    private JTextField usu;
    private JPasswordField pass;
    private JButton ingresarButton;



    public  Login() {
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usu. getText();
                String contraseña = pass.getText();


                if (usuario.isEmpty() || contraseña.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Complete todos los campos");
                }else {
                    if (usuario.equals("Elian Moreira") && contraseña.equals("Elian123")) {

                        JFrame frame2 = new JFrame("Perfil 1"); //Creaccion de un objeto que nos ayudara a utilizar las instancias del formulario 2
                        perfil_usuario p1 = new perfil_usuario();

                        p1.setDato(usu.getText());
                        p1.setDato1("Elian -- Moreira ---");
                        p1.setFoto("imagenes/foto2.jpg");
                        frame2.setSize(500, 500);
                        frame2.setContentPane(p1.perfil1);
                        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame2.pack();
                        frame2.setLocationRelativeTo(null);
                        frame2.setVisible(true);
                        dispose();

                    } else if (usuario.equals("Jose Panchi") && contraseña.equals("Jose123")) {
                        JFrame frame2 = new JFrame("Perfil 2"); //Creaccion de un objeto que nos ayudara a utilizar las instancias del formulario 2
                        perfil_usuario p2 = new perfil_usuario();

                        p2.setDato(usu.getText());
                        p2.setDato1("Jose Rafael Panchi Melo");
                        p2.setFoto("imagenes/foto1.jpg");
                        frame2.setSize(500, 500);
                        frame2.setContentPane(p2.perfil1);
                        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame2.pack();
                        frame2.setLocationRelativeTo(null);
                        frame2.setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Su usuario o contraseña es incorrecto");
                    }
                }
            }
        });

    }

    public static void main(String[] arg) {
        JFrame frame1 = new JFrame("Inicia sesión");
        Login f1 = new Login();

        frame1.setContentPane(f1.login);
        frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame1.pack();
        frame1.setSize(400, 350);
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
    }
}
