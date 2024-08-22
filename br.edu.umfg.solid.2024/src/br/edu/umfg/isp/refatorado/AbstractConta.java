package br.edu.umfg.isp.refatorado;

public class AbstractConta implements IContaRefatorada{
    private String nome;
    private String documento;
    private Double saldo = 0.0;

    public AbstractConta(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    @Override
    public void creditar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public void debitar(Double valor) {
        this.saldo -= valor;
    }

    @Override
    public Double getSaldo() {
        return this.saldo;
    }
}
