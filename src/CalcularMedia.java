import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularMedia extends JFrame {
    private JTextField txtNOTA1;
    private JTextField txtNOTA2;
    private JButton CALCULARMÉDIAButton;
    private JLabel lblSITUACAO;
    private JLabel lblMEDIA;

public  CalcularMedia(JPanel){
    setTitle("Calcular Media");
    setSize(350, 600);
    setVisible(true);
}




public CalcularMedia() {
    CALCULARMÉDIAButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            lblMEDIA+=(txtNOTA1+txtNOTA2/ 2);
            if(lblMEDIA >= 7 ){
                lblSITUACAO.setText("Aprovado");
            }else lblSITUACAO.setText("Reprovado!");
        }
    });
}
}
