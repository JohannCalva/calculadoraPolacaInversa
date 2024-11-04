import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazPolacaInversa {
    private JPanel PolacaInv;
    private JTextField txtEntrada;
    private JTextArea txtResultado;
    private JButton calcularButton;

    public PolacaInversa polaca = new PolacaInversa();

    public InterfazPolacaInversa() {
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String operacion = txtEntrada.getText();
                try{
                    polaca.calcular(operacion, txtResultado);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Operacion invalida");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("InterfazPolacaInversa");
        frame.setContentPane(new InterfazPolacaInversa().PolacaInv);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
