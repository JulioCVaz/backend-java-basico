package br.edu.eteczl.mvn_web_app.aulareader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.awt.List;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;



public class App 
{
	public void inserir(String texto) throws IOException {
		//Inserir
		 FileWriter arq = new FileWriter("d:\\git.txt", true); // esse true é um outro parametro para nao reescrever
		 PrintWriter gravarArq = new PrintWriter(arq);
		 
		 for(int i=0; i <= 10; i++) {
			 gravarArq.println(texto); 			 
		 }
		 arq.close();
	}
	
	public void leitura(String texto) throws IOException {
		String resp;
		String newname;
		boolean wpt = true;
		
		//Leitura
		 FileReader arqleitura = new FileReader("d:\\git.txt");
		 BufferedReader lerArq = new BufferedReader(arqleitura);
	 
	     String linha = lerArq.readLine(); 
	     int i = 0;
	     
	     while (linha != null) {
	    	 i++;
	    	 if(linha.contains(texto)) {
	    		 System.out.println("linha: " + i + " conteúdo: " + linha);		 
	    	 } 
	    	 linha = lerArq.readLine();
	     }
	     
	     arqleitura.close();
	}
	
	
	public void atualizar(String name, String newname) throws IOException{
		//Atualizar
		FileReader arq = new FileReader("d:\\git.txt");
		BufferedReader lerArq = new BufferedReader(arq);
		
		
		String linha = lerArq.readLine(); 
		
		int i = 0;
		String oldName = "";
		
		ArrayList<String> list = new ArrayList();
		
		while(linha != null) {
			i++;
			if(linha.equals(name)) {
				list.add(linha);
				System.out.println(list);
				linha = lerArq.readLine();
			}else {
				System.out.println("Nenhum valor encontrado!");
			}
		}
		
		
		
		FileWriter arqgravar = new FileWriter("d:\\git.txt");
		PrintWriter gravarArq = new PrintWriter(arqgravar);
		
		for(int y = 0; y < list.size(); y++) {
			
			list.set(y, newname);
			
			gravarArq.println(list.get(y));
			
		}
		arqgravar.close();

	}

	public static void main(String args[]) throws Exception {
		App arq = new App();
		//arq.inserir("Texto");
		//arq.leitura("Texto");
		arq.atualizar("Texto", "Agora vai");
	}
	
}
