import javax.swing.*;
public class JoptionPEx{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "hello");
        String name = JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null,"hey " + name);
    }
}