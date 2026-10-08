import java.awt.event.*;
import java.net.URL;
import javax.swing.*;
//Julian
//sep 9
//GUIExample
public class GUIExample{
    public static void main(String[] args) {
        JFrame frame = new JFrame("test");

        URL image1 = GUIExample.class.getResource("/cat.jpeg");
        ImageIcon imageIcon = new ImageIcon(image1);

        JButton button = new JButton("click here");
        button.setBounds(190, 150, 100, 50);

        JTextArea text = new JTextArea("Enter here");
        text.setBounds(190, 230, 100, 20);

        JTextField textF = new JTextField("Text field");
        textF.setBounds(10, 50, 100, 25);

        JLabel results = new JLabel("Results here");
        results.setBounds(10, 200, 200,50);

        JLabel label = new JLabel("dont click me");
        label.setBounds(205, 120, 100, 10);

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                String msg = textF.getText();
                results.setText("you entered "+ msg);
            }
        });


        frame.add(results);
        frame.add(textF);
        frame.add(text);
        frame.add(label);
        frame.add(button);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}