package testeText;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class TextTeste {
	public static void main(String[] args) throws Exception{
		
		FileWriter arq = new FileWriter("d:\\teste.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		 
		 for(int i = 0; i <= 15; i++) {
			 gravarArq.println("valor " + i);
		 }
		 arq.close();
		 
		 FileReader arqReader = new FileReader("d:\\teste.txt");
		 
		 BufferedReader bufReader = new BufferedReader(arqReader);
		 
		 String line = bufReader.readLine();
		 
		 String[] myStringArray;
		 
		 int i = 0;
		 
		 while(line != null) {
			 //System.out.println(line);
			 i++;
			 //System.out.println(line);
			 if(line.equals("valor 1")) {
				 System.out.println("imprimi no primeiro if - " + line);
			 }
			 if(line.contains("1")) {
				 System.out.println(line);
			 }
			 line = bufReader.readLine(); // igual a i++;
		 }
		 bufReader.close();
		 
	}
}
