package Conta;

public interface AplicaçãoDigital{


    void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, AplicaçãoDigital contaDestino);
	
	void imprimirExtrato();
    
}
