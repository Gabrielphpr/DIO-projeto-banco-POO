package Conta;
public abstract class Conta implements AplicaçãoDigital{

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;


    public Conta(int agencia, int conta, double saldo, Cliente cliente) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void sacar(double valor) {
		saldo -= valor;
	}

    @Override
	public void depositar(double valor) {
		saldo += valor;
	}

    

    @Override
    public void transferir(double valor, AplicaçãoDigital contaDestino){
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

    public void Status() {
        System.out.println("\nOlá, " + getCliente() + "\nNumero da agência: " + getAgencia() + "\nNumero da conta: "  + getConta() + "\nSeu saldo atual: " + getSaldo() + "\n");
	}
}
