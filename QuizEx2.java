import javax.swing.JOptionPane;

public class QuizEx2 {

    public static void main(String[] args) {

        String integer1 = JOptionPane.showInputDialog(null, "Enter first integer:");
        int integers1 = Integer.parseInt(integer1);

        String integer2 = JOptionPane.showInputDialog(null, "Enter second integer:");
        int integers2 = Integer.parseInt(integer2);

        String integer3 = JOptionPane.showInputDialog(null, "Enter third integer:");
        int integers3 = Integer.parseInt(integer3);

        int total = integers1 * integers2 * integers3;

        JOptionPane.showMessageDialog(null, "The product is " + total);

    }
}