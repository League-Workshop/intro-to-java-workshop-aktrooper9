package section3;
import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name1=JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello "+name1);
			
	}
}
