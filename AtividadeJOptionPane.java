import javax.swing.JOptionPane;

 public class Calculator {

 	public static void main (String[] args){
 		String enter1 = JOptionPane.showInputDialog("Digite um numero : ");

 		String enter2 = JOptionPane.showInputDialog("Digite	outro numero : ");

 			double n1 = Double.parseDouble(enter1);
 			double n2 = Double.parseDouble(enter2);

 			double soma = n1 + n2;

 		JOptionPane.showMessageDialog(null, "A soma dos numeros eh : "+ soma);
 	}
 }