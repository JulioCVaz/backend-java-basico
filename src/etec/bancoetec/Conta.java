package etec.bancoetec;

public interface Conta {
	// M�todo criado na Interface Conta para representar o deposito do usuario passando o valor como param�tro
	void deposita(double valor);
	// M�todo criado na Interface Conta para representar o saque do usuario passando o valor como param�tro
	void saca(double valor);
	// M�todo para retornar o Saldo do usuario;
	double getSaldo();

}
