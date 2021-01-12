import java.util.Arrays;

public class ArraySimples{

	public static void main(String[] args){
	
	String[] carros = {"Honda","Subaru","Mercedes","Jaguar"};
	
	System.out.println(Arrays.toString(carros));

	Arrays.sort(carros, 0 , carros.length);
	System.out.println(Arrays.toString(carros));
	
	Double[] valores = {15.65, 75.95, 90.35};
	System.out.print(valores[0].doubleValue());
	
	}
}