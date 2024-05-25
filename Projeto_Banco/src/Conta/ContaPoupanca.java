package Conta;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int conta, double saldo, Cliente cliente) {
        super(agencia, conta, saldo, cliente);
    }
    public void imprimirExtrato() {
        System.out.println("== Conta Poupança ==");
        Status();
    }
}