import javax.swing.*;

public class MyPoint1 {
    public static void main(String[] args) {
        MyPoint point = new MyPoint();

        MyPoint point1 = new MyPoint(420,69);

        JOptionPane.showMessageDialog(null, point.toString());

        JOptionPane.showMessageDialog(null, point1.toString());

        point1.moveHorizontally(20);

        JOptionPane.showMessageDialog(null, point1.toString());

        point1.moveVertically(65);

        JOptionPane.showMessageDialog(null, point1.toString());

        point1.translate(25,90);

        JOptionPane.showMessageDialog(null, point1.toString());

        JOptionPane.showMessageDialog(null, "Distance from origin: " + point1.distanceFromOrigin());
    }
}
