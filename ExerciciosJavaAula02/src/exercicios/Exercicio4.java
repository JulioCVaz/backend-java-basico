package exercicios;
import java.util.Scanner;

public class Exercicio4 {
	
	/* Escreva um programa que exiba na tela a quantidade 
	de n�meros �mpares existentes entre dois n�meros 
	que o usu�rio digitar (testar inclusive os n�meros digitados). */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int menor;
		int maior;
//		int[] array = new int[100];
		int cont = 0;
		
		
		
		
		System.out.println("Digite o primeiro valor: ");
		menor = scan.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		maior = scan.nextInt();
		
		
		for(int x = menor; x <= maior; x++) {
			if(x % 2 == 1) {
				System.out.println("numeros impares" + x);	
				cont++;
			}
		}
		
		System.out.println("quantidade de valores impares " + cont);
	}
}
