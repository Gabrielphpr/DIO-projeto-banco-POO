import java.util.Scanner;

import Conta.Cliente;
import Conta.Conta;
import Conta.ContaCorrente;
import Conta.ContaPoupanca;

public class InterfaceCliente {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente("Gabriel");

        Conta conta1 = new ContaCorrente(1, 154, 10000, cliente);
        Conta conta2 = new ContaPoupanca(2, 204, 100, cliente);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
        
        System.out.println("\n-Depósito-\nPasse o quanto quer depositar: ");
        conta1.depositar(scanner.nextDouble());
        System.out.println("Saldo atual: " + conta1.getSaldo());

        System.out.println("\n-Saque-\nPasse o quanto quer sacar: ");
        conta1.sacar(scanner.nextDouble());
        System.out.println("Saldo atual: " + conta1.getSaldo());
        
        System.out.println("\n-Transferencia-\nPasse o quanto quer transferir: ");
        conta1.transferir(scanner.nextDouble(), conta2);
        System.out.println("Saldo atual: " + conta1.getSaldo());

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();

        scanner.close();
    }
}
