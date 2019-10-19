import javax.swing.*;
	public class Initials{
		public static void main (String pogi []){
		
		String FirstName = "";
		String MiddleName = "";
		String LastName = "";
		
		FirstName = JOptionPane.showInputDialog(null, "Enter your first name's Initial: ");
		MiddleName = JOptionPane.showInputDialog(null, "Enter your Middle name's Initial: ");
		LastName = JOptionPane.showInputDialog(null, "Enter your Last name's Initial: ");
		JOptionPane.showMessageDialog(null, FirstName + "." + MiddleName + "." + LastName + ".");
	}
}