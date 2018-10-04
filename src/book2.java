import javax.swing.*;

public class book2 {
    public static void main(String[] args) {
        Book book2 = new Book();

        book2.setTitle(JOptionPane.showInputDialog("Enter title: "));

        book2.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Enter price: ")));

        book2.setISBN(JOptionPane.showInputDialog("Enter ISBN: "));

        book2.setNoOfPages(Integer.parseInt(JOptionPane.showInputDialog("Enter the num of pages: ")));

        JOptionPane.showMessageDialog(null, book2.toString());
    }
}
