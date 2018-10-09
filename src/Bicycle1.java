import javax.swing.*;

public class Bicycle1 {
    public static void main(String[] args) {
        String name, make, valueAsString;
        double value;

        Bicycle bicycle = new Bicycle();

        name = JOptionPane.showInputDialog("Enter name: ");

        valueAsString = JOptionPane.showInputDialog("Enter value: ");
        value = Double.parseDouble(valueAsString);

        make = JOptionPane.showInputDialog("Enter make: ");

        JOptionPane.showMessageDialog(null, bicycle.toString());

        Bicycle bicycle1 = new Bicycle(name,value,make);

        JOptionPane.showMessageDialog(null, bicycle1.toString());

        bicycle.translate(10);

        JOptionPane.showMessageDialog(null, bicycle.toString());
    }
}
