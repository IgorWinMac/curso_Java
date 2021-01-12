import java.util.Scanner;

public class Entrada{

	public static void main(String[] args){
	
		Scanner n = new Scanner(System.in);
		Scanner i = new Scanner(System.in);
		
		System.out.println("Qual o seu nome ?");
		String nome = n.nextLine();
		
		System.out.println("Qual a sua idade ?");
		int idade = i.nextInt();
		
		System.out.print("Bem-vindo "+nome + " e a sua idade e "+idade +" anos");
	}

}