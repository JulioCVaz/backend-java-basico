package exercicios;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Exercicio6 {
	/*
	Escreva um programa que calcule e exiba a m�dia de 
	10 notas digitadas pelo usu�rio. Considerar notas 
	v�lidas, somente valores entre 0 (zero) e 10 (dez). Se o usu�rio digitar algum valor
	inv�lido, dever� ser exibida uma mensagem informando o ocorrido. 
	*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final JPanel panel = new JPanel();
		 
		
		int portugues;
		int matematica;
		int informatica;
		int soma = 0;
		int[] port = new int[3];
		int[] mat = new int[3];
		int[] inf = new int[4];
		String materia;
		
		
		System.out.println("Digite a materia desejada(port, mat ou inf): ");
		materia=scan.next();
		
		if(materia.equals("port")){
			for(int i = 0 ; i < port.length; i++) {
				System.out.println("Digite a nota do " + i + " Semestre: ");
				portugues = scan.nextInt();
				if(portugues <= 10 && portugues > 0) {
					port[i] = portugues;
				}else {
					JOptionPane.showMessageDialog(panel, "Valor incorreto", "Warning", JOptionPane.WARNING_MESSAGE);
				}
				soma = soma + port[i];
			}
			
			int calculoPort = soma/port.length;
			
			
			System.out.println("M�dia Portugu�s: " + calculoPort);
		}
		
		if(materia.equals("mat")){
			for(int i = 0 ; i < mat.length; i++) {
				System.out.println("Digite a nota do " + i + " Semestre: ");
				matematica = scan.nextInt();
				if(matematica <= 10 && matematica > 0) {
					mat[i] = matematica;
				}else {
					JOptionPane.showMessageDialog(panel, "Valor incorreto", "Warning", JOptionPane.WARNING_MESSAGE);
				}
				soma = soma + mat[i];
			}
			
			int calculoMat = soma/mat.length;
			
			
			System.out.println("M�dia Matematica: " + calculoMat);
		}
		
		if(materia.equals("inf")){
			for(int i = 0 ; i < inf.length; i++) {
				System.out.println("Digite a nota do " + i + " Semestre: ");
				informatica = scan.nextInt();
				if(informatica <= 10 && informatica > 0) {
					inf[i] = informatica;
				}else {
					JOptionPane.showMessageDialog(panel, "Valor incorreto", "Warning", JOptionPane.WARNING_MESSAGE);
				}
				soma = soma + inf[i];
			}
			
			int calculoInf = soma/inf.length;
			
			
			System.out.println("M�dia Informatica: " + calculoInf);
		}

	}

}
