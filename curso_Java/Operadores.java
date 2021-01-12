import java.util.Scanner;

public class Operadores{

	public static void main(String[] args){
	
		
		Scanner r = new Scanner(System.in);
		System.out.print("Informe o raio: ");
		double raio = r.nextDouble();
		
		
		//Diametro
		double diametro = 2 * raio;
		System.out.println("Diametro ="+diametro);
		
		//Area
		double pi = Math.PI;
		double area = pi * (raio * raio);
		System.out.println("Area ="+area);
		
		//Circunferência
		double circunferencia = 2 * pi * raio;
		System.out.println("Circunferencia ="+circunferencia);
		
		
	}

}