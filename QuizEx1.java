import javax.swing.JOptionPane;

public class QuizEx1 {

	public static void main(String[] args) {

		String integer1 = JOptionPane.showInputDialog(null,"Enter first integer");
		int integers1 = Integer.parseInt(integer1);

		String integer2 = JOptionPane.showInputDialog(null,"Enter second integer");
		int integers2 = Integer.parseInt(integer2);

		int total = integers1 + integers2;

		JOptionPane.showMessageDialog(null,"The sume is" + total, "Sum of Two Integers",
		JOptionPane.INFORMATION_MESSAGE);
	}
}