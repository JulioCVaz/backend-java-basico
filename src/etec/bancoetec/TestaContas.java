package etec.bancoetec;

public class TestaContas {
	
	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente();
		
		ContaPoupanca c2 = new ContaPoupanca();
		
		c1.deposita(500);
		
		c2.deposita(500);
		
		c1.saca(100);
		
		c2.saca(100);
		
		System.out.println("\nSaldo conta Corrente " + c1.getSaldo() + "\n\n");
		
		System.out.println("Saldo conta Poupança " + c2.getSaldo() + "\n\n");
		
	}

}
