package src.Lab01;

import javax.swing.JOptionPane;

public class Caculate {
	public static void main(String args[]) {
		String strNum1, strNum2;
		String strNotification = "You've just entered: ";
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 + " and ";
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum2;
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		Double sum = num1 + num2;
		Double difference = num1 - num2;
		Double product = num1 * num2;
		strNotification += "\nSum: " + sum + "\nDifference: " + difference + "\nProduct: " + product + "\nQuotient: ";
		if (num2 == 0)
			strNotification += "divisor is equal to zero";
		else
			strNotification += (num1 / num2);
		JOptionPane.showMessageDialog(null, strNotification, "Caculate", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
