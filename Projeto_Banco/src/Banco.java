import java.util.List;

import Conta.Conta;

public class Banco {

    private String nome;
    private List<Conta> listaDeContas;

    public Banco(String nome, List<Conta> listaDeContas) {
        this.nome = nome;
        this.listaDeContas = listaDeContas;
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getListaDeContas() {
        return listaDeContas;
    }

    public void setListaDeContas(List<Conta> listaDeContas) {
        this.listaDeContas = listaDeContas;
    }
}
