import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter extends JFrame {
    private JPanel mainForm;
    private JTextField textFieldC;
    private JTextField textFieldF;

    public TemperatureConverter(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setPreferredSize(new Dimension(400,400));
        this.setContentPane(mainForm);
        this.pack();

        textFieldC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textFieldC.getText();
                double c = Double.parseDouble(input);
                double output = (c * 9 / 5) + 32;
                //System.out.println(output);
                textFieldF.setText(String.valueOf(output));
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new TemperatureConverter("My JFrame");
        frame.setVisible(true);
    }
}
