package exercicios;

public class Exercicio1 {

	public static void main(String[] args) {
		int numberTwo = 250;
		
		for(int numberOne  = 11; numberOne <= numberTwo; numberOne++) {
			if(numberOne % 2 == 0) {
				System.out.println("Numero par: " + numberOne);
			}
		}

	}

}
