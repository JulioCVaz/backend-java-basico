package exercicio3;

public class CaixaEletronico {
	
	
	public static void main(String[] args) {
		ContaComum cm = new ContaComum();
		ContaEspecial ce = new ContaEspecial();
		
		cm.depositar(15);
		cm.sacar(5);
		System.out.println("Seu saldo atual: " + cm.saldo() + " (Conta Comum)");
		
		ce.depositar(10);
		ce.sacar(2);
		System.out.println("Seu saldo atual: " + ce.saldo() + " (Conta Especial)");
		
		
		
		
		
	}

}
