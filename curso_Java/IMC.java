import javax.swing.JOptionPane;

public class IMC{

	public static void main(String[] args){
		
		String peso = JOptionPane.showInputDialog("Informe o seu peso: ");
		String altura = JOptionPane.showInputDialog("Informe a sua altura: ");
	
		
		double pesoQuilo = Double.parseDouble(peso);
		double alturaMetro = Double.parseDouble(altura);
		
		
		double imc = pesoQuilo / (alturaMetro * alturaMetro);
		
		String msg = "O seu IMC e de "+imc;
		JOptionPane.showMessageDialog(null, msg);
	
	}

}