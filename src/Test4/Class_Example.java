package Test4;

	import javax.swing.JOptionPane;
	public class Class_Example {
	public static void main(String[] args) {
	String in = JOptionPane.showInputDialog("Scores from studnets");
	try {
	int value = Integer.parseInt(in);
	if(value<=100 && value>=0)
	{
	int score = Integer.parseInt(in);
	String grade;
	int category = score/10;
	if(category>=9) {
	grade = "A";
	} else if (category>=8) {
	grade = "B";
	} else if (category>=7) {
	grade = "C";
	} else if (category>=6) {
	grade = "D";
	} else {
	grade = "F";
	}
	JOptionPane.showMessageDialog(null, "Grade : " + grade);
	}
	else {
	System.out.println("Error");
	}
	} catch(NumberFormatException e) {
	JOptionPane.showMessageDialog(null, "Error: Please enter a valid integer");
	}
	}
	}

