package exercicios;
import java.util.Scanner;

public class Exercicios9 {
	/*
	Escreva um programa que leia vários números inteiros e ao final informe quantos 
	números pares, quantos números ímpares, quantos números positivos e quantos números negativos foram digitados pelo usuário.
	O programa só deve parar de rodar quando o usuário 
	responder "S" na seguinte pergunta, "Deseja encerrar o programa?". 
	
	*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double array[] = new double[5];
		double lista[] = new double[5];
		double pares = 0;
		double impares = 0;
		double negativos = 0;
		double positivos = 0;
		double igualzero = 0;
		
		String resposta;
		
		for(int i= 1; i <= array.length; i++){
			
				System.out.println("Digite o "+i+" valor: ");
				array[i] = scan.nextDouble();
				
//				System.out.println("Deseja encerrar o programa ? (S/N): ");
//				resposta = scan.next();
//				if(resposta.equals("S")) {
//					System.out.println("Sistema parou!");
//					for(int y = 0; y <= array.length; y++) {
//						lista[y] = array[y];
//						if(array[y] % 2 == 0) {
//							pares = pares + array[y];
//						}
//						else if(array[y] % 3 == 0) {
//							impares = impares + array[y];
//						}else if(array[y] == 0) {
//							igualzero = igualzero + array[y];
//						}else if(array[y] < 0) {
//							negativos = negativos + array[y];
//						}else if(array[y] > 0) {
//							positivos = positivos + array[y];
//						}
//					}
////					break;
//				}else {
//					continue;
//				}
//			}
//			break;
			
			
			
			
//		System.out.println("\nQuantidade de pares: " + pares +
//							"\nQuantidade de impares: " + impares +
//							"\nQuantidade de negativos: " + negativos +
//							"\nQuantidade de positivos: " + positivos +
//							"\nQuantidade de iguais a zero: " + igualzero);
		
		
		
		}
		System.out.println(array[0]);
	}
}
