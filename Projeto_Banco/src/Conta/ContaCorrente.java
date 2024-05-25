package Conta;

public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int conta, double saldo, Cliente cliente) {
        super(agencia, conta, saldo, cliente);
    }
    public void imprimirExtrato() {
        System.out.println("== Conta Corrente ==");
        Status();
	}
}
