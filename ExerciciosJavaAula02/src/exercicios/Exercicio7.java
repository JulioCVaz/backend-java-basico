package exercicios;

public class Exercicio7 {
	/*
	Escreva um programa que exiba todos os n�meros de 1 a 100 e a 
	cada n�mero que for m�ltiplo de 10, exiba a mensagem �M�LTIPLO DE 10�. 
	*/
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i % 10 == 0) {
				System.out.println("numero: " + i + " MULTIPLO DE 10");
			}else {
				System.out.println("numero: " + i);
			}

		}
	}

}
