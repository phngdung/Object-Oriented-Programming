package hust.soict.hedspi.lab01;

import javax.swing.JOptionPane;

public class Equation {
	public static void main(String[] args) {
		String stra, strb, strc;
		String result;
		do {
			String choice = JOptionPane.showInputDialog(null,
					"1. Giáº£i phÆ°Æ¡ng trÃ¬nh báº­c nháº¥t 1 biáº¿n dáº¡ng ax+b=0"
							+ "\n2. Giáº£i phÆ°Æ¡ng trÃ¬nh báº­c nháº¥t 2 biáº¿n dáº¡ng ax+by+c=0"
							+ "\n3. Giáº£i phÆ°Æ¡ng trÃ¬nh báº­c hai 1 biáº¿n dáº¡ng ax^2+bx+c=0" + "\nNháº­p lá»±a chá»�n: ",
					"Má»�i báº¡n chá»�n", JOptionPane.INFORMATION_MESSAGE);
			System.out.print(choice);
			if (choice.equals("1")) {
				stra = JOptionPane.showInputDialog(null, "Má»�i nháº­p a: ", "Nháº­p a", JOptionPane.INFORMATION_MESSAGE);
				strb = JOptionPane.showInputDialog(null, "Má»�i nháº­p b: ", "Nháº­p b", JOptionPane.INFORMATION_MESSAGE);
				double a = Double.parseDouble(stra);
				double b = Double.parseDouble(strb);
				if (a == 0 && b == 0) {
					result = "PhÆ°Æ¡ng trÃ¬nh nghiá»‡m Ä‘Ãºng vá»›i má»�i x";
				} else if (a == 0) {
					result = "PhÆ°Æ¡ng trÃ¬nh vÃ´ nghiá»‡m";
				} else {
					result = "PhÆ°Æ¡ng trÃ¬nh cÃ³ nghiá»‡m duy nháº¥t: x = " + b / a;
				}
				JOptionPane.showMessageDialog(null, result, "Káº¿t quáº£", JOptionPane.INFORMATION_MESSAGE);
				break;
			} else if (choice.equals("2")) {
				stra = JOptionPane.showInputDialog(null, "Má»�i nháº­p a: ", "Nháº­p a", JOptionPane.INFORMATION_MESSAGE);
				strb = JOptionPane.showInputDialog(null, "Má»�i nháº­p b: ", "Nháº­p b", JOptionPane.INFORMATION_MESSAGE);
				strc = JOptionPane.showInputDialog(null, "Má»�i nháº­p c: ", "Nháº­p c", JOptionPane.INFORMATION_MESSAGE);
				double a = Double.parseDouble(stra);
				double b = Double.parseDouble(strb);
				double c = Double.parseDouble(strc);
				if (a == 0) {
					if (b == 0) {
						if (c == 0) {
							result = "PhÆ°Æ¡ng trÃ¬nh nghiá»‡m Ä‘Ãºng vá»›i má»�i x,y";
						} else {
							result = "PhÆ°Æ¡ng trÃ¬nh vÃ´ nghiá»‡m";
						}
					} else {
						result = "PhÆ°Æ¡ng trÃ¬nh cÃ³ nghiá»‡m: x báº¥t kÃ¬, y = " + c / b;
					}
				} else {
					if (b == 0) {
						result = "PhÆ°Æ¡ng trÃ¬nh cÃ³ nghiá»‡m: x = " + c / a + ", y báº¥t kÃ¬";
					} else {
						if (c == 0) {
							result = "PhÆ°Æ¡ng trÃ¬nh vÃ´ sá»‘ nghiá»‡m x = " + (-b / a) + "*c";
						} else {
							if (b > 0)
								result = "PhÆ°Æ¡ng trÃ¬nh vÃ´ sá»‘ nghiá»‡m x = (" + (-c) + "-" + b + "y)/" + a;
							else {
								result = "PhÆ°Æ¡ng trÃ¬nh vÃ´ sá»‘ nghiá»‡m x = (" + (-c) + "+" + b + "y)/" + a;
							}
						}
					}
				}
				JOptionPane.showMessageDialog(null, result, "Káº¿t quáº£", JOptionPane.INFORMATION_MESSAGE);
				break;
			} else if (choice.equals("3")) {
				stra = JOptionPane.showInputDialog(null, "Má»�i nháº­p a: ", "Nháº­p a", JOptionPane.INFORMATION_MESSAGE);
				strb = JOptionPane.showInputDialog(null, "Má»�i nháº­p b: ", "Nháº­p b", JOptionPane.INFORMATION_MESSAGE);
				strc = JOptionPane.showInputDialog(null, "Má»�i nháº­p c: ", "Nháº­p c", JOptionPane.INFORMATION_MESSAGE);
				double a = Double.parseDouble(stra);
				double b = Double.parseDouble(strb);
				double c = Double.parseDouble(strc);
				if (a == 0) {
					if (b == 0) {
						if (c == 0) {
							result = "PhÆ°Æ¡ng trÃ¬nh vÃ´ sá»‘ nghiá»‡m";
						} else {
							result = "PhÆ°Æ¡ng trÃ¬nh vÃ´ nghiá»‡m";
						}
					} else {
						result = "PhÆ°Æ¡ng trÃ¬nh cÃ³ nghiá»‡m duy nháº¥t: " + "x = " + (-c / b);
					}
				} else {
					double delta = (b * b - 4 * a * c);
					double x1;
					double x2;

					if (delta > 0) {
						x1 = ((-b + Math.sqrt(delta)) / (2 * a));
						x2 = ((-b - Math.sqrt(delta)) / (2 * a));
						result = "PhÆ°Æ¡ng trÃ¬nh cÃ³ 2 nghiá»‡m lÃ : " + "x1 = " + x1 + " vÃ  x2 = " + x2;
					} else if (delta == 0) {
						x1 = (-b / (2 * a));
						result = "PhÆ°Æ¡ng trÃ¬nh cÃ³ nghiá»‡m kÃ©p: " + "x1 = x2 = " + x1;
					} else {
						result = "PhÆ°Æ¡ng trÃ¬nh vÃ´ nghiá»‡m";
					}
				}
				JOptionPane.showMessageDialog(null, result, "Nghiá»‡m cá»§a phÆ°Æ¡ng trÃ¬nh", JOptionPane.INFORMATION_MESSAGE);
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Vui lÃ²ng nháº­p láº¡i!!!!", "Error", JOptionPane.INFORMATION_MESSAGE);
			}
		} while (true);
	}
}
