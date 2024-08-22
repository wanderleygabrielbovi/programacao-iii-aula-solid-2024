package br.edu.umfg.isp;

import br.edu.umfg.isp.legado.ContaCorrente;
import br.edu.umfg.isp.legado.ContaPoupanca;
import br.edu.umfg.isp.refatorado.ContaCorreteRefatorada;
import br.edu.umfg.isp.refatorado.ContaInvestimento;
import br.edu.umfg.isp.refatorado.ContaPoupancaRefatorada;
import br.edu.umfg.isp.refatorado.IContaRefatorada;

import java.util.ArrayList;

public class PrincipioDeSegregacaoDeInterfaces {
    public static void executarLegado(){
        ContaCorrente contaCorrente
                = new ContaCorrente("0001",
                "TESTE 1");
        contaCorrente.creditar(1000.00);
        contaCorrente.debitar(50.00);

        ContaPoupanca contaPoupanca
                = new ContaPoupanca("0002",
                "TESTE 2");
        contaPoupanca.creditar(500.00);
        contaPoupanca.creditar(50.00);

        System.out.println("SALDO CC: " + contaCorrente.getSaldo());
        System.out.println("SALDO CP: " + contaPoupanca.getSaldo());
    }

    public static void executarRefatorado(){
        ContaCorreteRefatorada contaCorreteRefatorada
                = new ContaCorreteRefatorada("TESTE 1",
                "0001");
        contaCorreteRefatorada.creditar(1000.00);
        contaCorreteRefatorada.debitar(50.00);


        ContaPoupancaRefatorada contaPoupancaRefatorada
                = new ContaPoupancaRefatorada("TESTE 2",
                "0002");
        contaPoupancaRefatorada.creditar(500.00);
        contaPoupancaRefatorada.creditar(50.00);

        ContaInvestimento contaInvestimento
                = new ContaInvestimento("TESTE 3",
                "0003");
        contaInvestimento.creditar(300.00);
        contaInvestimento.investir(150.00);
        contaInvestimento.debitar(55.00);

        /*System.out.println("SALDO CC: " + contaCorreteRefatorada.getSaldo());
        System.out.println("SALDO CP: " + contaPoupancaRefatorada.getSaldo());
        System.out.println("SALDO CI: " + contaInvestimento.getSaldo());*/

        ArrayList<IContaRefatorada> contas = new ArrayList<IContaRefatorada>();
        contas.add(contaCorreteRefatorada);
        contas.add(contaPoupancaRefatorada);
        contas.add(contaInvestimento);

        imprimir(contas);
    }

    private static void imprimir(ArrayList<IContaRefatorada> contas){
        contas.stream().forEach(x -> {
            System.out.println("SALDO: " + x.getSaldo());
        });
    }
}