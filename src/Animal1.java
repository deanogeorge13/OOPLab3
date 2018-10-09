import javax.swing.*;

public class Animal1 {
    public static void main(String[] args) {
        Animal animal = new Animal();

        String[] continents = new String[]{"Europe", "Asia", "USA", "Africa"};

        Animal animal2 = new Animal("Fish", continents, 69.0f, 20);

        JOptionPane.showMessageDialog(null, "Animal details: " + animal.toString());

        JOptionPane.showMessageDialog(null, "Animal details: " + animal2.toString());
    }
}
