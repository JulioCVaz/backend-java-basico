package etec.bancoetec;

public interface Conta {
	// Método criado na Interface Conta para representar o deposito do usuario passando o valor como paramêtro
	void deposita(double valor);
	// Método criado na Interface Conta para representar o saque do usuario passando o valor como paramêtro
	void saca(double valor);
	// Método para retornar o Saldo do usuario;
	double getSaldo();

}
