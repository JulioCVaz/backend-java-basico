package exercicios;

public class Exercicio16 {
	
	private int ladoa;
	private int ladob;
	
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
	
	public void Calcula(int ladoa, int ladob) {
		int area= ladob* ladoa;
		System.out.println(ladoa);
		System.out.println(ladob);
		System.out.println("Lado A = " + getLadoA());
		System.out.println("Lado B = " + getLadoB());
		System.out.println("A área é = " + area);
	}

	public static void main(String[] args) {
		
		Exercicio16 quadrilatero = new Exercicio16();
		
		quadrilatero.setLadoA(10);
		quadrilatero.setLadoB(2);
		quadrilatero.Calcula(10, 2);
	}

}
