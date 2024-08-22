package br.edu.umfg.isp.refatorado;

public class ContaPoupancaRefatorada
    extends AbstractConta
        implements IContaRefatorada{
    public ContaPoupancaRefatorada(String nome,
                                   String documento) {
        super(nome, documento);
    }
}
