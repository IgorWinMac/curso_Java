import java.util.Scanner;
import java.util.ArrayList;

public class Corrida{

	public static void main(String[] args){
	
		ArrayList<String> produtos = new ArrayList<String>();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Faca aqui a sua lista e ao terminar digite Fim");
		
		String produto;
		
		while(!"Fim".equals(produto = s.nextLine())){
			produtos.add(produto);
		}
		System.out.println(produtos.toString());
	}
}