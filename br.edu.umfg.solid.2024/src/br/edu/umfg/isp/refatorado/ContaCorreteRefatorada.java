package br.edu.umfg.isp.refatorado;

public class ContaCorreteRefatorada
    extends AbstractConta
        implements IContaRefatorada{

    public ContaCorreteRefatorada(String nome,
                                  String documento) {
        super(nome, documento);
    }
}