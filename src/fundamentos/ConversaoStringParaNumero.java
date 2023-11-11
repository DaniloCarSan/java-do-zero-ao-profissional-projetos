package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringParaNumero {
	
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero:");
		
		String valor2 = JOptionPane.showInputDialog("Digite o segundo numero:");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double resultado = numero1+ numero2;
		
		System.out.printf("%f",resultado);
	}

}
