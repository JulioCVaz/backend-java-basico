package exercicios;

public class Exercicio17 {

	private int ladoa;
	private int ladob;
	private int ladoc;
	private int ladod;
	
	public int getLadoA() {
		return ladoa;
	}
	
	public void setLadoA(int ladoa) {
		this.ladoa = ladoa;
	}
	
	public int getLadoB() {
		return ladob;
	}
	
	public void setLadoB(int ladob) {
		this.ladob = ladob;
	}
	
	public int getLadoC() {
		return ladoc;
	}
	
	public void setLadoC(int ladoc) {
		this.ladoc = ladoc;
	}
	
	public int getLadoD() {
		return ladod;
	}
	
	public void setLadoD(int ladod) {
		this.ladod = ladod;
	}
	
	public void Verifica(int ladoa, int ladob, int ladoc, int ladod) {
		
		int array[] = {ladoa, ladob, ladoc, ladod};
		
		for(int i=0; i<array.length; i++) {
			System.out.println("medida de cada lado: " + array[i]);
		}
		
		if(ladoa == ladob && ladoc == ladod) {
			System.out.println("é um quadrado");
		}else {
			System.out.println("é um retangulo");
		}
		
				
	}
	
	
	public static void main (String[] args) {
		
		
		Exercicio17 teste = new Exercicio17();
		
		teste.setLadoA(2);
		teste.setLadoB(4);
		teste.Verifica(2, 2, 2, 2);
		
	}
}
