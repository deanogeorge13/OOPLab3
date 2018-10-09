import javax.swing.*;

public class message1 {
    public static void main(String[] args) {
        message Message = new message("Dean", "Adam", "Hello World!");

        JOptionPane.showMessageDialog(null, Message.toString());
    }
}
