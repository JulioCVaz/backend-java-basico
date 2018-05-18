package br.edu.eteczl.mvn_web_app.aulareader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.util.Scanner;



public class App 
{
	public void inserir(String texto) throws IOException {
		//Gravação
		 FileWriter arq = new FileWriter("d:\\aulaetec.txt", true); // esse true é um outro parametro para nao reescrever
		 PrintWriter gravarArq = new PrintWriter(arq);
		 
		 gravarArq.println(texto); 

		 arq.close();
	}
	
	public void leitura(String texto) throws IOException {
		String resp;
		String newname;
		boolean wpt = true;
		
		//Leitura
		 FileReader arqleitura = new FileReader("d:\\aulaetec.txt");
		 BufferedReader lerArq = new BufferedReader(arqleitura);
	 
	     String linha = lerArq.readLine(); 
	     int i = 0;
	     
	     while (linha != null) {
	    	 i++;
	    	 if(linha.contains(texto)) {
	    		 System.out.println("linha: " + i + " conteúdo: " + linha);
	    		 
	    		 /*Scanner response = new Scanner(System.in);
	    		 System.out.println("Você deseja atualizar ou deletar ? (1 - att 2 - delete) : ");
	    		 resp = response.next();
	    		 
	    		 if(resp.equals("1")) {
	    			 Scanner att = new Scanner(System.in);
	    			 System.out.println("Digite o novo nome: ");
	    			 newname = att.next();
	    			 linha.replace(linha,newname);
	    			 
	    		 }else if(resp.equals("2")) {
	    			 linha.replace(linha,"-");
	    		 }else {
	    			 System.out.println("Valor invalido !");
	    		 }
	    		 
	    		 */
	    		 
	    	 } 
	    	 linha = lerArq.readLine();
	     }
	     
	     arqleitura.close();
	}
	
	
	public void atualizar(String name, String newname) throws IOException{
		
		FileWriter arqgravar = new FileWriter("d:\\aulaetec.txt");
		
		FileReader arq = new FileReader("d:\\aulaetec.txt");
		
		PrintWriter gravarArq = new PrintWriter(arqgravar, true);
		
		BufferedReader lerArq = new BufferedReader(arq);
		
		String linha = lerArq.readLine(); 
		int i = 0;
		String oldName = "";
		
		while(linha != null) {
			i++;
			
			if(linha.equals(name)) {
				linha = oldName + newname + "\n";
				gravarArq.println(linha);
				System.out.println("Encontrei");
			}else {
				System.out.println("diferente");
			}
			linha = lerArq.readLine();
			
		}
		arq.close();
		
	}

	public static void main(String args[]) throws Exception {
		App arq = new App();
		//arq.inserir("Jeferson");
		//arq.inserir("Teste");
		arq.atualizar("Teste", "Agora vai");
		//arq.leitura("Jeferson Roberto de Lima");
	}
	
}
