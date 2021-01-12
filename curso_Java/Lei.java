public class Lei{

	public static void main(String[] args){
	
		int anterior = 0;
		int proximo = 1;
		
		while(proximo < 50){
			System.out.println(proximo);
			anterior = proximo - anterior;
			proximo = proximo + anterior;
		}
	}
}